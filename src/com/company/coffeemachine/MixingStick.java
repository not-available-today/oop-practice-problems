package com.company.coffeemachine;

import com.company.coffeemachine.models.Drink;

public class MixingStick {
    private StickType type;

    public MixingStick(Drink drink) {
        if (drink.isHasMilk() & drink.getSugarCount() > 0) {
            this.type = StickType.PLASTIC;
            drink.setHasStick(true);
        }else if(!drink.isHasMilk() & drink.getSugarCount() > 0){
            this.type = StickType.WOOD;
            drink.setHasStick(true);
        }else{
            drink.setHasStick(false);
        }
    }

    public void provideStick(MixingStick stick, Drink drink){
        if(drink.isHasStick()){
            System.out.println("Here is your " + stick.type.toString().toLowerCase() + " mixing stick");
        }
    }

    public StickType getType() {
        return type;
    }

    public void setType(StickType type) {
        this.type = type;
    }
}
