package ex38;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String data = input.nextLine();

        String list[] = data.split(" ");

        Integer evenNum[] = listEven(list);

        System.out.print("The even numbers are ");
        for(int i=0; i<evenNum.length; i++){
            if(i < evenNum.length-1){
                System.out.print(evenNum[i] + " ");
            }
            else{
                System.out.print(evenNum[i] + ".");
            }
        }
    }

    public static Integer[] listEven(String list[]) {

        ArrayList<Integer> newList = new ArrayList<>();

        for(int i=0; i<list.length; i++){

            int num = Integer.parseInt(list[i]);

            if(num % 2 == 0){

                newList.add(num);
            }
        }

        Integer[] arr = new Integer[newList.size()];
        arr = newList.toArray(arr);

        return arr;
    }
}