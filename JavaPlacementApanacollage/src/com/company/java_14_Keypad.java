package com.company;

public class java_14_Keypad {   //0    1     2     3     4   ........ index
public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","xyz"};
public static void print_cobination(String str,int idx,String newStirng){ // parameters are copy

    if(idx ==str.length()){
        System.out.println(newStirng);
        return;
    }

    char curr_char = str.charAt(idx);//find the current_char
    String mapping = keypad[curr_char - '0']; // '2' - '0'= 2 means 2nd index mapping will occured
    for(int i =0;i<mapping.length();i++){
        print_cobination(str,idx+1,newStirng+mapping.charAt(i));
    }
}
    public static void main(String[] args) {
String str = "23";
print_cobination(str,0,""); //Arguments are actual
    }
}
