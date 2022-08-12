package com.company;

class myemployee{
    private int id;
    private String name;
    private int salary;

    // default constructor
    public myemployee(){
        name="user";
        id = 100;
    }
    //parameterised constructor or  constructor overloading
    public  myemployee(String new_name,int new_id){
        name = new_name;
        id = new_id;
    }

    public myemployee(int new_salary){
        salary = new_salary;
    }

    public int getSalary (){
    return  salary;
    }

    public void setId(int new_id){
        this.id = new_id;
    }

    public int getId(){
        return id;
    }

    public void setName(String new_name){
        name= new_name;
    }

    public String getName(){
        return name;
    }

}

public class java_11_Constructor {
    public static void main(String[] args) {


    myemployee my = new myemployee("Google",915);  //take to parameteres
    // my.setName("Abhishek");
    // my.setId(23);
    System.out.println(my.getName());
    System.out.println(my.getId());

    myemployee me = new myemployee(10000);
        System.out.println(me.getSalary());
    }
}
