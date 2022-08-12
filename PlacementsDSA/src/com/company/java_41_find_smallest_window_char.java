package com.company;

import java.util.HashMap;

//Function to find the smallest window in the string s consisting
//of all the characters of string p.
public class java_41_find_smallest_window_char {
        public static String smallestWindow(String s, String p)     {
            String ans =""; //ans string

            //1. creating a hashmap for String 2 to make the string2 frequency map
                HashMap<Character,Integer>map2 = new HashMap<>();
            for(int i =0;i<p.length();i++){
                char ch = p.charAt(i);

                //2 .increase the frequency
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                //if value is present then add one and continue
                //but in that case value is not present then default is 0 and 0+1 1 is put
            }

            int mct = 0;//Match count;
            int dmct = p.length();// desired match count (length of p)

            //3 .   creating a hashmap for String 1 to make the string1 frequency map
            HashMap<Character,Integer>map1 = new HashMap<>();
            int i = -1;
            int j =-1;

            while(true){
                boolean flag1 = false;
                boolean flag2 = false;
                //acquire
                while(i<s.length()-1&& mct <dmct){ //i is in limit and mct count is less than dmct
                    i++; // then we increment the i counter
                    char ch = s.charAt(i);// take the string1 char
                    //and increment the frequency in map1
                    map1.put(ch, map1.getOrDefault(ch,0)+1);

                    //if we acquire the char it's less than equal to the map2 then we increment the match count
                    if(map1.getOrDefault(ch,0) <= map2.getOrDefault(ch,0)){
                    mct++;//for incrementing the match count
                    }
                    flag1 =true;
                }

                //collect answer and release
                while(j<i && mct ==dmct){ // above loop will acquire all the possible char but in this case we
                    //release those char which is unusable in our map and this loop run until mct == dmct

                    //then we store the potential answer in newString
                    String pans = s.substring(j+1,i+1);
                    //if this condition is fullfill
                    if(ans.length()==0 || pans.length()<ans.length()){ //potential answer length is less than ans length only
                        ans =pans;
                    }

                    //release unused char
                    j++; //increment the s staring counter
                    char ch  =s.charAt(j);//get the char
                    //now release the frequency

                    //if frequency is 1 then remove that char from the map1
                    if(map1.get(ch)==1){
                        map1.remove(ch);
                    // else decrease frequency by 1
                    }else{
                        map1.put(ch,map1.get(ch)-1);
                    }
                    //now check if we remove our used char frequency the decrement the match count
                    if(map1.getOrDefault(ch,0)<map2.getOrDefault(ch,0)){
                    mct--;
                    }
                    flag2 =true;
                }
                if(flag1==false &&flag2==false){
                    break;
                }
            }
            return ans;
        }
    public static void main(String[] args) {
        String s = "timetopractice"; //question
        String p = "toc"; // pattern
        String ans =  smallestWindow(s,p);
        System.out.println(ans);
    }
}