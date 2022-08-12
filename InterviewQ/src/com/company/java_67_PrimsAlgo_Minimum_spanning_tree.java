package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;

class pairr implements Comparable<pairr>{
    int wt;
    int v;
    pairr(int v ,int wt){
        this.v = v;
        this.wt = wt;
    }

    @Override
    public int compareTo(pairr that) {
        return this.wt- that.wt;
    }
}

class primsAlgo{
    public int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>>adj){

        boolean []visited = new boolean[v];//1. create a boolean array
        PriorityQueue<pairr>q  = new PriorityQueue<>();//2. create ans pq with pair DS

        q.add(new pairr(0,0));//3. we put the pair (0,0)
        int ans =0; //4.create the ans var

        while(q.size()!=0){
            pairr curr= q.remove();//5. remove the element and store in curr
            int u =curr.v; //6.curr vertex store in u

            if(visited[u]){ //7. if curr vertex is already visited then skip that vertex and check next one
                continue;
            }

            ans +=curr.wt; //8.if curr vertex is not visited then curr weight added in the ans variable
            visited[u]=true;//9.and mark as true

            ArrayList<ArrayList<Integer>>neighbors =adj.get(u); //10.get the neighbors of u

            for(ArrayList<Integer> list:neighbors){
                int vertex=list.get(0);//11. find the vertex placed at o'th index
                int wt= list.get(1); //12. find the weight placed at 1'th index

                if(visited[vertex]==false){ //13. if vertex is not already visited then
                    q.add(new pairr(vertex,wt));//14. then add in our priority queue
                }
            }
        }
        return ans; // finally return the ans
    }
}

public class java_67_PrimsAlgo_Minimum_spanning_tree {
    public static void main(String[] args) {

    }
}
