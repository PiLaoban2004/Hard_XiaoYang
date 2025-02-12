package SchoolTesk.Class12.Server;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class ServerReceive extends Thread{
    Socket client;
    boolean isRun=true;
    DataInputStream dis;
    InputStream in;
    byte[] data;
    String msg;
    UI ui;
    public ServerReceive(Socket client,UI ui){
        this.client=client;
        this.ui=ui;
        this.start();
    }
    public void run(){
        if (client!=null){
            try {
                while (isRun){
                    msg="";
                    in=client.getInputStream();
                    dis=new DataInputStream(in);
                    byte[] data=new byte[1024];
                    int bytesRead=dis.read(data);
                    if (bytesRead>0){
                        msg=new String(data);
                        ui.jta.append("\n收到>>"+client.getInetAddress().getHostAddress()+msg);
                    }
                }
            }catch (Exception e){
                ui.jta.append("接收消息时出错: " + e.getMessage());
                isRun = false;
            }
        }else {
            isRun=false;
        }
    }
}
