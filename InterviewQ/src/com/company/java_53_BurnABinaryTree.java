package com.company;
import java.util.Scanner;
class zode {
    int data;
    zode left, right;
    zode(int data) {
        this.data = data;
    }
}
//1. create the class depth
 class Depth{
    int d;
    public Depth(int d){
        this.d = d;
    }
}

class burnTree{
    public zode createTree() {
        Scanner sc = new Scanner(System.in);
        zode root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if (data == -1) return null;

        root = new zode(data);
        System.out.println("Enter left data for: " + data);
        root.left = createTree();
        System.out.println("Enter right data for: " + data);
        root.right = createTree();
        return root;
    }
    //initially is -1 , update in later
    static  int ans =-1;

    //2.start  function
    public int minTimeToBurn(zode root,int target){
        Depth depth = new Depth(-1); // initially depth is -1, and it will be updated later
        burn(root,target,depth); // call the burn function to get the burn time
        return ans; //return the ans, burn time
    }

    //3.burn function
    public static int burn(zode root, int target ,Depth depth){
        if(root==null)return 0; //1. if root is null then return 0
        if(root.data==target){ //2. root's data is equal to target then set depth 1 and return 1 ,we get our ans
            depth.d = 1;
            return 1;
        }

        //3. if the root data is not equal to target then, initialize the left depth and right depth as -1
        Depth ld = new Depth(-1); //left depth
        Depth rd = new Depth(-1); //right depth

        //4.find left height, and we also find, in left side element present or not,
        // left depth has been updated
        int lh = burn(root.left, target,ld);

        //5.find  right height, and we also find, in right side element present or not,
        // right depth has been updated
        int rh = burn(root.right,target,rd);

        //6.check left depth value is update or not
         if(ld.d!=-1){ // is not -1 means updated
         ans = Math.max(ans,ld.d+1+rh);//left depth +root + right height
         depth.d = ld.d+1;// increment the depth data
        }

        //7.check right depth value is update or not
        else if (rd.d!=-1){
        ans = Math.max(ans,rd.d+1+lh);// right side depth + root + left  height
        depth.d = rd.d+1;// increment the depth data
        }
        //8. finally, return max height
        return Math.max(lh,rh)+1;
    }
}


public class java_53_BurnABinaryTree {
    public static void main(String[] args) {
        burnTree bt = new burnTree();
        zode root = bt.createTree();
       int data =  bt.minTimeToBurn(root,5);
        System.out.println(data+":sec to burn the whole tree");
    }
}
