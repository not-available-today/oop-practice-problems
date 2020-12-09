package com.company.coffeemachine;

import com.company.coffeemachine.models.Coffee;
import com.company.coffeemachine.models.Drink;
import com.company.coffeemachine.models.Tea;

public class CoffeeMachine {
    //region Properties

    //endregion

    //region Constructors

    //endregion

    //region Public Methods
    public Drink makeDrink(Command command){
        if(command.getDrinkType() == DrinkType.COFFEE){
            Coffee coffee = new Coffee();
            coffee.setSugarCount(command.getSugarCount());
            return coffee;
        }else if(command.getDrinkType()== DrinkType.TEA){
            Tea tea = new Tea();
            tea.setSugarCount(command.getSugarCount());
            return tea;
        }
        return null;
    }

    //endregion

    //region Setters and Getters

    //endregion
}
