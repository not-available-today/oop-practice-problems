package com.company.hashmapPractice;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String text = "I'm going to hang myself ";


        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if(map.keySet().contains(character)){
                Integer counter = map.get(character);
                counter++;
                if(counter != 1){
                    map.put(character, counter);
                }
            }else{
               map.put(character, 1);
            }

        }
        System.out.print(map);
    }
}
