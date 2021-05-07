package com.company;
import java.util.ArrayList;
public class List {
    public static void main(String[] args){
        ArrayList<Integer> values = new ArrayList<>();
        values.add(72);
        values.add(53);
        values.add(86);
        for(Object a : values){
            System.out.println(a);
        }
    }
}
