package com.company;
import java.util.*;
// Java program to print anagrams together using dictionary

class GroupOfAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> list = new ArrayList<>();
        Map<String,List<String>>map = new HashMap<>();

        for(String str : strs)
        {
            char ch[] = str.toCharArray();
            Arrays.sort(ch);
            String str1 = String.valueOf(ch); // valueOf func gives current value of string
//             System.out.println(str1);

            if(!map.containsKey(str1))
                map.put(str1 , new ArrayList<>());

            map.get(str1).add(str);
        }

        for(Map.Entry<String , List<String>> mm : map.entrySet())
        {
            list.add(mm.getValue());
        }

        return list;
    }
}

public class java_38_GroupAnagram {

        private static void printAnagrams(String arr[]) {

            //Here we create and map with string and list of string type
            Map<String,List<String>>map = new HashMap<>();
            for(int i =0;i<arr.length;i++){
                String word =arr[i];
                char []letters = word.toCharArray(); //convert the String to the Char array
                Arrays.sort(letters); // sort the char array
                String newWord = new String(letters); //create another new String and added the char array in this

                if(map.containsKey(newWord)){ // if map contains key means String newWord
                    map.get(newWord).add(word); // get those newWord and add the word
                }else{
                    //if map not contains the newWord then we create a list
                    List<String>words = new ArrayList<>(); // create a list because the map takes string and (list of String)
                    words.add(word); //add the word in the words list of String
                    map.put(newWord,words); //and those newWord and words are added in the map
                }
            }
            for(String s:map.keySet()){
                List<String>values = map.get(s);
                System.out.println(values);
            }
        }

        public static void main(String[] args) {
            String arr[] = {"eat","tea","tan","ate","nat","bat" };
            printAnagrams(arr);
            GroupOfAnagram goa = new GroupOfAnagram();
            goa.groupAnagrams(arr);

        }
    }
