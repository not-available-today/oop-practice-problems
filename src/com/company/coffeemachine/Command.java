package com.company.coffeemachine;

public class Command {
    //region Properties
    private DrinkType drinkType;
    private int sugarCount;
    //endregion

    //region Constructors

    public Command() {
    }

    public Command(DrinkType drinkType, int sugarCount) {
        this.drinkType = drinkType;
        this.sugarCount = sugarCount;
    }

    public Command(String input) {
        String[] split = input.split(":");
        if (split[0].equals("T")) {
            this.drinkType = DrinkType.TEA;
        } else if (split[0].equals("C")) {
            this.drinkType = DrinkType.COFFEE;
        }
        this.sugarCount = Integer.parseInt(split[1]);
    }

    //endregion

    //region Public Methods


    //endregion

    //region Setters and Getters


    public DrinkType getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(DrinkType drinkType) {
        this.drinkType = drinkType;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }


    //endregion

}
