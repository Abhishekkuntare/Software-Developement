package com.company;
import java.util.Scanner;

class sode{
int data;
sode left,right;
sode(int data){
this.data = data;
}
}

class lowesetCommonAncestor {
    public sode createTree() {
        Scanner sc = new Scanner(System.in);
        sode root = null;
        System.out.println("Enter data: ");
        int data = sc.nextInt();
        if (data == -1) return null;

        root = new sode(data);
        System.out.println("Enter left data for: " + data);
        root.left = createTree();
        System.out.println("Enter right data for: " + data);
        root.right = createTree();
        return root;
    }

//    public sode lowest_common_ancestor(sode root, int a, int b) {
//        if (root == null) return null; //1.base condition
//        if (root.data == a || root.data == b) return root;//2. if root.data == a or b return root
//
//        //3.store the left and right side lca
//        sode left = lowest_common_ancestor(root.left, a, b);
//        sode right = lowest_common_ancestor(root.right, a, b);
//
//        //4.left side id null then return right side
//        if (left == null) return right;
//        //5. right side is null then return left side
//        if (right == null) return left;
//
//        //6.if both side are not null then return the root because the one node is left side
//        // and one node is right side
//        return root;
//
//    }
    public sode lowest_common_ancestor(sode root,int a ,int b){
        if(root==null)return null;//1.base condition
        if(root.data==a || root.data==b)return root;//2.cause and one a or b containing the root data

        //3.store the left and right subtree
        sode left = lowest_common_ancestor(root.left,a,b);
        sode right = lowest_common_ancestor(root.right,a,b);

        //4. if left side is null then return right side or tree
        if(left==null)return right;
        //5.if right side if null the return left side of three
        if(right==null)return left;

        //5.if both are not null then left return left data and
        // right return right data which is the root value in the tree
        return root;

    }

}

    public class java_52_LowestCommonAncestor {
        public static void main(String[] args) {
            lowesetCommonAncestor lca = new lowesetCommonAncestor();
            sode root = lca.createTree();
           sode ans =   lca.lowest_common_ancestor(root, 7, 3);
            System.out.println(ans.data);
        }
    }
