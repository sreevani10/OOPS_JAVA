package com.company.oops_practice.polymorphism;

    class SmartPhone {
        public void work(String sim, int chip) {
            System.out.println("Iphone mobile has" + " " + sim + " " + "sim slot and" + " " + chip + " " + "memory slot");
        }
        public void work(String sim,int chip,int storage){
            System.out.println("Vivo mobile has"+" "+sim+" "+"sim slot and"+" "+chip+" "+"memory slot"+" "+storage+" "+"gb storage");
        }
    }
    public class MobileConfigurations {
        public static void main(String[] args) {
            SmartPhone smartPhone =new SmartPhone();
            smartPhone.work("one",1);
            smartPhone.work("two",1,64);
        }
    }


