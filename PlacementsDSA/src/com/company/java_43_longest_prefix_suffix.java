package com.company;
//KMP Algorithm
public class java_43_longest_prefix_suffix {
    static int Prefix_Suffix(String str){
        int []lps = new int[str.length()];
            int n =str.length(),len=0;
            lps[0]=0; // because first ch is always 0

            int i=1; //starts from 1 indexing
            while(i<n){ // when index is less than length of string

               if( str.charAt(i)==str.charAt(len)){ //if second and first char are equal then
                   len++; // increment the length
                   lps[i]=len; //place the len at lps of i;
                   i++; //finally increment the index
               }else{
                   if(len==0){// if second index is not equal to first then
                       lps[i]=0; //lps of i place 0
                       i++; //and increment the index
                   }else{
                       len =lps[len-1];
                   }
               }
            }
           System.out.println(str.substring(len));
            return len;
    }
    public static void main(String[] args) {
        String str = "abcbabca";
        int ans = Prefix_Suffix(str);
        System.out.println(ans);
    }
}
