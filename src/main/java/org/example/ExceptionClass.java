package org.example;

public class ExceptionClass {

    public static void main(String[] args) {

        int a = 2;
        int b = 0;
        int nums[] = new int[5];
        String str = null;

        try{
            System.out.println(18/a);
            System.out.println(nums[1]);
            System.out.println(nums[4]);
            System.out.println(str.length());
        }catch(ArithmeticException e){
            System.out.println("Error");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("array error" + e);
        }catch(Exception e){
            System.out.println("Something went wrong...");
        }

        System.out.println("Byeee");
    }
}
