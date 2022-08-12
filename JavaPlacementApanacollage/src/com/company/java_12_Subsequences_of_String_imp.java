package com.company;

public class java_12_Subsequences_of_String_imp {
    public static void subsequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }

        char curr_char = str.charAt(idx);//Calculate the current char


        //Agar vo newString me Aana Chahata hai Toh use Add kardo
        subsequences(str,idx+1,newString+curr_char);

        //Agar vo newString me Nahi Aana Chahata hai to as it is rahene do
        subsequences(str,idx+1,newString);
    }
    public static void main (String []args){
        String str = "aaa";
        subsequences(str,0,"");
    }
}
