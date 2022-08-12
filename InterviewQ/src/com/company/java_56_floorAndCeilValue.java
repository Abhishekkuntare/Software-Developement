package com.company;

import java.util.Scanner;

class xode{
    int data;
    xode left,right;
    xode(int data){
        this.data = data;
    }
}
class floorAndCeil {
    public xode createTree() {
        xode root = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;
        root = new xode(data);

        System.out.println("Enter left data for: " + data);
        root.left = createTree();

        System.out.println("Enter right data for: " + data);
        root.right = createTree();
        return root;
    }
  int floor (xode root,int key){ // floor means less than key but max in tree
        int ans = Integer.MAX_VALUE;//max in tree that's why we put maxvalue here
        while(root!=null){
            if(root.data==key){
                return root.data;
            }
          if(root.data>key){
              root =root.left;
          }
          ans =root.data;
          root = root.right;
        }
        return ans;
    }

    int ceil (xode root,int key){ // ceil means greater than key but less in tree
        int ans = Integer.MIN_VALUE;//that's why we store min value
        while(root!=null){
            if(root.data==key)return root.data;

            if(root.data>key){ // 8>16
                ans =root.data;
                root =root.left;
            }else{
                root = root.right; //go right side

            }
        }
        return ans;
    }

}

public class java_56_floorAndCeilValue {
    public static void main(String[] args) {
        floorAndCeil fac = new floorAndCeil();
        xode root = fac.createTree();
        System.out.println(fac.floor(root,16));
        System.out.println(fac.ceil(root,16));
    }
}
