package shiyan.yhy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo6 extends JFrame implements ActionListener {
    private JButton[] button;
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};
    private String[] BorderStrings = {"North"
            , "South", "West", "East", "Center"};
    public Demo6(){
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(new BorderLayout());
//    setLayout(new FlowLayout(FlowLayout.LEFT));
//    setLayout(new GridLayout(2, 3));
        initCom();
        setVisible(true);
    }

    public JButton[] getButtons(){
        return button;
    }

    public void initCom(){
        button = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(strings[i]);
            this.add(button[i], BorderStrings[i]);
            button[i].addActionListener(this);//在组件上加监听器。方法的参数就是监听器对象
        }

    }

    public void addBorder(){
        for (int i = 0; i < 5; i++) {
            this.add(button[i], BorderStrings[i]);
        }

    }
    //
    public static void main(String[] args) {
        new Demo6();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == button[0]){//getSource得到发生事件的事件源
            setLayout(new FlowLayout(FlowLayout.LEFT));
        }else{
            if(arg0.getSource() == button[1]){
                setLayout(new FlowLayout(FlowLayout.RIGHT));
            }else{
                if(arg0.getSource() == button[2]){
                    setLayout(new FlowLayout(FlowLayout.CENTER));
                }else{
                    if(arg0.getSource() == button[3]){
                        setLayout(new GridLayout(2, 3));
                    }else{
                        if(arg0.getSource() == button[4]){
                            setLayout(new BorderLayout());
                            addBorder();
                        }
                    }
                }
            }
        }
        validate();//让当前的界面无效

    }
}


