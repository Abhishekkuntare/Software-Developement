package com.company;
import java.util.*;

class kode{
    int data;
    kode left,right;
    kode(int data){
        this.data= data;
    }
}

//create pair because , we need horizontal distance for each node and that node also
class pair{
    int hd;
    kode node;
    public pair(int hd,kode node){
        this.node = node ;
        this.hd = hd;
    }
}


class TopView{
    Scanner sc = new Scanner(System.in);
    public kode createTree(){
        kode root = null;
        System.out.println("Enter the data: ");
        int data = sc.nextInt();
        if(data==-1){
            return null;
        }
        root = new kode(data);
        System.out.println("Enter left data for: "+data);
        root.left = createTree();
        System.out.println("Enter right data for: "+data);
        root.right = createTree();
        return root;
    }
    public ArrayList<Integer> TopViewBT(kode root){
        Queue<pair> q = new ArrayDeque<>(); //use the pair here
        Map<Integer,Integer>map = new TreeMap<>();//we use treemap cause it give's the sorted order
            //1.hd   2.//kode data

        q.add(new pair(0,root));//0.add the first pair in queue as usual
        while(!q.isEmpty()){
            pair curr = q.poll();//1. store the hd and kode data

            if(!map.containsKey(curr.hd)){//2.if not map contain hd location
                map.put(curr.hd,curr.node.data);
            }

            if(curr.node.left!=null){ //3. if left node is not null
                q.add(new pair(curr.hd-1,curr.node.left));//hd-1 because those are negative side in node
            }

            if(curr.node.right!=null){ //4.if right node is not null
                q.add(new pair(curr.hd+1,curr.node.right));//hd+1 because those are positive side in node
            }
        }
        //5. add the map elements in arraylist because we return the array list in code interview
        ArrayList<Integer>ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    //Bottom View
    public ArrayList<Integer>bottomView(kode root){
        Queue<pair>q=new ArrayDeque<>(); // ArrayDeque
        Map<Integer,Integer>map= new TreeMap<>(); //,map

        q.add(new pair(0,root));//0.add the first root in the queue
        while(!q.isEmpty()){
            pair curr = q.poll();//1. remove and store the current element
            map.put(curr.hd,curr.node.data);//2.we do not check here the index value present
            //or not we just update those value with new one's;

            if(curr.node.left!=null){//3.if left node is not null;
                q.add(new pair(curr.hd-1, curr.node.left));
            }
            if(curr.node.right!=null){ //4. if right node is not null
                q.add(new pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(Map.Entry<Integer,Integer>entry: map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}

public class java_49_TopAndBottomView {
    public static void main(String[] args) {
        TopView tab = new TopView();
        kode root =  tab.createTree();
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.right.data);

        ArrayList<Integer> ans = tab.TopViewBT(root);
        System.out.println("Top View: ");
        for(int x:ans){
            System.out.print(x+" ");
        }

        System.out.println();

        ArrayList<Integer>ans1 = tab.bottomView(root);
        System.out.println("Bottom View: ");
        for(int y:ans1){
            System.out.print(y+" ");
        }
    }
}
