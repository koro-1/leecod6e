import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;

public class First extends JFrame implements ActionListener {
    private JButton[] button;
    private String[] strings = {"流式左", "流式右", "流式居中", "网络", "边界"};
    private String[] borderString = {"North", "South", "West", "East", "Center"};

    public First() {
//        button = new JButton("提交");
//        this.add(button);//将按钮加入到顶层容器中
        this.setBounds(100, 100, 800, 600);
        //如果有布局管理器，则setBounds无效
        //关闭布局管理器
//        this.setLayout(new GridLayout(2,3,50,10));
//        this.setSize(800, 600);
        this.setDefaultCloseOperation(HIDE_ON_CLOSE);
        this.setTitle("主界面");
        this.setLayout(new BorderLayout());
//        this.setLocation(300, 100);
//        this.setBounds(100, 100, 800, 600);
        initCom();
        this.setVisible(true);
    }
     public  void  addBorder(){
         for (int i = 0; i <button.length ; i++) {
              this.add(button[i],borderString[i]);

         }

     }
    public void initCom() {
        button = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(strings[i]);
            this.add(button[i], borderString[i]);//将按钮加入到顶层容器中
            button[i].addActionListener(this);

        }
//        this.add(button[0],"West");
//        this.add(button[1],"East");
//        button.setBounds(100,100,80,50);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (button[0].equals(source)) {
           setLayout(new FlowLayout(FlowLayout.LEFT));


        } else if (button[1].equals(source)) {
            System.out.println("2");
        }
        else if (button[2].equals(source)) {
            System.out.println("2");
        }
        else if (button[3].equals(source)) {
            System.out.println("2");
        }
        else  {
            System.out.println("2");
        }
        validate();
    }
}
