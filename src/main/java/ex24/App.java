/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Harmin Jeong
 */
package ex24;

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");

        System.out.print("Enter the first word. ");
        String string1 = input.nextLine();

        System.out.print("Enter the second word. ");
        String string2 = input.nextLine();

        if(isAnagram(string1, string2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", string1, string2);
        }
        else{
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", string1, string2);
        }

    }

    public static boolean isAnagram(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);

        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);
    }
}
