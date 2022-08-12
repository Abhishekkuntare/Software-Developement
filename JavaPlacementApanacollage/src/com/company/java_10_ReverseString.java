package com.company;

public class java_10_ReverseString {
    public static void reverseStr(String st,int idx){
    if(idx ==0){
        System.out.println(st.charAt(idx));
        return;
    }
        System.out.print(st.charAt(idx));
        reverseStr(st,idx-1);
    }

    public static void main(String[] args) {
        String name = "Abhi";
        reverseStr(name,name.length()-1);
    }
}
