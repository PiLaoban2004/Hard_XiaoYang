package SchoolTesk.Class12.Client;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI extends JFrame {
    JTextField jf_ip, jf_port, jf_msg;
    JTextArea jta;
    JLabel lb_ip, lb_port, lb_msg;
    JButton btnSend;
    App app;

    public UI() {
        this.setSize(640, 480);
        this.setTitle("客户端");
        initFrame();
        this.setVisible(true);
        app = new App(UI.this);
    }

    public void initFrame() {
        jta = new JTextArea();
        JScrollPane jsp = new JScrollPane(jta);
        this.add(jsp);
        JPanel panel = new JPanel();
        jf_ip = new JTextField("127.0.0.1");
        jf_port = new JTextField("9988");
        jf_msg = new JTextField(35);

        lb_ip = new JLabel("IP:");
        lb_port = new JLabel("Port:");
        lb_msg = new JLabel("Message:");
        btnSend = new JButton("发送消息");

        panel.add(lb_ip);
        panel.add(jf_ip);
        panel.add(lb_port);
        panel.add(jf_port);
        panel.add(lb_msg);
        panel.add(jf_msg);
        panel.add(btnSend);
        this.add(panel, "South");

        ////发送消息按钮添加响应事件
        btnSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //获取消息文本框内容
                String msg = jf_msg.getText();
                if (msg.length() != 0) {
                    //连接网络,发送消息
                    if (app != null) {
                        app.sendMsg();
                    }
                    //将消息文本框 内容清空
                    jf_msg.setText("");
                }
            }
        });
    }
}
