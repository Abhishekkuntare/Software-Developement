package com.company;

public class java_10_Removeduplicates {
    public static boolean[]map = new boolean[26];
public static void  removeDuplicates(String str, int idx , String newString){
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }

    char curr_char = str.charAt(idx);
    if(map[curr_char - 'a']){
        removeDuplicates(str,idx+1,newString);
    }else{
        newString+=curr_char;
        map[curr_char - 'a']=true;
        removeDuplicates(str,idx+1,newString);
    }
}

    public static void main(String[] args) {
    removeDuplicates("xyxxxei",0,"");
    }
}
