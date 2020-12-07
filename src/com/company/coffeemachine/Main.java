package com.company.coffeemachine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();


        Command command = new Command();
        command = command.processCommand(input.split(":"));


        CoffeeMachine coffeeMachine = new CoffeeMachine();


        Drink customerDrink = coffeeMachine.makeDrink(command);


        customerDrink.printReceipt(customerDrink);

    }
}
