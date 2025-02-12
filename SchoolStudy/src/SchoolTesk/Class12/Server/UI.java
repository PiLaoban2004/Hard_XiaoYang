package SchoolTesk.Class12.Server;

import javax.swing.*;

public class UI extends JFrame {
    JTextArea jta;
    JButton btnStart ,btnSend;
    JTextField tfPort,tfMsg;
    App app;
    public UI(){
        this.setTitle("服务器端");
        this.setSize(640,480);
        this.initFrame();
        this.setVisible(true);
    }

    public void initFrame() {
        jta=new JTextArea();
        JScrollPane jsp=new JScrollPane(jta);
        this.add(jsp);
        JPanel panel=new JPanel();
        btnStart=new JButton("启动服务器");
        btnSend=new JButton("发送消息");
        tfPort=new JTextField("9988");
        tfMsg=new JTextField(30);
        panel.add(btnStart);
        panel.add(new JLabel("端口："));
        panel.add(tfPort);
        panel.add(new JLabel("消息"));
        panel.add(tfMsg);
        panel.add(btnSend);
        this.add(panel,"South");

        //给两个按钮添加动作事件
        btnStart.addActionListener(
                e -> {
                    //启动服务器
                    app=new App(UI.this);
                    app.start();
                }
        );
        btnSend.addActionListener(
                e -> {
                    //发送消息
                    if (app!=null){
                        app.sendAllMsg();
                    }
                }
        );
    }
}
