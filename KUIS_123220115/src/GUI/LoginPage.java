
package GUI;

import java.awt.event.*;
import javax.swing.*;

class FormLoginPage extends JFrame implements ActionListener {
    JLabel labelLogin = new JLabel("Silahkan Login");
    JLabel labelInfoLogin = new JLabel("");
    JLabel labelUsername = new JLabel("Username : ");
    final JTextField username = new JTextField("Masukan username",15);
    JLabel labelPassword = new JLabel("Password : ");
    final JPasswordField password = new JPasswordField(15);
    JButton btnLogin = new JButton("Login");
    JButton btnCancel = new JButton("Reset");
    
    public FormLoginPage(String judul){
        setTitle(judul);
        btnLogin.addActionListener(this);
        btnCancel.addActionListener(this);
        setLayout(null);
        add(labelLogin);
        add(labelInfoLogin);
        add(labelUsername);
        add(username);
        add(labelPassword);
        add(password);
        add(btnLogin);
        add(btnCancel);
        setSize(350,200);
        setDefaultCloseOperation(3);
        setVisible(true);
        
        labelLogin.setBounds(10,10,150,20);
        labelUsername.setBounds(10,40,120,20);
        username.setBounds(130,40,150,20);
        labelPassword.setBounds(10,70,120,20);
        password.setBounds(130,70,150,20);
        btnLogin.setBounds(50,110,90,20);
        btnCancel.setBounds(150,110,90,20);  
        labelInfoLogin.setBounds(10,140,200,20); 
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnLogin){
            String usrname = username.getText();
            String passwrd = password.getText();
            if(usrname.equals("tukang_115")&& passwrd.equals("tukang_115")){
                HitungSiku a = new HitungSiku("HitungSiku");
                this.dispose();
            }else{
                labelInfoLogin.setText("Username atau Password Salah");
                
            }
        }if(e.getSource() == btnCancel){
            username.setText("");
            password.setText("");
            labelInfoLogin.setText("");
        }
    }   
}

public class LoginPage {
    public static void main(String[] args) {
        FormLoginPage login = new FormLoginPage("Login Page");   
    }
}