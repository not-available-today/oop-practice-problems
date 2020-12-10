package com.company.coffeemachine.models;

public abstract class Drink {

    //region Properties
    private int sugarCount;
    private String type;
    private boolean hasStick;
    private boolean hasMilk;
    //endregion

    //region Constructors

    //endregion

    //region Public Methods


    //endregion

    //region Setters and Getters


    public boolean isHasStick() {
        return hasStick;
    }

    public void setHasStick(boolean hasStick) {
        this.hasStick = hasStick;
    }

    public boolean isHasMilk() {
        return hasMilk;
    }

    public void setHasMilk(boolean hasMilk) {
        this.hasMilk = hasMilk;
    }

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
