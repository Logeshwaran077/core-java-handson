package org.example;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int nums[] = {9, 3, 10, 5, 2, 4};
        int size = nums.length;
        int temp = 0;
        int midIndex = -1;

        for (int i = 0; i < size - 1; i++) {
            midIndex = i;
            for (int j = i; j < size; j++) {
                if (nums[midIndex] > nums[j])
                    midIndex = j;
            }
            temp = nums[midIndex];
            nums[midIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
