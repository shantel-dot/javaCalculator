package com.tts;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calculator {



    public static void main(String[] args)  {

        double num1;
        double num2;
        double ans;
        char op;
        Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers but leave a space in between" + ": ");

        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        System.out.print("\nEnter an operator (+, -, *, /): ");
        op = reader.next().charAt(0);
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is :\n");
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.println("");


        double num3;
        double answer;


        System.out.println("R=Square Root....S=Sin....C=Cos....T=Tangent");

        System.out.print("Enter a number to find one of these results : ");
        num3 = reader.nextDouble();

        System.out.print("\nEnter an operator (R, S, C, T): ");
        op = reader.next().charAt(0);
        switch (op) {
            case 'R':
            case 'r':
                ans = Math.sqrt(num1);
                break;
            case 'S':
            case 's':
                ans = Math.sin(Math.toRadians(num1));
                break;
            case 'C':
            case 'c':
                ans = Math.cos(Math.toRadians(num1));
                break;
            case 'T':
            case 't':
                ans = Math.tan(Math.toRadians(num1));
                break;
            default:
                System.out.printf("Error! Enter correct operator");
                return;
        }
        System.out.print("\nThe result is given as follows:\n");
        System.out.println(num1 + " " + op + " " + num2 + " = " + ans);
        System.out.println("");


        System.out.println("Choose a Currency Exchange type: ");
        System.out.println("1) USD to €");
        System.out.println("2) € to USD");
        System.out.println("3) £ to USD");

        int exchange = reader.nextInt();
        switch (exchange) {
            case 1: {
                System.out.println("Enter a US Dollar amount to convert to Euros" + " : ");

                double usd = reader.nextDouble();

                if (usd >= 0) {
                    System.out.println(" US Dollars =  " + usd * 0.908 + " €(Euros) ");
                } else {
                    System.out.println("Enter a US Dollar amount to convert to Euros" + " : ");
                }
            }
            break;
            case 2: {
                System.out.println("Enter a dollar amount to convert Euros to US Dollars" + " : ");
                double euro = reader.nextDouble();

                if (euro >= 0) {
                    System.out.println(euro + " €(euros) = " + euro * 1.101 + " US Dollars ");
                } else {
                    System.out.println("Enter a dollar amount to convert Euros to US Dollars" + " : ");
                }
            }
            break;

            case 3: {
                System.out.println("Enter a dollar amount to convert pounds to US Dollars: ");
                double pounds = reader.nextDouble();

                if (pounds >= 0) {
                    System.out.println(pounds + " £(pounds) is " + pounds * 1.28 + " US Dollars ");
                } else {
                    System.out.println("Enter a dollar amount to convert pounds to US Dollars: ");
                }
            }
            break;
        }
        reader.close();



    }
}


