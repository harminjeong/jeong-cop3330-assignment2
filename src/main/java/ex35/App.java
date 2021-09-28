/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex35;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class App {

    public static void main( String[] args )
    {
        Scanner input = new Scanner (System.in);
        int randomNum;
        String scan ="";
        Random rand = new Random();
        boolean notBlank = true;
        ArrayList <String> names = new ArrayList<String>();
        int index = 0;

        while(notBlank){
            System.out.print("Enter a name: ");
            scan = input.nextLine();

            if(scan.length()>0){
                names.add(index, scan);
                index++;
            }
            else {
                randomNum = rand.nextInt((names.size() - 1) + 1) + 1;
                System.out.println("The winner is... " + names.get(randomNum)+".");
            }
        }
        input.close();
    }

}