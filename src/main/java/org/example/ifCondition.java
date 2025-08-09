package org.example;

import java.util.Scanner;

public class ifCondition {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2. Read a string
        System.out.print("Enter your Marks: ");
        int name = scanner.nextInt();

        if(name >= 80 & name<= 100){
            System.out.println("Your Grade is A");
        }else if(name >=60 && name <=79){
            System.out.println("Your Grade is B");
        }else if(name >=40 && name <=59){
            System.out.println("Your Grade is c");
        }else{
            System.out.println("invalid score here");
        }


        scanner.close();

    }
}
