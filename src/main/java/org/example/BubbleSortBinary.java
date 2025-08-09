package org.example;

import java.util.Arrays;

public class BubbleSortBinary {
    public static void main(String[] args) {

        int[] arr = {23, 5, 17, 12, 1, 29, 3, 10};
        int target = 17;
        int size = arr.length -1;
        int temp = 0;

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }

      System.out.println(Arrays.toString((arr)));

        int[] sortedArray = arr;

        int result = binarySearch(sortedArray,target);

        if(target != -1) {
            System.out.println("the inded of the number is " + result);
        }else{
            System.out.println("no elements found here");
        }
    }

    private static int binarySearch(int[] sortedArray, int target) {
        int left = 0;
        int right = sortedArray.length -1;

        while(left <= right){
            int mid = (left + right) / 2;
            if(sortedArray[mid] == target){
                return mid;
            }else if(sortedArray[mid] < target){
                left = mid+1;
            }else {
                right = left - 1;
            }
        }
        return -1;
    }
}
