package com.company;
class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 4.7f;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 8.6f;
    }
}
public class Polymorphism_Test2 {
    public static void main(String[] args) {
        Bank bank;
        bank=new SBI();
        System.out.println("SBI Rate Of Interest:"+bank.getRateOfInterest());
        bank=new ICICI();
        System.out.println("ICICI Rate Of Interest:"+bank.getRateOfInterest());
    }
}

