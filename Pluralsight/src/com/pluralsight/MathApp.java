package com.pluralsight;

import java.util.Scanner;

public class MathApp {
    public static void main(String[] args) {
//        Question 1
        int bobSalary = 15788;
        int garySalary = 20000;
        int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);
        System.out.println("-------------");

//        Question 2
        int carPrice = 12;
        int truckPrice = 5;
        int smallestVariable = Math.min(carPrice, truckPrice);
        System.out.println("The smallest variable is " + smallestVariable);
        System.out.println("-------------");

//        Question 3





//        Question 4
           double squareRoot = Math.sqrt(5.0);

           System.out.println(squareRoot);
           System.out.println("-------------");

//        Question 5
        double num1 = 5;
        double num2 = 10;
        double num3 = 85;
        double num4 = 50;
        double distance1 = Math.hypot(num1, num2);
        double distance2 = Math.hypot(num3, num4);
        System.out.println("The distance for group 1 is " + distance1);
        System.out.println("The distance for group 2 is " + distance2);

        System.out.println("-------------");

//        Question 6
        double absValue = Math.abs(-3.8);

        System.out.println("The absolute value is " + absValue);
        System.out.println("-------------");

//        Question 7
            int randomNum = (int)(Math.random() * 1);
            System.out.println("The random number generated is " + randomNum);
        System.out.println("-------------");

        Scanner userInput = new Scanner(System.in);

        String name;
        String type;


        type = userInput.nextLine();
        quantity = userInput.nextLine();
        name = userInput.nextLine();

//        Logic
        if(type.equals("s"))
        {
            pricePerDozen = 5.99;
        }
        else {
            pricePerDozen = 7.99;
        }

        totalPrice = pricePerDozen * quantity;


        System.out.println("Order for " + name);
        System.out.println(type);
        System.out.println(quantity);
    }

}