package com.company;



public class java_20_searchInRoatedArray {
    public static int rotatedArray(int []arr,int key){
        int low = 0,high=arr.length-1;
        while(low<=high){
            int mid =(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[low]<arr[mid]){ // check the left most array
                if(key>=arr[low]&&key<arr[mid]){  //means key is between the left array
                    high = mid-1;
                }else{
                    low = mid+1;// remove the left array and going to right most array
                }
            }else{ // check the right most array
                if(key>arr[mid]&&key<=arr[high]){
                    low = mid+1;
                }else{
                    high = mid-1; // remove the right array and going to left most array
                }
            }
        }
        return -1;


    }
    public static void main(String[] args) {
            int []arr = {40,50,60,10,20};
        int ans =     rotatedArray(arr,10);
        System.out.println(ans);
    }
}
