package shixun;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

@SuppressWarnings("serial")
class Login extends JFrame implements ActionListener{

   /* private JMenuBar menuBar;
    private JMenu[] menu;
    private JMenuItem[] menuItems;
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};*/
   JMenuBar menuBar = new JMenuBar();

    JMenu mnuPhoto = new JMenu();
    JMenu mnuPhoto2 = new JMenu();
    JMenuItem mnui1,mnui2,mnui3,mnui4,mnui5,mnui6,mnui7,mnui8;
    JMenuItem []items={mnui1,mnui2,mnui3,mnui4,mnui5,mnui6,mnui7,mnui8};



    private JToolBar toolBar;
    private JButton[] imgButtons;
    private ImageIcon[] imgs = {
            new ImageIcon("src/photo/cat.jpg"), new ImageIcon("cut.jpg")
            , new ImageIcon("我是猪"), new ImageIcon("help.jpg")
            , new ImageIcon("new.jpg")
    };

    JPanel panel;
    JLabel label,label2;
    JButton loginButton,exitButton;
    JTextField jTextField;
    JPasswordField passwordField;





    public Login() {
        this.setTitle("用户登录界面");
        this.setSize(500,500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));//设置为流式布局
        label = new JLabel("用户名");
        label2 = new JLabel("密码");
        loginButton = new JButton("登录");
        loginButton.addActionListener(this);//监听事件
        exitButton = new JButton("退出");
        exitButton.addActionListener(this);//监听事件
        jTextField = new JTextField(16);//设置文本框的长度
        passwordField = new JPasswordField(16);//设置密码框

        panel.add(label);//把组件添加到面板panel
        panel.add(jTextField);
        panel.add(label2);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(exitButton);

        this.add(panel);//实现面板panel

        this.setVisible(true);//设置可见

    }
    private void loadMenu()
    {
       /* mnui1=new JMenuItem();
        mnui2=new JMenuItem();
        mnui3=new JMenuItem();
        mnui4=new JMenuItem();
        mnui5=new JMenuItem();
        mnui6=new JMenuItem();
        mnui7=new JMenuItem();
        mnui8=new JMenuItem();*/
        for (int i = 0; i < items.length; i++) {
              items[i]=new JMenuItem();
              items[i].addActionListener(this);
        }

        mnui1=new JMenuItem();
        mnui2=new JMenuItem();
        mnui3=new JMenuItem();
        mnui4=new JMenuItem();
        mnui5=new JMenuItem();
        mnui6=new JMenuItem();
        mnui7=new JMenuItem();
        mnui8=new JMenuItem();
        System.out.println(mnui1);
        mnuPhoto.setText("管理农户");
        mnuPhoto2.setText("管理农田");
        mnui1.setText("分配农田");
        mnui2.setText("增加农田");
        mnui3.setText("修改农田信息");
        mnui4.setText("删除农田");
        mnui5.setText("增加农户");
        mnui6.setText("修改农户信息");
        mnui7.setText("删除农户");
        mnui8.setText("农户列表");

        menuBar.add(mnuPhoto);
        menuBar.add(mnuPhoto2);

        mnuPhoto.add(mnui1);
        mnuPhoto.add(mnui2);
        mnuPhoto.add(mnui3);
        mnuPhoto.add(mnui4);
        mnuPhoto2.add(mnui5);
        mnuPhoto2.add(mnui6);
        mnuPhoto2.add(mnui7);
        mnuPhoto2.add(mnui8);
    mnui1.addActionListener(this);
    mnui2.addActionListener(this);
    mnui3.addActionListener(this);
    mnui4.addActionListener(this);
    mnui5.addActionListener(this);
    mnui6.addActionListener(this);
    mnui7.addActionListener(this);
    mnui8.addActionListener(this);

    }

    @SuppressWarnings("deprecation")
    @Override
    public void actionPerformed(ActionEvent e) {//处理事件
        // TODO Auto-generated method stub

        if (e.getSource()==loginButton) {
            if (jTextField.getText().contains("") && passwordField.getText().contains("")) {//如果文本框包含abc并且密码框包含123则登录成功，否则登录失败
                JOptionPane.showMessageDialog(null,"登录成功！" );
                this.setSize(800,800);
                panel.remove(label);//把组件添加到面板panel
                panel.remove(jTextField);
                panel.remove(label2);
                panel.remove(passwordField);
                panel.remove(loginButton);
                panel.remove(exitButton);
                this.setJMenuBar(menuBar);
                this.setLayout(null);
                this.loadMenu();



            }else {
                JOptionPane.showMessageDialog(null, "用户名或密码错误！");
            }
            if (e.getSource()==exitButton) {
                System.exit(0);
            }

        }
        if (e.getSource()==mnui8){


            System.out.println("展示农户列表");
        }
    }
}

public class Demo_01 {
    public static void main(String[] args) {
        new Login();//调用login方法

    }
}

