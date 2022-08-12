package com.company;

public class java_06_Move_all_X_to_end {
    public static void move_all_x_to_end(String str,int i,int count,String newString ){

            if(i == str.length()){
                System.out.print(newString);
                for(int j=0;j<count;j++){
//                    newString = newString+'x';
                    System.out.print('x');
                }
                return;
            }

        int curr_char = str.charAt(i);// current char of i'th index
        if(curr_char == 'x'){
            count++;
            //then call recursive for all the values
            move_all_x_to_end(str,i+1,count,newString);
        }else{
            //char is not equal to 'x' then added in to the newString
            newString +=str.charAt(i);//means current element added into newString
            move_all_x_to_end(str,i+1,count,newString);
        }

    }
    public static void main(String[] args) {
       String str = "abxxxhxi";
        move_all_x_to_end(str,0,0,"");
    }
}
