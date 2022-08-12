package com.company;

class game{
    int rating;
    game(int new_rating){
        this.rating = new_rating;
    }
    public void checkRating(){
        if(rating >5){
            System.out.println("Invalid rating");
        }else{
            System.out.println(rating +" Star Rating!");
        }
    }
}

class parent{
    parent(){
        System.out.println("I ama parent constructor");
    }
    parent(int x){
        System.out.println("I am a parent constructor with "+ x);
    }
}

class child extends parent{
child(){
    super(3); // this will be call the parameterised constructor in parent class
    System.out.println("I am a child constructor");
}
child(int y){
    System.out.println("I am the child constructor with value: "+ y);
}
}

class child_of_child extends child{
    child_of_child(){
        super(2); // this will be call the parameterised constructor in child class
        System.out.println("I am the child_of_child constructor");
    }
    child_of_child(String name){
        System.out.println("According to consider as child_of_child "+ name);
    }
}

class child_of_child_child extends child_of_child{
    child_of_child_child(){
        super("Abhishek");
        System.out.println("I am the child_of_child_child");
    }
}

public class java_17_Inheritance_Constructror {
    public static void main(String[] args) {
   // parent pa = new parent();
    child ch = new child();
    child_of_child coc  = new child_of_child();
    child_of_child_child cocc = new child_of_child_child();
    game fortnite = new game(22);
    fortnite.checkRating();
    }
}
