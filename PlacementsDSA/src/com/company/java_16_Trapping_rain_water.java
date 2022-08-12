package com.company;
public class java_16_Trapping_rain_water
{
    static int trappingWater(int []arr){
        int n = arr.length;
        int []left = new int[n];
        int []right = new int [n];

        // now,Find the left side of greater building -> ->
        left[0]=arr[0];// well,in this case the first building is greater always
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i]);// in left array , compare with prev one
        }

        right[n-1] = arr[n-1];//similar to the left array,we can
        // store right side building as  always greater  <- <-
        for(int i=n-2;i>=0;i--){
            right[i] = Math.max(right[i+1],arr[i]); // in the right array, compare with their
            // next element because the array is reverse in loop
        }
        //Finally, check the smallest element in left and right array and subtract from the
        // array's current index

        int ans = 0;
        for(int i =0;i<n;i++){
            ans +=(Math.min(left[i],right[i])-arr[i]); // find the min value and subtract from current index of array
        }
        return ans;
    }

    public static void main(String[] args) {
int []a ={0,1,0,2,1,0,1,3,2,1,2,1};
int ans =trappingWater(a);
        System.out.println(ans );
    }
}