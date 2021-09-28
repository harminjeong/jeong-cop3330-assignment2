/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex25;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a password. ");
        String password = input.nextLine();

        switch(passwordValidator(password)){
            case 0: System.out.printf("The password '%s' is a very weak password.", password);
                break;
            case 1: System.out.printf("The password '%s' is a weak password.", password);
                break;
            case 2: System.out.printf("The password '%s' is a strong password.", password);
                break;
            case 3: System.out.printf("The password '%s' is a very strong password.", password);
                break;
            default: System.out.println("Invalid input!");
        }

    }

    public static int passwordValidator(String password){
        int testPass;

        char[] test = password.toCharArray();

        int isNum = 0, isLet = 0, isSpe = 0;
        for(int i = 0; i < test.length; i++) {
            if(Character.isDigit(test[i])) {
                isNum = 1;
            }
            else if (Character.isAlphabetic(test[i])) {
                isLet = 1;
            }
            else if (!Character.isLetterOrDigit(test[i])){
                isSpe = 1;
            }
            if(isNum == 1 && isLet == 1 && isSpe == 1) {
                break;
            }
        }

        if(isNum == 1 && isLet == 0){
            testPass = 0;
        }
        else if(isNum == 0 && isLet == 1){
            testPass = 1;
        }
        else if(isSpe == 0 && password.length() >= 8){
            testPass = 2;
        }
        else if(isSpe == 1 && password.length() >= 8){
            testPass = 3;
        }
        else{
            testPass = 0;
        }

        return testPass;
    }

}
