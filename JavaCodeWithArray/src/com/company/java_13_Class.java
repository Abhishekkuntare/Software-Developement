package com.company;

class Employee {
    // properties
    int id;
    String name;
    int salary;
    String email;

   // creating the method
    public void printDetails(){
        System.out.println("My id: "+ id);
        System.out.println("My name: "+ name);
    }

    // give us the salary
    public int getSalary(){
        return salary;
    }
    // give us the email
    public String getEmail(){
        return email;
    }

}

public class java_13_Class {
    public static void main(String[] args) {
        Employee abhi  = new Employee(); // Instantiating a new Employee object
        Employee ani = new Employee();

        // setting Attributes
        abhi.id =2;
        abhi.name= "Abhishek";
        abhi.salary = 332;

        ani.id = 3;
        ani.name = "Aniket";
        ani.email = "aniketkuntare890@gmail.com";

        abhi.printDetails();
        ani.printDetails();
        System.out.println(abhi.getSalary());
        System.out.println(ani.getEmail());
    }
}
