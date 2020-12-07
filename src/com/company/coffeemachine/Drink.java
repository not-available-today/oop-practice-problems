package com.company.coffeemachine;

public abstract class Drink {

    //region Properties
    private int sugarCount;
    private String type;
    //endregion

    //region Constructors

    //endregion

    //region Public Methods
    public abstract void printReceipt(Drink customerDrink);

    //endregion

    //region Setters and Getters

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    //endregion
}
