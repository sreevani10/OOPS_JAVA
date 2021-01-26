package com.company.oops_practice.encapsulation;
class Bag {
    private String book;
    private int pens;
    public Bag(String book,int pens){
        this.book = book;
        this.pens = pens;
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
public class BagDemo {
    public static void main(String[] args) {
        Bag bag = new Bag("One indian girl",3);
        System.out.println(bag.getBook());
        System.out.println(bag.getPens());
    }
}