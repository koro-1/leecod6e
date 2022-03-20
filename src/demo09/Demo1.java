package demo09;

import javax.swing.*;
import java.awt.*;

public class Demo1 extends JFrame {
    private ImageIcon imageIcon = new ImageIcon("src/resources/HELP.jpg");

    public static void main(String[] args) {
        new Demo1();
    }

    public Demo1() {
        // TODO Auto-generated constructor stub
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("滚动新闻");
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void paint(Graphics arg0) {
        // TODO Auto-generated method stub
        super.paint(arg0);
        arg0.drawLine(0, 400, 800, 400);
        arg0.drawRect(100, 100, 200, 200);
        arg0.drawString("欢迎大家进入JAVA世界", 10, 390);
        imageIcon.paintIcon(this, arg0, 300, 300);
    }

}

