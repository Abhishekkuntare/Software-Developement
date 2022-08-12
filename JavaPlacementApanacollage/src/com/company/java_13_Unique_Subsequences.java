package com.company;

import java.util.HashSet;

public class java_13_Unique_Subsequences {
    public static void uniqueSubsequences(String str,int idx,String newString,HashSet<String>set){
        if(idx== str.length()){
        if(set.contains(newString)){
            return;
        }else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
        }

        char curr_char = str.charAt(idx);
        //agar curr_char Aa raha ho ga toh use add kardo newString me
        uniqueSubsequences(str,idx+1,newString+curr_char,set);

        //Agar curr_char nahi Aa raha hai tho as it is rahane do newString;
        uniqueSubsequences(str,idx+1,newString,set);
    }
    public static void main(String[] args) {
        HashSet<String>set = new HashSet<>();
        String str ="AAA";
        uniqueSubsequences(str,0,"",set);
    }
}
