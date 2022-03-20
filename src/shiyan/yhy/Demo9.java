package shiyan.yhy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo9 extends JFrame implements ActionListener {
    private JLabel userLabel;
    private JLabel pwdLabel;
    private JTextField userTextField;
    private JPasswordField pwdTextField;
    private JButton okButton;
    private JButton cancelButton;


    public Demo9() {
        // TODO Auto-generated constructor stub
        this.setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        initCom();
        setVisible(true);
    }

    public void initCom(){
        userLabel = new JLabel("用户名:");
        userLabel.setBounds(100, 70, 50, 30);
        pwdLabel = new JLabel("密    码:");
        pwdLabel.setBounds(100, 100, 50, 30);
        add(userLabel);
        add(pwdLabel);
        userTextField = new JTextField("请输入用户名");
        userTextField.setBounds(160, 70, 100, 30);
        pwdTextField = new JPasswordField();
        pwdTextField.setEchoChar('#');//改密码显示字符
        pwdTextField.setBounds(160, 100, 100, 30);
        add(userTextField);
        add(pwdTextField);
        okButton = new JButton("提交");
        cancelButton = new JButton("重置");
        okButton.setBounds(100, 200, 70, 40);
        cancelButton.setBounds(200, 200, 70, 40);
        add(okButton);
        add(cancelButton);
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        if(arg0.getSource() == cancelButton){
            userTextField.setText("");
            pwdTextField.setText("");
        }else{
            if (arg0.getSource() == okButton) {
                if(userTextField.getText().equals("")
                        || pwdTextField.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "用户名和密码不能为空！");
                }else{
                    if(userTextField.getText().equals("nakiri")
                            && pwdTextField.getText().equals("123")){
                        new Demo8();
                        this.dispose();
                    }else{
                        JOptionPane.showMessageDialog(null, "用户名和密码错误！");
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        new Demo9();
    }
}
