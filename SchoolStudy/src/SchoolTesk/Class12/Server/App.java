package SchoolTesk.Class12.Server;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.Vector;

public class App extends Thread {
    ServerSocket server;
    UI ui;
    int port;
    boolean isServer = true;
    Vector vector;

    public App(UI ui) {
        this.ui = ui;
        vector = new Vector();
    }

    public void startServer() {
        try {
            ui.jta.append("\n服务器启动中");
            port = Integer.parseInt(ui.tfPort.getText());
            server = new ServerSocket(port);
            ui.jta.append("\n服务器启动完成,端口："+port);

            while (isServer) {
                Socket client = server.accept();
                ui.jta.append("\n发现客户端："
                        + Arrays.toString(client.getInetAddress().getAddress()));
                ServerReceive sr = new ServerReceive(client, ui);
                vector.add(sr);
                ui.jta.append("\n当前客户端总数：" + vector.size());
            }
        } catch (IOException e) {
            ui.jta.append("\n服务器错误："+e.getMessage());
        }finally {
            try {
                if (server!=null&&!server.isClosed()){
                    server.close();//关闭服务器Socket
                }
            }catch (IOException e){
                ui.jta.append("\n关闭服务器时出错："+e.getMessage());
            }
        }
    }

    public void sendAllMsg() {
        new Thread(() -> {
            String msg = ui.tfMsg.getText();
            if (!msg.isEmpty()) {
                for (int i = 0; i < vector.size(); i++) {
                    ServerReceive temp = (ServerReceive) vector.elementAt(i);
                    if (temp.isRun && temp.client != null) {
                        try{
                            DataOutputStream dos=new DataOutputStream(temp.client.getOutputStream());
                            dos.writeUTF(msg);
                            dos.flush();
                        }catch (Exception e){
                            ui.jta.append("\n发送消息给客户端出错："+e.getMessage());
                            temp.isRun=false;
                            vector.remove(temp);//移除无效的连接
                        }
                    }
                }
            }
        }).start();
    }
    public void run(){
        this.startServer();
    }
}
