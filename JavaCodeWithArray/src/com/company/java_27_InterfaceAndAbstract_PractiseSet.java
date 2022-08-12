package com.company;

//problem 3
abstract class Telephone{
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    @Override
    void ring(){
        System.out.println("Ringing...");
    }
    @Override
    void lift(){
        System.out.println("Lifting...");
    }
    @Override
    void disconnect(){
        System.out.println("Disconnect...");
    }
}


//problem 2
interface BasicAnimal{
    public void eat();
    public void sleep();
}

class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping");
    }
    public void bite(){
        System.out.println("Monkey is biting the woman");
    }
}

class Human extends Monkey implements BasicAnimal{
@Override
    public void eat(){
    System.out.println("Man eating...");
}
@Override
    public void sleep(){
    System.out.println("Man Sleeping");
}
}


//problem1
abstract class Pen {
   abstract public void write();
   abstract public void refil();
}

abstract class Pensil extends Pen{
    abstract public void pensil_new();
}

class Mypen extends Pen{
    @Override
    public void write(){
        System.out.println("Write something new");
    }
    @Override
    public void refil(){
        System.out.println("Refil the pen!");
    }
    public void speak(){
        System.out.println("Speaking the man ");
    }

}


public class java_27_InterfaceAndAbstract_PractiseSet {
    public static void main(String[]args){
      //  problem 1
//        Mypen my = new Mypen();
//        my.refil();
//        my.write();

      //  problem 2
        Human hu = new Human();
//        hu.eat();

       // reference         // object
//        this is the polymorphism  one entity many forms
        Monkey abhishek = new Human();
        abhishek.jump();
        abhishek.bite();
       // abhishek.speak(); thorws->>>> object is human but the reference is monkey so it was get only monkey's methods

        // reference         // object
        BasicAnimal Aniket = new Human();
        Aniket.eat();
        Aniket.sleep();
       // Aniket.speak(); thorows an error


       // problem 3
       // this is the polymorphism one entity and many forms
//        Telephone te = new SmartTelephone();
//        te.disconnect();
//        te.lift();
//        te.ring();

//        problem 4

    }

}
