package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Kth_Largest_Element_in_an_Array_215Test {

    @Test
    void findKthLargest() {


        int[] input = {3,2,1,5,6,4};
        int kthLargest = Kth_Largest_Element_in_an_Array_215.findKthLargest(input, 2);

        Assertions.assertEquals(5, kthLargest);



    }

    @Test
    void findKthLargest1() {

        int[] input = {3,2,3,1,2,4,5,5,6};
        int kthLargest1 = Kth_Largest_Element_in_an_Array_215.findKthLargest(input, 4);

        Assertions.assertEquals(4, kthLargest1);
    }
}