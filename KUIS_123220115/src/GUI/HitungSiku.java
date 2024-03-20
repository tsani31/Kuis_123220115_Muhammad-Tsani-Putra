

package GUI;

import java.awt.event.*;
import javax.swing.*;

public class HitungSiku extends JFrame implements ActionListener{
    JLabel header = new JLabel("Menghitung Panjang Sisi Miring Segitiga");
    JLabel labelAlas = new JLabel("Masukan Alas(cm)   : ");
    JTextField alas = new JTextField("Masukan alas..",10);
    JLabel labelTinggi = new JLabel("Masukan Tinggi(cm) : ");
    JTextField tinggi = new JTextField("Masukan tinggi..",10);
    JButton btnHitung = new JButton("Hitung");
    JButton btnReset = new JButton("Reset");
    JLabel labelHasil = new JLabel("Panjang Sisi Miring : "); 
    
    public HitungSiku(String Judul){
        setSize(400,300);
        setDefaultCloseOperation(3);
        setLayout(null);
        add(header);
        add(labelAlas);
        add(alas);
        add(labelTinggi);
        add(tinggi);
        add(btnHitung);
        add(btnReset);
        add(labelHasil);
        
        btnHitung.addActionListener(this);
        btnReset.addActionListener(this);
        
        header.setBounds(10,10,150,20);
        labelAlas.setBounds(10,40,160,20);
        alas.setBounds(170,40,200,20);
        labelTinggi.setBounds(10,70,160,20);
        tinggi.setBounds(170,70,200,20);
        labelHasil.setBounds(10,110,200,20);
        btnHitung.setBounds(170,140,90,20);
        btnReset.setBounds(280,140,90,20);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnHitung){
            String getAlas = alas.getText();
            String getTinggi = tinggi.getText();
            Integer doubleAlas = Integer.parseInt(getAlas);
            Integer doubleTinggi = Integer.parseInt(getTinggi);
            double c = Math.sqrt(Math.pow(doubleAlas,2)+ Math.pow(doubleTinggi,2));
            labelHasil.setText("Panjang Sisi Miring   :   "+c);
        }
        
        if(e.getSource() == btnReset){
            alas.setText("");
            tinggi.setText("");
            labelHasil.setText("Panjang Sisi Miring : ");
            
        }
    }
}
