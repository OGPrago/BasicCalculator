package com.jg;
//Imported java scanner
import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //Creating scanner
        Scanner scanner = new Scanner(System.in);
        //Declaring variables
        float num1;
        float num2;
        byte mathOp;
        byte add = 1, subtract = 2, multiply = 3, divide = 4;
        float total;

        //Asking user to enter two numbers; and then asking which operation they would like to preform
        System.out.println("Please enter first number: ");
        num1 = scanner.nextFloat();
        System.out.println("Please enter second number: ");
        num2 = scanner.nextFloat();
        System.out.println("What operation would you like to preform? (1)Add, (2)Subtract, (3)Multiply, (4)Divide");
        mathOp = scanner.nextByte();

        //Creating if statements for different options
        if(mathOp == add) {
            total = (float) num1 + num2;
            System.out.println("The total is " + total);
        }
        else if(mathOp == subtract) {
            total = (float) num1 - num2;
            System.out.println("The total is " + total);
        }
        else if(mathOp == multiply) {
            total = (float) num1 * num2;
            System.out.println("The total is " + total);
        }
        else if(mathOp == divide) {
            total = (float) num1 / num2;
            System.out.println("The total is " + total);
        }

    }
}
