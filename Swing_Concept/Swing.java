package com.company;

import javax.swing.*;
import java.awt.*;

public class Swing {

    public static void main(String[] args) {
        Calc calc=new Calc();


    }

}
class Calci extends JFrame{
    public Calci(){


         JLabel l = new JLabel("Hello World");
         JLabel l1 = new JLabel("Welcome");
         add(l);
         add(l1);

         setLayout(new FlowLayout());
         setVisible(true);
         setSize(400,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

