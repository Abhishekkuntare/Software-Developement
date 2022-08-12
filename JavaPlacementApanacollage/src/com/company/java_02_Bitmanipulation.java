package com.company;

import java.util.Scanner;

class GetBit{
     int position =0;
     int n  =5; //0101
     int bitMask = 1<<position;

    void getBit(){
        if((bitMask & n )==0){
            System.out.println("Bit was Zero");
        }else{
            System.out.println("Bit was One");
        }
    }
}

class SetBit{
    int i;
    int n;
    int bitMask;
    int newNumber;

    SetBit(int i,int n,int bitMask){
        this.i = i;
        this.n = n;
        this.bitMask = bitMask<<i;
    }

    void setBit(){
     newNumber = bitMask | n;
     System.out.println("New bit: "+newNumber);
    }
}

class ClearBit{
    int n = 5;
    int pos =2;
    int bitMask = 1<<pos;
    int notBitMask = ~(bitMask);

   void clearBit(){
       int newNumber = notBitMask & n;
       System.out.println("New Number: " +newNumber);
}
}

class UpdateBit{
    int pos = 1;
    int n = 5; //0101
    int bitMask = 1<<pos;

    Scanner sc = new Scanner(System.in);

    int operation = sc.nextInt();

    void update(){
        if(operation == 0){
            //Clear bit
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber); // 0111 dec-> 7
        }else{
            //Set Bit
            int newNumber  = bitMask | n;
            System.out.println(newNumber); //0101
        }

    }

}



public class java_02_Bitmanipulation {
    public static void main(String[] args) {
        GetBit gb = new GetBit();
        gb.getBit();

        SetBit sb = new SetBit(2, 5, 1);
        sb.setBit();

        ClearBit cb = new ClearBit();
        cb.clearBit();

        System.out.println("Enter the 0 or 1 bit to update ");
        UpdateBit ub = new UpdateBit();
        ub.update();
    }
}
