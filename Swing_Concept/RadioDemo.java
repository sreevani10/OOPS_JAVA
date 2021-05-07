package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class RadioDemo {
    public static void main(String[] args) {
        Radio radio = new Radio();

    }
}
class Radio extends JFrame{
    JTextField t;
    JButton b;
    JLabel l;
    JRadioButton r1,r2;
    JCheckBox c1,c2;
    public Radio(){
        t = new JTextField(14);
        b = new JButton("OK");
        l = new JLabel("Greetings");
        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");
        c1 = new JCheckBox("Dancing");
        c2 = new JCheckBox("Singing");


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        add(t);
        add(r1);
        add(r2);
        add(c1);
        add(c2);
        add(b);
        add(l);


        c1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println("Dancing");
            }
        });

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t.getText() ;
                if(r1.isSelected()){
                    name = "Mr. " + name;
                }
                else
                {
                    name = "Ms. " + name;
                }
                if(c1.isSelected())
                {
                    name = name + " Dancer";
                }
                if(c2.isSelected())
                {
                    name = name + " Singer";
                }


                l.setText(name);
            }
        });




        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
