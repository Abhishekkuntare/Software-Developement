package com.company;

public class java_05_Array {
    public static void main (String []args){
        //1> int [] marks = new int[5];
       //2> int [] marks;
       // marks = new int[4];
        int marks[] = {1,2,3,4,5};
        int length = marks.length;

        for(int i =0;i<length;i++){
            System.out.println(marks[i]);
        }

        String name[]= {"Abhishek", "Aniket", "Pravin","Meena"};
//reverse array
        for(int j =name.length-1;j>=0;j--) {
            System.out.println(name[j]);
        }
//for each looop
        for(int element: marks){
            System.out.println(element);
        }

//        multidimenstion array
        int [][] flats;
        flats = new int[2][2];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[1][0] = 104;
        flats[1][1] = 105;

        for (int[] flat : flats) {
            for (int i : flat) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for(int i =0;i<flats.length;i++){
            for(int j = 0;j<flats[i].length;j++){
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println();
        }

        float mar [][];
        mar=new float[2][2];
        mar[0][0] = 10.1f;
        mar[0][1] = 10.2f;
        mar[1][0] = 10.4f;
        mar[1][1] = 10.5f;

        for(float marksss[]: mar){
        for(float m:marksss){
            System.out.print(m +" ");
        }
            System.out.println();
        }
        for(int i =0;i<mar.length;i++){
            for(int j =0;j<mar[i].length;j++){
                System.out.print(mar[i][j]+" ");
            }
            System.out.println();
        }

//        adding two array
        int m1[][] = {{1,2,3}
                     ,{4,5,6}};
        int m2[][] = {{1,2,3}
                    ,{4,5,6}};
        int result[][] = {{0,0,0}
                        ,{0,0,0}};

            for(int i =0;i<m1.length;i++){
                for(int j =0;j<m1[i].length;j++){
                    result[i][j] = m1[i][j]+ m2[i][j];
                    System.out.print(result[i][j] +" ");

                }
                System.out.println();
            }

    }

}
