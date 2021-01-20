package com.tts;
import java.util.*;

public class Main {

    public static void main(String[] arg){
        List<Integer> integerList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num1 = scanner.nextInt();
        integerList.add(num1);
        System.out.println("What is your second number: ");
        int num2 = scanner.nextInt();
        integerList.add(num2);
        System.out.println("What is your third number: ");
        int num3 = scanner.nextInt();
        integerList.add(num3);
        System.out.println("What is your fourth number: ");
        int num4 = scanner.nextInt();
        integerList.add(num4);
        System.out.println("What is your last number: ");
        int num5 = scanner.nextInt();
        integerList.add(num5);
        int sum = Math.sum(integerList);
        int prod = Math.product(integerList);
        System.out.format("The smallest number you chose was: " + Collections.min(integerList));
        System.out.format("\nThe largest number you chose was: " + Collections.max(integerList));
        System.out.format("\nThe sum of the numbers were: " + sum);
        System.out.format("\nThe product of the numbers were: " + prod);
    }
}

