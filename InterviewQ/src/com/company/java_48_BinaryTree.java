package com.company;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class mode{
    int data;
    mode left,right;
    public mode(int data){
        this.data= data;
    }
}

public class java_48_BinaryTree {
    static Scanner sc = null;

    static mode createmode() {
        mode root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if (data == -1) return null;
        root = new mode(data);

        System.out.println("Enter left data for: " + data);
        root.left = createmode();
        System.out.println("Enter right data for: " + data);
        root.right = createmode();
        return root;
    }

    static void preOrder(mode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(mode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    static void postOrder(mode root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    static void levelOrder(mode root) {
        Queue<mode> q = new LinkedList<>();
        if (root == null) return;
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            mode currmode = q.remove();
            if (currmode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currmode.data + " ");
                if (currmode.left != null) {
                    q.add(currmode.left);
                }
                if (currmode.right != null) {
                    q.add(currmode.right);
                }
            }
        }
    }

    static int heightOfBT(mode root) {
        if (root == null) {
            return 0;
        }
        int leftH = heightOfBT(root.left);
        int rightH = heightOfBT(root.right);
        return Math.max(leftH , rightH)+1;
    }

  static int sizeOfBT(mode root) {
        if (root == null) {
            return 0;
        }
        int lefts = sizeOfBT(root.left);
        int rights = sizeOfBT(root.right);
        return lefts+rights+1;
    }

  static int minBT(mode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int min = Math.min(root.data,Math.min(minBT(root.left),minBT(root.right)));
        return min;
    }
    static int maxBT(mode root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }

        int max = Math.max(root.data,Math.max(maxBT(root.left),maxBT(root.right)));
        return max;
    }

    //left view
    static int max_level= 0;
    static void leftView(mode root){
        max_level = 0;
        printLeftView(root,1);
    }
    static void printLeftView(mode root,int level) {
        if (root == null) return;
        if (max_level < level) {
            System.out.print(root.data + " ");
            max_level = level;
        }
        printLeftView(root.left, level + 1);
        printLeftView(root.right, level + 1);
    }

    //right view
    static void rightView(mode root){
        max_level = 0;
        printRightView(root,1);
    }
    static void printRightView(mode root,int level){
        if(root==null)return;
        if(max_level<level){
            System.out.print(root.data+" ");
            max_level = level;
        }
        printRightView(root.right ,level+1);
        printRightView(root.left ,level+1);
    }



    public static void main(String[] args) {
        sc = new Scanner(System.in);
        mode root = createmode();
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

        System.out.println("preOrder: ");
        preOrder(root);
        System.out.println();

        System.out.println("inOrder: ");
        inOrder(root);
        System.out.println();

        System.out.println("postOrder: ");
        postOrder(root);
        System.out.println();

        System.out.println("levelOrder: ");
        levelOrder(root);
        System.out.println();

        System.out.println("height of BT: ");
        System.out.println(heightOfBT(root));
        System.out.println();

        System.out.println("Size of BT: ");
        System.out.println(sizeOfBT(root));
        System.out.println();

        System.out.println("MIN: ");
        System.out.println(minBT(root));
        System.out.println();

        System.out.println("MAX: ");
        System.out.println(maxBT(root));
        System.out.println();

        System.out.println("LeftView: ");
        leftView(root);
        System.out.println();

        System.out.println("RightView: ");
        rightView(root);
        System.out.println();

    }
}