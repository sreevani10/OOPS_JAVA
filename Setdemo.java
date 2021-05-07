package com.company;
import java.util.Set;
import java.util.TreeSet;
public class Setdemo {
        public static void main(String[] args){
            Set<Integer> values = new TreeSet<>();
            values.add(54);
            values.add(92);
            values.add(61);
            values.add(54);
            for(int i:values){
                System.out.println(i);
            }
        }
    }


