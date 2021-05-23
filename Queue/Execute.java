package com.company;

public class Execute {
    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(5);

        q.enQueue(7);

        q.enQueue(9);
        q.enQueue(4);
       // q.deQueue();
       // q.deQueue();
        q.enQueue(2);
        q.enQueue(8);
        System.out.println(q.isEmpty());


        System.out.println("Size: " + q.getSize());
        q.show();
    }
}
