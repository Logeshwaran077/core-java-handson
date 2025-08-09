package org.example;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {3, 6, 11, 15, 19, 22, 27, 31, 36, 40};
        int target = 27;
        int result = binarySearch(arr,target);
        if(target != -1){
            System.out.println(result);
        }else{
            System.out.println("element not found here");
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right =  arr.length -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                left = mid + 1;
            }else{
               right = mid - 1;
            }
        }
        return -1;
    }
}
//
//int[] arr = {3, 6, 11, 15, 19, 22, 27, 31, 36, 40};
//int target = 27;
