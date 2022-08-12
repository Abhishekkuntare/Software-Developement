package com.company;

public class java_28_heap_delete {
    public static void hepify(int []arr,int n,int i){
        int largest =i;

        int l = 2*i+1; // left child position
        int r = 2*i+2; // right child position
        if(l<n && arr[l]>arr[largest]){ // check the left child is greater or not
            largest = l;
        }
        if(r<n && arr[r]>arr[largest]){//check the right child is greater of not
            largest = r;
        }
        if(largest!=i){ // then swap it
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            hepify(arr,n,largest);
        }
    }
public static int delete(int []arr,int n){
        int largest = arr[n-1]; //get the last element
         arr[0] = largest; //delete the root
        n = n-1; // get the last get element
        hepify(arr,n,0);
        return n;
}

public static void display(int []arr,int n){
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
}
    public static void main(String[] args) {
        int arr[] = { 40,30,10,20,15};
        int n = arr.length;
        display(arr,n);

        // The function delete the element to the heap and
        // returns the new size of the array
        n = delete(arr,n);
        System.out.println("");
        display(arr,n);
    }
}
