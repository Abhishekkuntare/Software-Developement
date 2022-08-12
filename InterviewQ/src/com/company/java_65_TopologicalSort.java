package com.company;
import java.util.ArrayList;
import java.util.Stack;

class TopologicalSort{
    //return the int array
    public int []topologicalSort(int v,ArrayList<ArrayList<Integer>>adj){
        boolean visited[] = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<v;i++){
            if(!visited[i]){
                dsf(adj,i,stack,visited);
            }
        }
        int []ans = new int[v];
        int i =0;

        while(!stack.isEmpty()){
            ans[i++] = stack.pop();// put all the values in the ans
            // array from poping the stack
        }
        return ans;
    }
    public void dsf(ArrayList<ArrayList<Integer>>adj,int v,
                    Stack<Integer>stack,boolean []visited){
        visited[v] =true;
        for(int neighbor: adj.get(v)){
            if(!visited[neighbor]){
                dsf(adj,neighbor,stack,visited);
            }
        }
        stack.push(v);// at the end push all the vertices in the stack
    }
}
public class java_65_TopologicalSort {
    public static void main(String[] args) {

    }
}
