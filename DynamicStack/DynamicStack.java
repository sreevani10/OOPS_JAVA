package com.company;

public class DynamicStack {

    int capacity=2;
    int Stack[] = new int[capacity];
    int top = 0;
    public void push(int data) {
        if(size()==capacity)
            expand();
        Stack[top] = data;
        top++;
    }

    private void expand() {
        int length = size();
        int newStack[] = new int[capacity*2];
        System.arraycopy(Stack,0,newStack,0,length);
        Stack=newStack;
        capacity*=2;
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
            shrink();
        }
        return data;
    }

    private void shrink() {
        int length = size();
        if(length<=(capacity/2)/2)
            capacity = capacity/2;
        int newStack[] = new int[capacity];
        System.arraycopy(Stack,0,newStack,0,length);
        Stack=newStack;

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



