package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgressBarDemo {
    public static void main(String[] args) {
        ProgressBar progressBar = new ProgressBar();

    }
}
class ProgressBar extends JFrame implements ActionListener{
    int i;
    JProgressBar p;

    public ProgressBar(){

        JButton b = new JButton("AddForm");
        p = new JProgressBar(0,20);
        int i = 0;
        Timer t = new Timer(250,this);

        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t.start();

            }
        });
        add(b);
        add(p);

        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public  void actionPerformed(ActionEvent ae){
        if(i==20){
            new Addition();
            dispose();
        }
        i++;
        p.setValue(i);
    }

}
