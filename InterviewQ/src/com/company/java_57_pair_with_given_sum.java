package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class yode{
    int data;
    yode left,right;
    yode(int data){
        this.data = data;
    }
}
class pair_with_given_sum {
    public yode createTree() {
        yode root = null;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter data: ");
        int data = sc.nextInt();

        if (data == -1) return null;
        root = new yode(data);

        System.out.println("Enter left data for: " + data);
        root.left = createTree();

        System.out.println("Enter right data for: " + data);
        root.right = createTree();
        return root;
    }

    //start function O(N) O(N)
    public int isPairPresent(yode root, int target){
        Set<Integer> set= new HashSet<>();
       boolean ans = givenSumOrNot(root,target,set);
       return ans?1:0;// if ans is true return 1 or return 0;
    }

    //it is similar to the inorder traversal
    public boolean givenSumOrNot(yode root,int sum,Set<Integer>set){
      if(root==null)return false;

      if(givenSumOrNot(root.left,sum,set)){//call the left side of subtree
          return true;
      }
      if(set.contains(sum-root.data)){//ex: 150-100 and set contains 50 so return true
          return true;
      }
      //if not contains then add in set
        set.add(root.data);

      //call for the right side of subtree
        return givenSumOrNot(root.right,sum,set);
    }
}

public class java_57_pair_with_given_sum {
    public static void main(String[] args) {
        pair_with_given_sum pwg = new pair_with_given_sum();
        yode root = pwg.createTree();
        System.out.println(  pwg.isPairPresent(root,150));
    }
}
