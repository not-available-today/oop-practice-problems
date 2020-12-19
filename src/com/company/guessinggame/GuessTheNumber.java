package com.company.guessinggame;

import java.util.ArrayList;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }


        System.out.println(numbers);
        int first = numbers.get(0);
        int last = numbers.get(99);
        int guess = (first+last) / 2;
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = false;
        while(!isTrue){

            System.out.println("Is your number less than, greater than or equal to " + guess + "?" +
                    "\n(enter '<' for less than, '>' for greater than, or '=' if true");
            String input = scanner.nextLine();
            if(input.equals("<")){
                last = guess -1;
                guess = (first+last)/2;

            }else if(input.equals(">")){
                first = guess + 1;
                guess = (first+last)/2;
            }else if(input.equals("=")){
                System.out.println("Your number is " + guess);
                isTrue = true;
            }else{
                System.out.println("Please input a valid option");
            }
        }
    }
}
