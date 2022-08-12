package com.company;

public class java_05_Find1st_and_2nd_occurance {

//    public static int first =-1,last=-1;
//
//    public static void  occurences(String str,int idx,char element){
//            if(idx ==str.length()){
//                System.out.println(first);
//                System.out.println(last);
//                return;
//            }
//        char curr_str  = str.charAt(idx);
//        if(curr_str == element){
//                if(first==-1){
//                    first = idx;
//                }else{
//                    last = idx;
//                }
//        }
//        occurrences(str,idx+1,element);
//    }
    static int first =-1,last = -1; // this is the static
    public static void occurrences(String str,int i,char element){

        if(i ==str.length()){
            System.out.println("First index: "+first);
            System.out.println("Last index: "+last);
            return;
        }

          int curr_char = str.charAt(i);// means first char
          if(curr_char == element){
              if(first ==-1){ // means there is no first index then set new first index
                  first = i;// new index set
              }else{
                  last = i;// if the first is not -1 then set last
              }
          }
          occurrences(str,i+1,element); //why i+1, because 0th index we can cover in our self then remaining work do the recursion
    }
    public static void main(String[] args) {
        String str = "abaacdaefaac";
        occurrences(str,0,'y');
    }
}
