package com.company;

class Trip{
    private String name;
    private String  number;

    public Trip (String newname, String newnumber){
        this.name = newname;
        this.number = newnumber;
    }

    public String getName(){
        return name;
    }
    public String getNumber(){
        return number;
    }
}
public class java_12_Constructor_prac {
    public static void main (String [] args){
        Trip person1 = new Trip("Abhilasha","9156075536");
        System.out.println(person1.getName());
        System.out.println(person1.getNumber());

        Trip person2 = new Trip("Aniket","8412987611");
        System.out.println(person2.getName());
        System.out.println(person2.getNumber());
    }
}
