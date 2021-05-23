package com.company;

public class Run {
    public static void main(String[] args) {
        DynamicStack ds = new DynamicStack();
        ds.push(5);
        ds.show();
        ds.push(8);
        ds.show();
        ds.push(2);
        ds.show();
        ds.push(19);
        ds.show();
        ds.push(6);
        ds.show();
        ds.push(9);
        ds.show();
        ds.pop();
        ds.show();
        ds.pop();
        ds.show();
    }
}
