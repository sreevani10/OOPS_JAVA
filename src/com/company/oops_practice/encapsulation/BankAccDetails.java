package com.company.oops_practice.encapsulation;
class Customer{
    private String name;
    private int balance;
    public Customer(String name ,int balance){
        this.name = name;
        this.balance = balance;
    }
    public void setName(String name){
         this.name=name;
    }
    public String getName(){
        return name;
    }

    public void setBalance(int balance) {
       this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
}

public class BankAccDetails {
    public static void main(String[] args) {
        Customer customer = new Customer("sree",4000);
        System.out.println(customer.getBalance());
        System.out.println(customer.getName());
    }
}

