package SchoolTesk.Class11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MoveBall extends JPanel implements ActionListener {
    private int x = 50; // 球的初始x坐标
    private int y = 50; // 球的初始y坐标
    private int radius = 25; // 球的半径
    private int dx; // x方向的移动步长
    private int dy; // y方向的移动步长
    private Color ballColor; // 球的颜色
    private Timer timer; // 定时器

    public MoveBall() {
        // 设置初始颜色为红色
        ballColor = Color.RED;

        // 随机生成初始移动步长
        Random random = new Random();
        dx = random.nextInt(21) - 10; // [-10, 10]之间的随机数
        dy = random.nextInt(21) - 10; // [-10, 10]之间的随机数

        // 创建定时器，每隔1000毫秒（1秒）调用一次actionPerformed方法
        timer = new Timer(1000 / 60, this); // 60 FPS
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(ballColor);
        g.fillOval(x - radius, y - radius, radius * 2, radius * 2); // 绘制球
    }

    public void moveBall() {
        // 更新球的位置
        x += dx;
        y += dy;

        // 碰撞检测，反弹墙壁
        if (x - radius < 0 || x + radius > getWidth()) {
            dx = -dx; // 反转x方向
        }
        if (y - radius < 0 || y + radius > getHeight()) {
            dy = -dy; // 反转y方向
        }

        // 重新绘制球
        repaint();
    }

    public void changeColor() {
        // 随机改变颜色
        Random random = new Random();
        int colorChoice = random.nextInt(3);
        switch (colorChoice) {
            case 0:
                ballColor = Color.RED;
                break;
            case 1:
                ballColor = Color.GREEN;
                break;
            case 2:
                ballColor = Color.BLUE;
                break;
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBall();
        changeColor();
    }
}
