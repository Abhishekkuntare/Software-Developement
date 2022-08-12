package com.company;

import java.util.ArrayList;

class depthForSearch{

    // function to return a list containing the DFS traversal of the graph
    public ArrayList<Integer> dfsGraph(int v,ArrayList<ArrayList<Integer>>adj){
        boolean []visited= new boolean[v];//if vertices start from 0 then only pass v
        // if vertices start from 1 then pass v+1
        ArrayList<Integer>ans=new ArrayList<>();// make for these ans finally we return
            for(int i =0;i<v;i++){
                if(!visited[i]){
                    dfs(i,adj,visited,ans);
                }
            }
           // dfs(0,adj,visited,ans); this is for connected components
            return ans;
    }
    public  void dfs(int v,ArrayList<ArrayList<Integer>>adj,boolean []visited,ArrayList<Integer>ans){
        //these vertices not call yet v
        visited[v]=true;//mark as true
        ans.add(v);// added in the ans arrayList

        //for loop for v neighbors
        for(int neighbor:adj.get(v)){
            if(!visited[neighbor]){// if not visited v neighbor
                dfs(neighbor,adj,visited,ans);
            }
        }
    }

}

public class java_62_Depth_for_search {
    public static void main(String[] args) {

    }
}
