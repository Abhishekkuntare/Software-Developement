package com.company;

public class java_15_permutations {
    public static void print_comb(String str, String permutation){

        if(str.length() ==0){
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<str.length();i++){
            char curr_char  = str.charAt(i);
            String newString = str.substring(0,i)+str.substring(i+1);
            print_comb(newString ,permutation+curr_char);
        }

    }
    public static void main(String[] args) {
        String str = "abc";
        //System.out.println(str.substring(0 ,0));
       print_comb(str,"");
    }
}
