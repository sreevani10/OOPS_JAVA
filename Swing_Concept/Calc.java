package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc {
    public static void main(String[] args) {
        AddSub addSub= new AddSub();

    }
}
class AddSub extends JFrame implements ActionListener {
    JTextField tf1,tf2;
    JButton b1,b2;
    JLabel l1;

     public AddSub() {

         tf1 = new JTextField(14);
         tf2 = new JTextField(14);
         b1 = new JButton("Add");
         b2 = new JButton("Sub");
         l1 = new JLabel("Result");

         add(tf1);
         add(tf2);
         add(b1);
         add(b2);
         add(l1);


         b1.addActionListener(this);
         b2.addActionListener(this);
         setLayout(new FlowLayout());
         setVisible(true);
         setSize(400, 400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public void actionPerformed( ActionEvent e) {
        int num1=Integer.parseInt(tf1.getText());
        int num2= Integer.parseInt(tf2.getText());
        int value=0;

        if(e.getSource()==b1)
            value=num1+num2;
        else
            value=num1-num2;

        l1.setText(value+"");
     }
}

