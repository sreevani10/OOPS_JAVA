package com.company;
import java.util.HashMap;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String,Integer> scores = new HashMap<>();
        scores.put("sree",24);
        scores.put("vani",54);
        scores.put("chocky",39);
        System.out.println(scores);
        System.out.println(scores.get("sree"));
    }
}
