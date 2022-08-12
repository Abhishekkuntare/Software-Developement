package com.company;

public class java_08_TowerOfHanoi {
    public static void tower(int n,char b,char m,char e  ){
        if(n==1){
            System.out.println("Move Disk "+ b+ " to "+ e);
            return;
        }
        tower(n-1,b,e,m);
        System.out.println("Move Disk "+ b+ " to "+ e);
        tower(n-1,m,b,e);
    }
    public static void main(String []args){

        tower(3,'A','B','C');
    }
}
