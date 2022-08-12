package com.company;
import java.util.Random;
import java.util.Scanner;

class Guess{
    private int user_number;
    private int count = 0;
    private int numbers;

public Guess(){
    Random rand = new Random();
     numbers = rand.nextInt(100);
}

//    public void generate_number(){
//        System.out.println(numbers);
//    }

    public void user(){
        Scanner sc = new Scanner(System.in);

        while(user_number!=numbers){
         System.out.println("Guess the Number!");
         user_number  = sc.nextInt();

        if(user_number == numbers){
            System.out.println("Correct!");
        }
        else if (user_number < numbers){
            System.out.println("Enter greater number!");
            count++;
        }
        else{
            System.out.println("Enter less number!");
            count++;
            }
        }
    }

    public int number_of_guesses(){
        return count;
    }
}

public class java_15_GuessTheNumber {
    public static void main(String[] args) {
        Guess gu = new Guess();
        //gu.generate_number();
        gu.user();
        System.out.println("No of Guesses: " + gu.number_of_guesses());
    }
}
