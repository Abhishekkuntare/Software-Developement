package com.company;

public class java_40_finally {
    public static int add( ){
        try{
            int a = 5,b =10;
            int c = a/b;
            return c;
        }catch(Exception e){
            System.out.println(e);
        }
        finally{// if we return the function but finally will run at any value
            System.out.println("Cleaning up..... end of the function");
        }
        return 0;
    }
    public static void main(String[] args) {
            try{
              for(int i=0;i<=5;i++){
                  if(i==3){
                      break;
                  }}

            }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("end of the program ");
        }
       // System.out.println(add());
        int i =5;
    }
}
