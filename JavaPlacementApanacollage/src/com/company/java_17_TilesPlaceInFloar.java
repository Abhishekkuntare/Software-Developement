package com.company;

import java.util.Scanner;

public class java_17_TilesPlaceInFloar {

    public static int  placeTiles(int n, int m){

        if(n ==m){ // 3==3 then no.of ways to place 2
            return 2;
        }
        if(n<m){ // 2< 5 then no.of ways to place 1
            return 1;
        }

        // vertically
        int verticalPlaces = placeTiles(n-m,m); // so first will place (m)
        // vertically their adjacent (m) will also place in vertically
        // but after cross the limit then downward place (n-m) means (4-2) remaining place in horizantally

        //horizantally
        int horizantalPlaces = placeTiles(n-1,m); // first we will place horizantally after
        // that (n-1) (4-1) times place remaining tiles

        return verticalPlaces + horizantalPlaces;
    }
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the n size: ");
        int n = sc.nextInt();
        System.out.println("Enter the m size: ");
        int m = sc.nextInt();
        System.out.println("Total no of ways: " +placeTiles(n,m));

    }
}
