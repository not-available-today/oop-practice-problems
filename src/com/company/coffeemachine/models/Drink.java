package com.company.coffeemachine.models;

public abstract class Drink {

    //region Properties
    private int sugarCount;
    private String type;
    //endregion

    //region Constructors

    //endregion

    //region Public Methods


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
