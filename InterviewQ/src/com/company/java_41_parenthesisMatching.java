package com.company;

import java.util.Stack;

public class java_41_parenthesisMatching {
    public static boolean isOpening(char c){
        return c =='('||c=='['||c=='{';
    }
    public static boolean isMatching(char a , char b){
        return a=='('&&b==')' || a=='['&& b== ']' || a=='{' && b=='}';
    }
    public static boolean parabalancing(String str){
        Stack<Character>s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            if(isOpening(currChar)){
                s.push(currChar);
            }
            else{
                if(s.isEmpty()){ // if only opening brackets are present in stack return false
                    return false;
                }else if(!isMatching(s.peek(),currChar)){ // if not matching return false
                        return false;
                }else{
                    s.pop();// all match then pop it
                }
            }
        }
        return s.isEmpty();//if the stack is empty means all brackets are matched and stack is empty;
    }
    public static void main(String[] args) {
        String s = "()";
        boolean ans=  parabalancing(s);
        System.out.println("Parenthisis mathched: "+ ans);
    }
}
