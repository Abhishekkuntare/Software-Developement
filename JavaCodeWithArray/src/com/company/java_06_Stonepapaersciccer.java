package com.company;
import java.util.Random;
import java.util.Scanner;

public class java_06_Stonepapaersciccer {
    public static void main (String [] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String ch;
        do{
        Random rand = new Random();
        int com = rand.nextInt(2);

        //System.out.println(com);

        System.out.println("Enter the Stone for '0' , Paper for '1' , Scissor for '2' ");
        int user = sc.nextInt();

//          if(user != 1 && user != 2 && user !=3){
//              System.out.println("Invalid input!");
//              return;
//          }
          if(com == user){
              System.out.println("Draw!");
          }
          else if(com== 0 && user==1) {
              System.out.println("You Win!");
              count++;
          }
          else if (com ==1 && user==2){
              System.out.println("You Win!");
              count++;
          }

          else{
              System.out.println("Com Win!");
          }
            System.out.println("You: "+ user);
            System.out.println("Com: "+ com);
            System.out.println("Do you want to continue? y/n: ");
            ch =sc.next();
      }while(!ch.equals("n"));

        System.out.println("Score: "+ count);
    }
}
