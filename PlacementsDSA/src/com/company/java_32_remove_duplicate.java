package com.company;

import java.util.Arrays;
import java.util.Stack;

public class java_32_remove_duplicate {
    public static String usingStack(String s){
        Stack<Character>st = new Stack<>();
        String newString = "";
        for(int i =0;i<s.length();i++){
            if( st.isEmpty()||st.peek()!=s.charAt(i)){
                st.push(s.charAt(i));
                newString = newString + st.peek();
            }
        }
        return newString;
    }
    public static void removeduplicate(char[] s){
        int n = s.length;
        if(n<2){
            return;
        }
        int j =0;
        for(int i =1;i<n;i++){
            if(s[j]!=s[i]){
                j++;
                s[j]=s[i];            }
        }
        System.out.println(Arrays.copyOfRange(s,0,j+1));
    }
    public static void main(String[] args) {
        char[]s = "aabbaa".toCharArray();
        int n  = s.length;
        removeduplicate(s);
        String s1 = "abbbaaabb";
        System.out.println(usingStack(s1));
    }
}
