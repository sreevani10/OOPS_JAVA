package com.company;
import java.util.LinkedList;
public class List2 {
    public static void main(String[] args){
        LinkedList<String> str = new LinkedList<>();
        str.add("sree");
        str.add("vani");
        str.add("chocky");
        for(Object i:str){
            System.out.println(i);
        }
    }
}
