package com.company;

public class java_21_container_with_mostWater {
    public static int mostWater (int []height) {
        int low =0,high = height.length-1, max = 0;
        while(low<high){
            if(height[low]<height[high]){
                int len = high - low;
                max =Math.max(max,height[low]*len);
                low +=1;
            }else{
                int len =high-low;
                max = Math.max(max,height[high]*len);
                high -=1;
            }
        }
return max;

//        int max =0;
//        int low =0;
//        int high = height.length-1;
//        while(low<high){
//            if(height[low]<height[high]){
//                max = Math.max(max,height[low]*(high-low));
//                low +=1;
//            }else{
//                max = Math.max(max,height[high] * (high-low));
//                high -=1;
//            }
//        }
//        return max;
    }
    public static void main(String[] args) {
          int []arr=  { 1,8,6,2,5,4,8,3,7};
        int ans = mostWater(arr);
//        System.out.printf("%d",ans);
        System.out.println(ans);
    }
}
