package SchoolTesk.Class12.Client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class App extends Thread {
    Socket client;
    UI ui;
    String ip;
    int port;
    DataInputStream dis;
    InputStream in;
    String msg;
    boolean isRun = true;

    public App(UI ui) {
        this.ui = ui;
        intNet();
    }

    public void run() {
        while (isRun) {
            receiveMsg();
        }
    }

    //初始化网络数据
    public void intNet() {
        try {
            ui.jta.append("客户端启动中......\n");
            ip = ui.jf_ip.getText();
            port = Integer.parseInt(ui.jf_port.getText());
            if (ip.length() != 0 && port > 0) {
                client = new Socket(ip, port);//尝试连接服务器
                    ui.jta.append("发现服务器,开始通信。\n");
                    this.start();//启动接收消息的线程
            }
        } catch (Exception e) {
            ui.jta.append("无法连接到服务器："+e.getMessage()+"\n");
        }
    }

    //发送网络数据
    public void sendMsg() {
        if (client != null) {
            try {
                DataOutputStream dos=new DataOutputStream(client.getOutputStream());
                String temp = ui.jf_msg.getText();
                if (temp.length() != 0) {
                    dos.writeUTF(temp);//发送UTF格式字符串
                    dos.flush();
                }
            } catch (Exception e) {
                ui.jta.append("发送消息时出错："+e.getMessage()+"\n");
            }
        }
    }

    //接收网络数据
    public void receiveMsg() {
        try {
            if (client!=null){
                in=client.getInputStream();
                dis=new DataInputStream(in);
                byte[] data=new byte[1024];
                int byteRead=dis.read(data);//返回读取到的字节数
                if (byteRead>0){
                    msg=new String(data,0,byteRead);//只转换有效数据部分
                    ui.jta.append("\n Receive>>"+msg);
                }
            }
        }catch (Exception e) {
            ui.jta.append("接受消息时出错："+e.getMessage()+"\n");
        }
    }
}
