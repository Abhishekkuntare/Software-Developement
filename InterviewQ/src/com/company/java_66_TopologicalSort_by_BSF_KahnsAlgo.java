package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class topologicalSortBsf{
    public int []topologicalSort(int V,ArrayList<ArrayList<Integer>>adj) {

    // find the inDegree to all vertices
     int inDegree[] = new int[V];
     for(ArrayList<Integer>list:adj){
         for(Integer e:list){
             inDegree[e]++;
         }
     }
        boolean visited[] = new boolean[V];
        ArrayList<Integer>ansList = new ArrayList<>();
        bfs(adj,V, 0,ansList,visited,inDegree);

        //create a ans array after getting bfs
        int ans[] = new int[V];
        int i =0;
        for(int e:ans){
            ans[i++]=e;
        }
        return ans;
    }

    private void bfs(ArrayList<ArrayList<Integer>> adj, int V, int v,
           ArrayList<Integer> ans, boolean[] visited, int[] inDegree) {
        Queue<Integer> q=new LinkedList<>();

        //1.add those vertices which has 0 degree
        for(int i=0;i<V;i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
        int curr = q.poll();//2. pop and store in curr
        ans.add(curr); //3. and into the ans array

        //4. go the curr neighbor
        for(int neighbor:adj.get(curr)){

            //5.first we decrease the inDegree of neighbor and then check is equal to 0
            if(--inDegree[neighbor]==0){
                q.add(neighbor);//6. after decrementing inDegree get 0 then add in queue

                }
            }
        }

    }


}

public class java_66_TopologicalSort_by_BSF_KahnsAlgo {
    public static void main(String[] args) {

    }
}
