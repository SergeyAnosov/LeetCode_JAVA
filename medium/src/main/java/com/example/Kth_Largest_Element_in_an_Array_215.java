package com.example;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array_215 {

    public static void main(String[] args) {

        int[] input = {3,2,1,5,6,4};
        int kthLargest = Kth_Largest_Element_in_an_Array_215.findKthLargest(input, 2);
        System.out.println(kthLargest);

        System.out.println("---------------------------------------------");


        int[] input1 = {3,2,3,1,2,4,5,5,6};
        int kthLargest1 = Kth_Largest_Element_in_an_Array_215.findKthLargest(input1, 4);
        System.out.println(kthLargest1);

    }

    public static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.poll();
    }
}
