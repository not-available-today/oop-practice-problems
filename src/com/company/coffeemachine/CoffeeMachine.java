package com.company.coffeemachine;

public class CoffeeMachine {
    //region Properties

    //endregion

    //region Constructors

    //endregion

    //region Public Methods
    public Drink makeDrink(Command command){
        if(command.getDrinkType().equals("C")){
            Drink drink = new Coffee();
            drink.setType(command.getDrinkType());
            drink.setSugarCount(command.getSugarCount());
            return drink;
        }else if(command.getDrinkType().equals("T")){
            Drink drink = new Tea();
            drink.setType(command.getDrinkType());
            drink.setSugarCount(command.getSugarCount());
            return drink;
        }

        return null;
    }

    //endregion

    //region Setters and Getters

    //endregion
}
