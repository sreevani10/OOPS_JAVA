package com.company;
class Try{
    private int i;
    public void setI(int j){
        i=j;
    }
    public int getI(){
        return i;
    }
}
public class Encap {
    public static void main(String[] args) {
        Try t = new Try();
        t.setI(5);
        System.out.println(t.getI());
    }
}
