/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex28;

import java.util.Scanner;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        int count = 0;
        for (int i=0;i<5;i++){
            System.out.println("Enter a number: ");
            count = count + input.nextInt();
        }
        System.out.println("The total is " + count + ".");
    }

}
