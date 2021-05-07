package com.company;
class Test{
    static int i;
    public Test(){
        i++;
    }
    public void counter(){
        System.out.println(i);
    }
}
public class Count {
    public static void main(String[] args) {
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();
        t2.counter();
    }
}
