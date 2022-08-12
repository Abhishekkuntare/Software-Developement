package com.company;

class java_20_Backtracking {
    public static void print_permutation(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<str.length();i++){
            char curr_char = str.charAt(i);
            String newString = str.substring(0,i) + str.substring(i+1);
            print_permutation(newString, permutation+curr_char);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";
        print_permutation(str,"");
    }
}
