package com.company.coffeemachine;

public class Coffee extends Drink{
    //region Properties

    //endregion

    //region Constructors

    //endregion

    //region Public Methods
    public void printReceipt(Drink customerDrink){
        System.out.println("Enjoy your coffee with " + customerDrink.getSugarCount() + " sugars!");

    }

    //endregion

    //region Setters and Getters

    //endregion
}
