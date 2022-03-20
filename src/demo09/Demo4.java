package demo09;

import javax.swing.*;
import java.awt.*;

public class Demo4 extends JFrame implements Runnable {
    private ImageIcon imageIcon = new ImageIcon("src/resources/HELP.jpg");
    private int x = 10;

    public Demo4() {
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("滚动新闻");
        setLayout(null);
        Thread thread = new Thread(this);
        thread.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo4();
    }

    @Override
    public void paint(Graphics arg0) {
        super.paint(arg0);
        arg0.drawLine(0, 400, 800, 400);
        arg0.drawRect(100, 100, 200, 200);
        arg0.drawString("欢迎大家进入JAVA世界", x, 390);
        imageIcon.paintIcon(this, arg0, x, 300);
    }

    @Override
    public void run() {
        while (true) {
            x = x + 10;
            if(x > 760){
                x = 10;
            }
            repaint();
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

