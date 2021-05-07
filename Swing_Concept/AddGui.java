package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddGui {
    public static void main(String[] args) {
        Addition add = new Addition();

    }
}
class Addition extends JFrame implements ActionListener{
    JButton jButton;
    JLabel jLabel;
    JTextField textField;
    JTextField textField1;
    public Addition(){

        textField=new JTextField(20);
        textField1=new JTextField(20);
        jButton=new JButton("OK");
        jLabel=new JLabel("Result");


        add(textField);
        add(textField1);
        add(jButton);
        add(jLabel);
        jButton.addActionListener(this);


        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae) {
        int num1=Integer.parseInt(textField.getText());
        int num2=Integer.parseInt(textField1.getText());
        int value=num1+num2;
        jLabel.setText(value+"");

    }

}
