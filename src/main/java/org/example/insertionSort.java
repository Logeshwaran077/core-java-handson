package org.example;

import java.util.Arrays;

public class insertionSort {
    public static void main(String[] args) {
        int nums[] = {9, 3, 10, 5, 2, 4};

        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j >= 0 && nums[j] > key) {   //j must be non negative so we are using j>=0

                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
        System.out.println(Arrays.toString(nums));
    }
}