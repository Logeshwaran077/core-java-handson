package org.example;

public class Main {
    public static void main(String[] args) {

        int nums[] = {5,6,7,8,12,14};
        int target = 12;
        int result = linearSearch(nums, target);

        if(target !=-1)
            System.out.println("the index of the number is : " +result);
        else
            System.out.println("no number is found here");
    }

    private static int linearSearch(int[] nums, int target) {

        for(int i=0;i<nums.length;i++)
            if(nums[i] == target)
                return i;
        return -1;
    }
}