package com.company;

public class java_08_replace {
  public static void replace(String str){

      if(str.length() == 0){
          return;
      }

      if(str.charAt(0)=='p' && str.charAt(1)=='i'){
          System.out.print("3.14");
          replace(str.substring(2)); // 0 and 1 index is done
      }else{
          System.out.print(str.charAt(0)); // delete and print
          replace(str.substring(1)); // 1 position
      }

  }
    public static void main(String[] args) {
      replace("abpihi");
    }

}
