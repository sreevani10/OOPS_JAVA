package com.company;
class Customer{
    private String name;
    private int balance;
    public Customer(){
        name = "Core";
        balance = 5000;
    }
  //  public void setName(String name){
   //     this.name=name;
   // }
    public String getName(){
        return name;
    }

   // public void setBalance(int balance) {
     //   this.balance = balance;
  //  }

    public int getBalance() {
        return balance;
    }
}

public class EncapsulationExample_BankDetails {
    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println(customer.getBalance());
        System.out.println(customer.getName());
    }
}
