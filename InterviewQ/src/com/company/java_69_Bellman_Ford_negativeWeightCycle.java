package com.company;

import java.util.Arrays;

// dist -distance , dest - destination, src - source ,
class negativeCycle{
    //if negative cycle is present then return 1 or 0
    public int isNegativeCycle(int n, int[][]edges){
        int dist[] = new int[n];
        //make the dist array infinity default
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0] =0;// make source any one we make the 0
        for(int count =1;count<n;count++){// loop will run n-1 times
            for(int j=0;j<edges.length;j++){ // loop will run no. edeges
                //initialize the src dest and weight;
                int src = edges[j][0];
                int dest = edges[j][1];
                int weight = edges[j][2];
                //we check the condition of max value if not check then it will coverted into negative value
                if(dist[src]!=Integer.MAX_VALUE && dist[src]+weight<dist[dest]){//if src +weight < dest
                    dist[dest]=dist[src]+weight; //update it
                }
            }
        }
        // one more time we're going to perform same operation to check negative cycle present or not
        for(int j=0;j<edges.length;j++){
            int src = edges[j][0];
            int dest =edges[j][1];
            int weight = edges[j][2];
            if(dist[src]!=Integer.MAX_VALUE && dist[src]+weight < dist[dest]){
                dist[dest]=dist[src]+weight;
                return 1;//negative cycle is got
            }
        }
        return 0;
    }
}

public class java_69_Bellman_Ford_negativeWeightCycle {
    public static void main(String[] args) {

    }
}
