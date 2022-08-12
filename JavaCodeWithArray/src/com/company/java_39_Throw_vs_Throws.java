package com.company;

//this is the custom exception for handle the negative radius
class NegativeRadiusException extends Exception{
     @Override
    public String toString(){
         return "Radius cannot be negative";
     }
     @Override
    public String getMessage(){
         return "Radius cannot be negative";
     }
}

public class java_39_Throw_vs_Throws {
          //if we provide negative radius then area will also negative that is
            // wrong so use the throws ans throw key word simultansoly;
        public static double area(int r) throws NegativeRadiusException{ // throws means sanket who will use your func
            if(r<0){
                throw new NegativeRadiusException(); // throw is use for give the custom exception
            }
        return Math.PI*r*r;
    }

    // if create the method and the throws key so it will take the exception so you can cover this method in try catch
    public static int  divide(int a,int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
//       try{
//           int a = 6,b =0;
//           System.out.println(divide(a,b));
//       }catch(Exception e){
//           System.out.println("Exception "+ e);
//       }
        try{
            int radius  =-5;
            System.out.println(area(radius));
        }catch(Exception e){
            System.out.println(e);// handle the exception from custom class
        }
    }
}
