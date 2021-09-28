/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex33;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's your question?\n> ");
        input.nextLine();

        int answer = rng();

        switch(answer){
            case 0: System.out.println("\nYes.");
                break;
            case 1: System.out.println("\nNo.");
                break;
            case 2: System.out.println("\nMaybe.");
                break;
            default: System.out.println("\nAsk again later.");
        }
    }

    public static int rng(){
        Random rand = new Random();
        return rand.nextInt(4);
    }

}
