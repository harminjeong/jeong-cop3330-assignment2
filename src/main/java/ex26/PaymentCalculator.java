/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex26;

import java.util.Scanner;

public class PaymentCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double i, b, p;

        System.out.print("What is your balance? ");
        b = input.nextInt();
        System.out.print("What is the APR on the card (as a percent)? ");
        i = input.nextInt();
        System.out.print("What is the monthly payment you can make? ");
        p = input.nextInt();
        System.out.printf("It will take you %d months to pay off this card.", calculateMonthsUntilPaidOff(b, i, p));

    }

    public static int calculateMonthsUntilPaidOff(double b, double i, double p){

        i = i/36500;

        return (int) ( Math.round( (-1.0/30.0) * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / Math.log(1 + i)) + 1);

    }
}