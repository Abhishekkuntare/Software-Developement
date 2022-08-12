package com.company;

class ArrayBound extends Exception {
    @Override
    public String  toString(){
    return "Array index is bound!";
    }
    @Override
    public String getMessage(){
        return "Array index is bounded!";
    }
}

public class java_38_HandleCustomException {
    public static void array(int []arr)throws ArrayBound{
        if(arr.length >3){
            throw new ArrayBound();
        }
        for(int i =0;i<10;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,3,4,55,4};
   try{
       array(arr);
   }catch(Exception e){
       System.out.println(e);
   }
    }
}
