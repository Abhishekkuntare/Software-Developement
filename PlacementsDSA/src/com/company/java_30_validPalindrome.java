package com.company;

public class java_30_validPalindrome {
    public static boolean validPalindrome(String s){
        String res="";
        for(char c :s.toCharArray()){//Convert it into char array means remove the spaces
            if(Character.isDigit(c)||Character.isLetter(c)){
                res = res+c;
            }
        }
        res =res.toLowerCase();
        int l=0;
        int r=res.length()-1;
        while(l<=r){
            if(res.charAt(l)!=res.charAt(r)){
                return false;
            }
            l++;r--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(s.toLowerCase());

        String res = "";
        for(char c : s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                res = res + c;
            }
        }

        System.out.println(res);
        System.out.println(validPalindrome(s));
    }
}
