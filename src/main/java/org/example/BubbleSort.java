package org.example;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int nums[] = {8,9,4,5,20,1,6};
        int size = nums.length -1;
        int temp = 0;

        System.out.print(Arrays.toString(nums));

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(nums[j] > nums[j+1] ){
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }

            System.out.print("sorted array:  " +Arrays.toString(nums));
    }

}
