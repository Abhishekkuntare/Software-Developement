package com.company;

public class java_16_Count_TotalPaths {

    public static int printPaths(int i, int j, int n ,int m){
        if(i==n || j ==m){ // if we at the boundray  means (3,3), at That time we go out from the maze and
            return 0;
        }

        if(i ==n-1 && j==m-1){ // (2,2) and 2,2) this is the end of maze
            return 1;
        }

        // for down paths
        int downPaths = printPaths(i+1,j,n,m); // base(0,0) then (1,0) which means move down position
        // for right paths
        int rightPaths = printPaths(i,j+1,n,m); // base (0,0) then (0,1) which means move right position

        //calculate the path
        int total_paths = downPaths + rightPaths;
        return total_paths;
    }
    public static void main(String[] args) {
        int n =3,m =3;
        System.out.println(printPaths(0,0,n,m));
    }
}
