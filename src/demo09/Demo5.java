package demo09;

import javax.swing.*;
import java.awt.*;

public class Demo5 extends JFrame implements Runnable {
    private ImageIcon[] imageIcon = {new ImageIcon("src/demo09/CAT1.gif"),
            new ImageIcon("src/demo09/CAT2.gif"),
    };
    private int x = 10;
    private int i = 0;
    private boolean flag = false;

    public Demo5() {
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("滚动新闻");
        setLayout(null);
        Thread thread = new Thread(this);
        thread.start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo5();
    }

    @Override
    public void paint(Graphics arg0) {
        super.paint(arg0);
        arg0.drawLine(0, 400, 800, 400);
        arg0.drawRect(100, 100, 200, 200);
        imageIcon[i].paintIcon(this, arg0, x, 360);
    }

    @Override
    public void run() {
        while (true) {
            if (flag){
                x -= 20;
            } else {
                x += 20;
            }

            i = (i + 1) % 2;
            if(x >= 760){
                x -= 20;
                imageIcon = new ImageIcon[]{new ImageIcon("src/resources/cat3.gif"),
                        new ImageIcon("src/resources/cat4.gif"),
                };
                flag = true;
            }
            if (x < 10){
                x += 20;
                imageIcon = new ImageIcon[]{new ImageIcon("src/resources/cat1.gif"),
                        new ImageIcon("src/resources/cat2.gif"),
                };
                flag = false;
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

