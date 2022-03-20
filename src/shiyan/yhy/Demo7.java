package shiyan.yhy;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo7 extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton[] button;
    private String[] strings = {"流式左", "流式右", "流式居中", "网格", "边界"};
    private String[] BorderStrings = {"North"
            , "South", "West", "East", "Center"};

    private JMenuBar menuBar;
    private JMenu[] menu;
    private JMenuItem[] menuItems;

    public Demo7() {
        this.setBounds(100, 100, 800, 600);
        setDefaultCloseOperation(HIDE_ON_CLOSE);
        setLayout(null);
//    setLayout(new FlowLayout(FlowLayout.LEFT));
//    setLayout(new GridLayout(2, 3));
        initCom();
        initMenu();
        setVisible(true);
    }

    /**
     * 初始化菜单
     */
    public void initMenu() {
        menuBar = new JMenuBar();
        menu = new JMenu[2];
        menu[0] = new JMenu("操作");
        menu[1] = new JMenu("帮助");
        menuItems = new JMenuItem[5];
        for (int i = 0; i < menuItems.length; i++) {
            menuItems[i] = new JMenuItem(strings[i]);
            menu[0].add(menuItems[i]);
            menuItems[i].addActionListener(this);
        }
        menuBar.add(menu[0]);
        menuBar.add(menu[1]);
        this.add(menuBar);
        menuBar.setBounds(0, 0, 800, 30);
    }

    public JButton[] getButton() {
        return button;
    }

    public void initCom() {
        panel = new JPanel();
        panel.setBounds(0, 30, 800, 530);
        this.add(panel);
        button = new JButton[5];
        for (int i = 0; i < button.length; i++) {
            button[i] = new JButton(strings[i]);
            panel.add(button[i], BorderStrings[i]);
            button[i].addActionListener(this); //组件上加监听器，参数为监听器对象
        }

    }

    public void addBorder() {
        for (int i = 0; i < 5; i++) {
            panel.add(button[i], BorderStrings[i]);
        }

    }

    @Override
    /**
     * 当发生了点击事件，就会自动调用此方法
     * arg0:事件
     */
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        if(arg0.getSource() == button[0]
                || arg0.getSource() == menuItems[0]){//getSource获取事件源
            panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        }else{
            if(arg0.getSource() == button[1]
                    || arg0.getSource() == menuItems[1]){
                panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
            }else{
                if(arg0.getSource() == button[2]
                        || arg0.getSource() == menuItems[2]){
                    panel.setLayout(new FlowLayout(FlowLayout.CENTER));
                }else{
                    if(arg0.getSource() == button[3]
                            || arg0.getSource() == menuItems[3]){
                        panel.setLayout(new GridLayout(2, 3));
                    }else{
                        if(arg0.getSource() == button[4]
                                || arg0.getSource() == menuItems[4]){
                            panel.setLayout(new BorderLayout());
                            addBorder();
                        }
                    }
                }
            }
        }
        validate();//让当前界面无效

    }

    public static void main(String[] args) {
        new Demo7();
    }
}


