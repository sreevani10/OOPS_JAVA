package com.company.oops_practice.abstraction;
abstract class Employee{
    private String name;
    private int PaymentPerHour;
    public Employee(String name,int PaymentPerHour){
        this.name=name;
        this.PaymentPerHour=PaymentPerHour;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setPaymentPerHour(int PaymentPerHour){
        this.PaymentPerHour=PaymentPerHour;
    }
    public int getPaymentPerHour(){
        return PaymentPerHour;
    }
    public abstract int CalculateSalary();
}
class Contractor extends Employee {
    private int WorkingHours;
    public Contractor(String name,int PaymentPerHour,int WorkingHours) {
        super(name, PaymentPerHour);
        this.WorkingHours = WorkingHours;
    }


    @Override
    public int CalculateSalary(){
        return getPaymentPerHour()*WorkingHours;
    }
}
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name,int PaymentPerHour){
        super(name,PaymentPerHour);
    }
    @Override
    public int CalculateSalary(){
        return getPaymentPerHour()*8;
    }
}
public class Company{
    public static void main(String[] args) {
        Employee contractor = new Contractor("Contractor",10,10);
        Employee fullTimeEmployee = new FullTimeEmployee("FullTimeEmployee",8);
        System.out.println(contractor.CalculateSalary());
        System.out.println(fullTimeEmployee.CalculateSalary());
    }
}

