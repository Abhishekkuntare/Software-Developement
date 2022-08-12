package com.company;

public class java_11_Remove_duplicates
{
    public static boolean[] bool = new boolean[26]; // intitialy false
    public static void removeDuplicate(String str,int idx,String newString){

        if(idx == str.length()){
            System.out.print(newString);
            return;
        }
       char curr_char = str.charAt(idx);
       if(bool[curr_char - 'a'] == true) {// 'a' - 'a' = 0
         removeDuplicate(str,idx+1,newString);
       }else{
           newString +=curr_char; //adding the false index values int newstring
           bool[curr_char - 'a']= true; // after include the char on the newString
           // then the index of curr_char changes to the true
           removeDuplicate(str, idx+1,newString);
       }
    }
    public static void main (String []args){
        String str = "abbccda";
        removeDuplicate(str,0,"");
        System.out.println('c' - 'e'); //check the index starts from the 0'th position
    }
}
