package com.company.characterFrequency;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        CharacterFrequency frequency = new CharacterFrequency();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a string: ");
        String userInput = scanner.nextLine();
        frequency.firstRepeat(userInput);
        frequency.firstNonRepeat(userInput);

    }

}

