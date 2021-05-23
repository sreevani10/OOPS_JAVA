package com.company;
public class Stack {
    int Stack[] = new int[5];
    int top = 0;
    public void push(int data) {
        if(top==5){
            System.out.println("Stack is full");
        }
        else {
            Stack[top] = data;
            top++;
        }

    }
    public int pop(){
        int data=0;
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else {
            top--;
            data = Stack[top];
            Stack[top] = 0;
        }
            return data;

    }
    public int peek(){
        int data;
        data=Stack[top-1];
        Stack[top]=0;
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }


    public void show() {
        for(int index: Stack){
            System.out.println(index + " ");
        }
        System.out.println();
    }
}



