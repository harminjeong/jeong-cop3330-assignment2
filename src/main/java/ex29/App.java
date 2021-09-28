/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex29;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int rate = rorCalc();

        System.out.printf("It will take %d years to double your initial investment", 72/rate);
    }

    public static int rorCalc() {
        Scanner input = new Scanner(System.in);

        String ror = "";
        boolean is_valid = true;
        while(is_valid){
            System.out.print("What is the rate of return? ");
            ror = input.next();
            if(ror.matches("[0-9]+") && !ror.matches("[0]")){
                break;
            }
            else System.out.println("Sorry. That's not a valid input.");
        }

        return Integer.parseInt(ror);
    }
}
