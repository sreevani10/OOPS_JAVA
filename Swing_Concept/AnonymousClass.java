package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnonymousClass {
    public static void main(String[] args) {
        Add  add=new Add();
    }
}
class Add extends JFrame{
    JTextField tf,tf1 ;
    JButton b ;
    JLabel l ;
    public Add(){
        tf = new JTextField(20);
        tf1 = new JTextField(20);
        b = new JButton("OK");
        l = new JLabel("Result");


        add(tf);
        add(tf1);
        add(b);
        add(l);

      /* (1) ActionListener al = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int num1=Integer.parseInt(tf.getText());
                int num2=Integer.parseInt(tf1.getText());
                int value=num1+num2;
                l.setText(value+"");
            }
        };
        b.addActionListener(al); (1)  */

      /* (2)  b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {        (using ANONYMOUS cLASS)

                int num1=Integer.parseInt(tf.getText());
                int num2=Integer.parseInt(tf1.getText());
                int value=num1+num2;
                l.setText(value+"");
            }
        });   (2)   */

        b.addActionListener(e ->
        {
            int num1=Integer.parseInt(tf.getText());     /* Using Lambda Function */
            int num2=Integer.parseInt(tf1.getText());
            int value=num1+num2;
            l.setText(value+"");
        });
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

