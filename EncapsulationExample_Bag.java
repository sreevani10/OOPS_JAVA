package com.company;
class Bag {
    private String book;
    private int pens;
    public Bag(){
        book = "One Indian Girl";
        pens = 3;
    }
    public void setBooks(String book) {
        this.book = book;
    }

    public String getBook() {
        return book;
    }

    public void setPens(int pens) {
        this.pens = pens;
    }

    public int getPens() {
        return pens;
    }
}
public class EncapsulationExample_Bag {
    public static void main(String[] args) {
        Bag bag = new Bag();
        System.out.println(bag.getBook());
        System.out.println(bag.getPens());
    }
}
