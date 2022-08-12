package com.company;
import java.util.Scanner;

 class Patterns
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of n: ");
        int n = sc.nextInt();
//        System.out.println("Enter the size: m ");
//        int m = sc.nextInt();

        //1.Solid rectangle
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=m;j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }

        //2. Hollow rect
        //outer loop
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=m;j++){
//                if(i == 1 || j ==1 || i == n || j ==n){
//                    System.out.print("#");
//                }else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        3.Half pyramid
//        for(int i =1;i<=n;i++){
//            for(int j = 1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        4.Reverse Half pyramid
//       for(int i =n;i>=1;i--){
//           for(int j=1;j<=i;j++){
//               System.out.print("* ");
//           }
//           System.out.println();
//       }

//        5. Inverted Half Pyramid
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for ( int j = 1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        6. Half Pyramid  with numbers
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        7. Half Pyramid with reverse of numbers
//        for(int i =n;i>=1;i--){
//            for(int j =1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//        8. Floyd's Triangle'
//        int number  =1;
//        for(int i=1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                System.out.print(number+" ");
//                number++;
//            }
//            System.out.println();
//        }

//        9. 0-1 Triangle half pyramid (if numbers are even then 0 or 1)
//        for row
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=i;j++){
//                int sum = i+j;
//                if(sum%2==0){
//                    System.out.print(1+" ");
//                }else{
//                    System.out.print(0+" ");
//                }
//            }
//            System.out.println();
//        }

//        10. Butterfly Pattern
//        for 1st part
//    for(int i =1;i<=n;i++){
//        for(int j =1;j<=i;j++){
//            System.out.print("*");
//        }
//
//        // for spaces
//            int spaces = 2*(n-i);
//            for(int k =1;k<=spaces;k++){
//                System.out.print(" ");
//            }
//
//        //for 2nd part
//            for(int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//        System.out.println();
//    }
////    for 2nt part
//    for(int i =n;i>=1;i--){
//        for(int j =1;j<=i;j++){
//            System.out.print("*");
//        }
//
//        // for spaces
//            int spaces = 2*(n-i);
//            for(int k =1;k<=spaces;k++){
//                System.out.print(" ");
//            }
//
//        //for 2nd part
//            for(int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//        System.out.println();
//    }
//        11.Rhombus pattern
//        for(int i =1;i<=n;i++){
//            for(int j=1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=n;k++){
//                System.out.print("*");
//            }
//            for(int l=n;l>=(n-i);l--){
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        12. pyramid shape
//      int number=1;
//        for(int i =1;i<=n;i++){
//            for(int j =1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            for(int k = 1;k<=i;k++){
//
//                System.out.print(i+ " ");
//            }
////            for(int j =1;j<=(n-i);j++){
////                System.out.print(" ");
////            }
//            System.out.println();
//        }

        //13.Palindromic pattern
//        for(int i =1;i<=n;i++){
//
//            for(int j=1;j<=(n-i);j++){
//                System.out.print(" ");
//            }
//            // 1st Half
//            for(int j =i;j>=1;j--){
//                System.out.print(j);
//            }
//            //2nd Half
//            for(int j =2;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        14. Diamond pattern
        for(int i =1;i<=n;i++){
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =n;i>=1;i--){
            for(int j =1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j =1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
