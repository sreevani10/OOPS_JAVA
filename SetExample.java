package com.company;
import java.util.HashSet;
import java.util.Set;
public class SetExample {
    public static void main(String[] args){
        Set<Integer> values = new HashSet<>();
        values.add(54);
        values.add(92);
        values.add(61);
        values.add(54);
        for(int i:values){
            System.out.println(i);
        }
    }
}
