package com.company;

public class java_12_Strings {
    public static void permutations(String str,String permutaion){
        if(str.length()==0){
            System.out.println(permutaion);
            return;
        }
        for(int i =0;i<str.length();i++){
            char currChar =str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            permutations(newString,permutaion+currChar);
        }
    }

    public static void subSequence(String str,String newString ,int idx){

        if(str.length()==idx){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSequence(str,newString+currChar,idx+1);
        subSequence(str,newString,idx+1);

    }

    public static boolean palidrome(String str,int l,int r){
        if(l>=r){
            return true;
        }
        if(str.charAt(l)!=str.charAt(r)){
            return false;
        }
      return   palidrome(str,l+1,r-1);
    }
    public static void main(String[] args) {
        String s = "aba";
        if(palidrome(s,0,s.length()-1)){
            System.out.println("PALINDROME");
        }else{
            System.out.println("NOT PALINDROME");
        }
        subSequence("abc","",0);
        permutations("abc","");
    }
}
