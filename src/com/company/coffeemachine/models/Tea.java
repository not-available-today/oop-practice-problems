package com.company.coffeemachine.models;

public class Tea extends Drink {

    //region Properties

    //endregion

    //region Constructors

    //endregion

    //region Public Methods


    @Override
    public String toString() {
        return "Enjoy your tea with " + this.getSugarCount() + " sugars";
    }

    //endregion

    //region Setters and Getters

    //endregion
}
