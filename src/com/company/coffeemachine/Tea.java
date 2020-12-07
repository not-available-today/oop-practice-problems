package com.company.coffeemachine;

public class Tea extends Drink {

    //region Properties

    //endregion

    //region Constructors

    //endregion

    //region Public Methods

    @Override
    public void printReceipt(Drink customerDrink) {
        System.out.println("Enjoy your tea with " + customerDrink.getSugarCount() + " sugars!");
    }

    //endregion

    //region Setters and Getters

    //endregion
}
