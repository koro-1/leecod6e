package shiyan.yhy;

import javax.swing.*;
import java.awt.*;

public class Demo3 extends JFrame {
    private JButton[] button;
    private String[] strings= {"流式左", "流式右", "流式居中", "网格", "边界"};
    private String[] borderStrings = {"North", "South", "West", "East", "Center"};
    public Demo3(){
        this.setBounds(100, 100, 800, 600);
        this.setTitle("主界面");
        this.setLayout(new BorderLayout());
        initCom();
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//关闭窗口的操作
        this.setVisible(true);//让组件可见
    }

    public void initCom(){
        button = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(strings[i]);
            this.add(button[i], borderStrings[i]);//将按键加入到顶层容器中
        }
    }

    public static void main(String[] args) {
        new Demo3();
    }
}


