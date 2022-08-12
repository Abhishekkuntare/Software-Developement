package com.company;
import java.util.*;

class SlidingWindowMaximum{
//    public void bruteForce(int []arr,int n, int k)
//    {
//        for(int i=0;i<=n-k;i++){// why n-k? this is no. sliding window
//            int max=arr[i];
//            for(int j = 0;j<k;j++){
//               if(arr[i+j]>max){
//                   max =arr[i+j];
//               }
//            }
//            System.out.print(max+" ");
//        }
//
//    }
    // using heap means priority queues
    public ArrayList<Integer> findKMaxElement(int[] arr, int k, int n) {
        // creating the max heap ,to get max element always
        PriorityQueue<Integer> queue = new PriorityQueue<>(
                Collections.reverseOrder());

        ArrayList<Integer> res = new ArrayList<>();
        int i = 0;

        for (; i < k; i++)
            queue.add(arr[i]);

        // adding the maximum element among first k elements
        res.add(queue.peek());

        // removing the first element of the array
        queue.remove(arr[0]);

        // iterarting for the next elements
        for (int j=3; j < n; j++) {

            // adding the new element in the window
            queue.add(arr[j]);

            // finding & adding the max element in the
            // current sliding window
            res.add(queue.peek());

            // finally removing the first element from front
            // end of queue
            queue.remove(arr[j - k + 1]);
        }

        return res;
    }

    // using dequeue
    public void printMax(int []arr,int n,int k) {
            Deque<Integer> Qi = new LinkedList<>();
            int i;
            for (i = 0; i < k; ++i) {

                while (!Qi.isEmpty() && arr[i] >= arr[Qi.peekLast()]) {
                     Qi.removeLast();
                }
                Qi.addLast(i);
            }
            for (i=3; i < n; ++i) {
                System.out.print(arr[Qi.peek()] + " ");

                while ((!Qi.isEmpty()) && Qi.peek() <= i - k) {
                    Qi.removeFirst();
                }

                while ((!Qi.isEmpty()) && arr[i] >= arr[Qi.peekLast()]) {
                    Qi.removeLast();
                }

                Qi.addLast(i);
            }

            System.out.print(arr[Qi.peek()]);
        }
    }

public class java_47_SlidingWindowMaximum {
    public static void main(String[] args) {
        SlidingWindowMaximum swm = new SlidingWindowMaximum();
        int[] arr = { 4,1,3,5,2,3,2,1,1,5 };
        int k = 3, n = arr.length;

        //  swm.bruteForce(arr,n,k);
        List<Integer> res = swm.findKMaxElement(arr, k, n);
        for (int x : res)
        System.out.print(x + " ");
        System.out.println();
       swm.printMax(arr, arr.length, k);
    }

}