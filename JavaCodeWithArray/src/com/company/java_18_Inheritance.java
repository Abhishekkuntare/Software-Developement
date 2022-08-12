package com.company;

class Animal {
     String name;
     int age;

  public void setName(String name){
      this.name = name;
  }
  public void setAge(int age){
      this.age = age;
  }
  public int getAge(){
      return age;
  }
  public String getName(){
      return name;
  }

}

class Dog extends Animal{
    public Dog(){
        System.out.println("Dog category");
    }
}

 class  Base{
    // properties
    int x;

    // getters and setters
     public int  getX(){
         return x;
     }
     public void setX(int x){
         System.out.println("I am setting x now");
         this.x = x;
     }
    public void printMe(){
        System.out.println("I am the Base one");
    }

}

//inherite the class with (extends) key word
class Derived extends Base{
     int y;
     //constructor
     public Derived(int y){
         this.y = y;
     }
     public int getY(){
         return y;
     }
}

public class java_18_Inheritance {
    public static void main(String[] args) {
        Base b = new Base();b.printMe();
        Derived d = new Derived(3);

        d.setX(4);
        System.out.println(d.getY());
        System.out.println(d.getX());
        d.printMe();

//        Animal
        Dog pug  = new Dog();
        pug.setName("Dog Name: Pug");
        pug.setAge(39);
        System.out.println(pug.getName());
        System.out.println("Age: "+pug.getAge());
    }
}
