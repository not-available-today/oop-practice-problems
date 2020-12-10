package com.company.coffeemachine;

public class Command {
    //region Properties
    private DrinkType drinkType;
    private int sugarCount;
    private boolean hasStick;
    private boolean hasMilk;
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
        this.hasMilk = !split[2].equals("0");
    }

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
