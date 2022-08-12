package com.company;
import java.util.HashSet;

class KeyBoard{
    public static String[]keypad = {".","abc","def","ghi","jkl","mno","pqrs","uv","wx","yz"};
    public void print_keys(String str ,int idx, String combination){

        if(idx == str.length()){
            System.out.println(combination);
            return;
        }

        char curr_char = str.charAt(idx);
        String mapping = keypad[curr_char - '0'];
       for(int i =0;i<mapping.length();i++){
           print_keys(str,idx+1,combination+mapping.charAt(i));
       }

    }
}

class removeDuplicates{
    // create the bool array
    public  boolean[] bool = new boolean[26];
    public void remove_duplicate(String str,int idx , String newString){
        if(idx ==str.length()){
            System.out.println(newString);
            return;
        }

        char curr_char = str.charAt(idx);
        if(bool[curr_char - 'a'] == true){
            remove_duplicate(str,idx+1,newString);
        }else{
            newString +=curr_char;
            bool[curr_char - 'a'] =true;
            remove_duplicate(str,idx+1,newString);
        }
    }
}

class permutations{
    public void print_pattern(String str, String permutation){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }

        for(int i =0;i<str.length();i++){
           char curr_char = str.charAt(i);
           String newString = str.substring(0,i) + str.substring(i+1);
           print_pattern(newString,permutation+curr_char);

        }

    }
}

public class prac {

    public static void uniQueSub(String str, String newString, int idx, HashSet<String>set){

        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char curr_char = str.charAt(idx);
        uniQueSub(str,newString+curr_char,idx+1,set);
        uniQueSub(str,newString,idx+1,set);

    }


  public static void subsequence(String str,String newString , int idx){
      if(idx==str.length()){
          System.out.println(newString);
          return;
      }

      char curr_char = str.charAt(idx);
      //agar curr_char ana chahata hai toh use add kar do newString me
      subsequence(str,newString+curr_char,idx+1);

      //agar curr_char nahi ana chahata hai newString ko as it is raheno do
      subsequence(str,newString,idx+1);

  }
    public static void main (String []args){
  String str = "abc";
  subsequence(str,"",0);

  HashSet<String>set = new HashSet<>();
  uniQueSub(str,"",0,set);

    permutations pe = new permutations();
    pe.print_pattern(str,"");

        removeDuplicates rd  = new removeDuplicates();
        rd.remove_duplicate("abhidddhek",0,"");

        KeyBoard ke = new KeyBoard();
        ke.print_keys("12",0,"");

    }
}
