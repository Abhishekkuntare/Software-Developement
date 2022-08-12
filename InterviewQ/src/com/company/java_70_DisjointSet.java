package com.company;
class DisjointSet{
    int []rank,parent;
    int n;
    //constructor
    public DisjointSet(int n ){
        rank = new int[n];//contain initially 0 for default
        parent = new int[n];
        this.n = n;
        //initialize the parent array
        for(int i =0;i<n;i++){
            parent[i] = i;
        }
    }
    int find(int x){
        if(parent[x]!=x){ // parent of x is not equal to x
            parent[x] = find(parent[x]); // call parent of x, parent
        }
        return parent[x];
    }

    void union(int x , int y){
        int xRoot = find(x),yRoot= find(y);
        if(xRoot==yRoot){//if xroot and yRoot are equal then return
            return;
        }
        //check by rank
        if(rank[xRoot]<rank[yRoot]){ // if xRoot rank is less then
            parent[xRoot]=yRoot; // make parent of greater one which is yRoot
        }
        else if (rank[yRoot]<rank[xRoot]){
            parent[yRoot] =xRoot;
        }
        //if both rank is same then,
        else{
            parent[yRoot] = xRoot; // make anyone as a parent
            parent[xRoot] = rank[xRoot]+1; // and then increment that parent rank by 1
        }
    }
}

public class java_70_DisjointSet {
    public static void main(String[] args) {

    }
}
