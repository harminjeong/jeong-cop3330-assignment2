/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex31;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Resting Pulse ");
        int hr = input.nextInt();

        System.out.print("Age: ");
        int age = input.nextInt();

        createTable(hr, age);
    }

    public static void createTable(int hr, int age){
        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        int bpm;
        for(int i = 55; i <= 95; i += 5){
            System.out.printf("%d%%          |", i);
            bpm = calcBPM(hr, age, i/100.0);
            System.out.printf(" %d bpm\n", bpm);
        }
    }
    public static int calcBPM(int hr, int age, double intensity){
        return (int) Math.round((((220 - age) - hr) * intensity) + hr);
    }
}