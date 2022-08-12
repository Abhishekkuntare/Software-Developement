package com.company;

import java.util.ArrayList;
import java.util.Collections;

class Edge implements Comparable<Edge>{
    int src,dest,wt;
    //constructor
    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt =wt;
    }
    public int compareTo(Edge that){
        return this.wt-that.wt;
    }

    int p[],rank[];

    //find the union
    public void union(int x,int y){
        int rx = find(x);//root of x
        int ry = find(y);// root of y
        if(rx == ry){
            return;
        }
        p[ry]=rx;
    }
    // find the find
    public int find(int x){
        if(p[x]==x)return x;
        return find(p[x]);
    }

    public int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>>adj){
        boolean added[][] = new boolean[V][V];
        ArrayList<Edge>edges = new ArrayList<>();

        //put all edges and make the edge arrayList
        for(int i=0;i<adj.size();i++){
            for(int j=0;j<adj.get(i).size();j++){
                ArrayList<Integer>cur = adj.get(i).get(j);
                if(!added[i][cur.get(i)]){//if not added in list then
                    added[i][cur.get(0)]=true;//mark as true
                    added[cur.get(0)][i]=true;//mark as true
                    edges.add(new Edge(i,cur.get(0),cur.get(1)));//finally add in to the arrayList
                }
            }
        }

        p = new int[V];//initialise the parent array with vertex
        for(int i=0;i<V;i++){//loop will up to V-1 times
            p[i]=i; //fill the values
        }

        // main logic starts here

        //sort the edges with their weights
        Collections.sort(edges); // how we compare here because we implement the comparable method
        int count =1;
        int ans =0;//total sum

        for(int i=0;count<V;i++){
            Edge edge = edges.get(i);//put one by one edges
            int rx = find(edge.src);// find src representative
            int ry = find(edge.dest);// find dest representative

            if(rx!=ry){ //if their representative are different set then add in one set
                union(rx,ry); // they are in different set union of that
                count++;//then increment the count because our one edge would be added
                ans +=edge.wt;// and then added the edge weight in ans variable
            }
        }return ans;
    }
}


public class java_71_KruskalsAlgorithm_minimum_spannig_tree {
    public static void main(String[] args) {

    }
}
