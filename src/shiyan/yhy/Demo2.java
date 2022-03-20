package shiyan.yhy;

import javax.swing.*;

public class Demo2 extends JFrame {
    private JButton button;
    public Demo2(){
        this.setLocation(200, 100);//设置组件的原点
        button = new JButton("提交");
        this.add(button);//将按键加入到顶层容器中
        button.setBounds(100, 100, 80, 50);
        this.setBounds(100, 100, 800, 600);
        this.setLayout(null);//设置布局管理器
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);//关闭窗口的操作
        this.setVisible(true);//让组件可见
    }

    public static void main(String[] args) {
        new Demo2();
    }
}

