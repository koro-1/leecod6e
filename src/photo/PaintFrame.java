package photo;

import java.awt.Graphics;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class PaintFrame extends JFrame implements Runnable {
    private ImageIcon[] imageIcon = {new ImageIcon("src/photo/cat.jpg"),
            new ImageIcon("src/photo/cat.jpg"),
    };
    private int x = 10;
    private int i = 0;
    private boolean flag = true;

    public PaintFrame() {
        // TODO Auto-generated constructor stub
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("滚动新闻");
        setLayout(null);
        Thread thread = new Thread(this);
        thread.start();
        setVisible(true);
    }

    @Override
    /**
     * 画图形
     * 界面生成时会自动调用
     * Graphics:画图形的类
     */
    public void paint(Graphics arg0) {
        // TODO Auto-generated method stub
        super.paint(arg0);
        arg0.drawLine(0, 400, 800, 400);
        arg0.drawRect(100, 100, 200, 200);
//		arg0.drawString("欢迎大家进入JAVA世界", x, 390);

        imageIcon[i].paintIcon(this, arg0, x, 360);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {

            if (flag) {
                x = x + 20;
                i = (i + 1) % 2;
                if (x > 760) {
                    /*  x = 10;*/
                    flag = false;
                }

            } else {
                x = x - 20;
                i = (i + 1) % 2;
                if (x < 10) {
                    /*  x = 10;*/
                    flag = true;


                }
                repaint();//调用paint方法
                try {
                    Thread.sleep(150);//休眠
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }


    }

    public static void main(String[] args) {
      /*  new PaintFrame();*/
        String string="D:/";
        File file=new File(string);
        if (file.exists()){
            String []list=file.list();
            for (int i = 0; i < list.length; i++) {
                string=string+File.separator+list[i];
                File file2=new File(string);
                if (file2.isDirectory()){
                    System.out.println(string+"是文件夹");
                }else {


                    System.out.println(string+"是文件");
                }


            }


        }else {
            System.out.println("文件不存在");
            file.mkdir();
        }

    }
}
