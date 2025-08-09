package org.example;

public class BinarySearchProblem {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8};
        int target = 7;
        int result = binarySearch(arr,target);

        if(target != -1){
            System.out.println("the search for the element is"   +result );
        }else{
            System.out.println("no elements found here");
        }

    }

    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = (left + right) /2;
            if(arr[mid] == target){     //mistake are doing regularly here.
                return mid;
            }else if(arr[mid] < target){
                  left = mid + 1;
            }else {
                right = mid -1;
            }
        }
        return -1;
    }
}


//problem solving here...
