package com.company.coffeemachine;

public class Command {
    //region Properties
    private String drinkType;
    private int sugarCount;
    //endregion

    //region Constructors


    public Command() {
    }

    public Command(String drinkType, int sugarCount) {
        this.drinkType = drinkType;
        this.sugarCount = sugarCount;
    }

    //endregion

    //region Public Methods
     public Command processCommand(String[] input){
        Command customerInput = new Command();
        for (int i = 0; i < input.length; i++) {
            if(i == 1){
                int j = Integer.parseInt(input[i]);
                customerInput.setSugarCount(j);
            }else{
                customerInput.setDrinkType(input[i]);
            }

        }
        return customerInput;
    }

    //endregion

    //region Setters and Getters

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
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
