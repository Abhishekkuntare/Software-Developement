package com.company;

//interface is used to create the template of class ,that means we make the
// method to interface and that interface we should be created in our class
interface Bicycle{
    final int a = 17;
    void speedUp(int increments);
    void applyBrake(int decrements);
}

interface HornBicycle{
    public void blowHorn1();
    void blowHorn2();
}

class TeamCycle implements Bicycle,HornBicycle{
    public void speedUp(int increments){
        System.out.println("Increment speed: "+ increments+"ms");
    }
    public void applyBrake(int decrements){
        System.out.println("Decrements speed: "+ decrements+"ms");
    }
    public void blowHorn1(){
        System.out.println("Jay Shree ram.....");
    }
    public void blowHorn2(){
        System.out.println("Main hoo na......");
    }
}


public class java_23_Interfaces {
    public static void main(String [] args){
        TeamCycle cycleAbhishek = new TeamCycle();
        cycleAbhishek.speedUp(1);
        System.out.println(cycleAbhishek.a);
        //cycleAbhishek.a = 39; //we can't change the properties because it was final

            cycleAbhishek.blowHorn1();
            cycleAbhishek.blowHorn2();
    }
}
