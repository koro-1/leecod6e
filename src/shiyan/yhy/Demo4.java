package shiyan.yhy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo4 extends JFrame implements ActionListener {
    private JButton[] button;
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};
    private String[] BorderStrings = {"North"
            , "South", "West", "East", "Center"};
    public Demo4(){
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(new BorderLayout());
        initCom();
        setVisible(true);
    }

    public void initCom(){
        button = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(strings[i]);
            this.add(button[i], BorderStrings[i]);
            button[i].addActionListener(this);//在组件上加监听器。方法的参数就是监听器对象
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "为什么点击我");
    }

    public static void main(String[] args) {
        new Demo4();
    }
}


