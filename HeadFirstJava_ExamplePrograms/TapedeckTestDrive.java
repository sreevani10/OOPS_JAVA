package com.company;
class Tapedeck {
    boolean canRecord = false;
    void playTape(){
        System.out.println("tape playing");
    }
    void recordTape(){
        System.out.println("tape recording");
    }
}
public class TapedeckTestDrive{
    public static void main(String[] args){
        Tapedeck t = new Tapedeck();
        t.playTape();
        t.canRecord = true;
        if(t.canRecord==true){
            t.recordTape();
        }
    }
}
