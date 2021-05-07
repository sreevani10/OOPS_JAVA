package com.company;
public class StaticBlock2 {
    static String s = " ";
    static {
        s="hello world";
    }
    public static void main(String[] args) {
        System.out.println("The value for s:"+s);
    }
}
