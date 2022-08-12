package com.company;
import java.util.Arrays;
import java.util.PriorityQueue;

import java.util.ArrayList;

class Dijkstras{
    //1.create a pair
    class pairrr implements Comparable<pairrr>{
        int wt;//weight
        int v;//vertex
        pairrr(int v,int wt){
            this.v = v;
            this.wt = wt;
        }
        public int  compareTo(pairrr that){
            return this.wt-that.wt;
        }
    }

    //2. main function
    public int[] shortestPathDistance(int v, ArrayList<ArrayList<ArrayList<Integer>>>adj, int S){
        boolean []visited = new boolean[v];
        PriorityQueue<pairrr> q = new PriorityQueue<>();

        q.add(new pairrr(S,0));//passes the source
        int[] ans =new int[v]; //create integer array
        Arrays.fill(ans,10000000); // fill the array with size of 10^7
        ans[S]=0;//0th index is the source value

        while(q.size()!=0){
            pairrr curr = q.remove();

            int u =curr.v;//store the curr vertex v in the u variable
            if(visited[u]){//if the curr vertex which is u is visited then skip that one
                continue;
            }
            visited[u]=true;//if not visited mark as true;

            //then go the for all u's neighbor
            ArrayList<ArrayList<Integer>>neighbors = adj.get(u);// get the u neighbor
            for(ArrayList<Integer>list:neighbors){ // go for all neighbors
                int vertex = list.get(0);//get their vertex
                int weight = list.get(1);//get their weight

                //and check, the vertex distance is greater than ans[u] +wt then update it
                if(ans[vertex]>ans[u]+weight){
                    ans[vertex] = ans[u]+weight;
                    q.add(new pairrr(vertex,ans[vertex])); // and added into the queue
                }
            }
        }
        return ans;

    }
}

public class java_68_DijkstrasAlgo_shortest_path_distance {
    public static void main(String[] args) {

    }
}
