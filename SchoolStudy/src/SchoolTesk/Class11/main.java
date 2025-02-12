package SchoolTesk.Class11;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        MoveBall moveBall=new MoveBall();

        frame.setSize(640,480);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(moveBall);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
