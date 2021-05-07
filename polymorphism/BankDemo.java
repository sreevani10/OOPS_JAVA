package com.company.oops_practice.polymorphism;
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

class HDFC extends Bank{
    float getRateOfInterest(){
        return 8.6f;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank bank;
        bank=new SBI();
        System.out.println("SBI Rate Of Interest:"+bank.getRateOfInterest());
        bank=new HDFC();
        System.out.println("HDFC Rate Of Interest:"+bank.getRateOfInterest());
    }
}



