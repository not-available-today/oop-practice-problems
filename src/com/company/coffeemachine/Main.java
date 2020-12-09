package com.company.coffeemachine;

import com.company.coffeemachine.models.Drink;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your order(Drink:Number of Sugars): ");
        Command command = new Command(scanner.nextLine());

        //command = command.processCommand();

        CoffeeMachine coffeeMachine = new CoffeeMachine();
        Drink customerDrink = coffeeMachine.makeDrink(command);


        System.out.println(customerDrink.toString());


    }
}
