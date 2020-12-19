package com.company.hashmapPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String text = "I'm going to hang myself ";


        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);

            if(map.containsKey(character)){
                Integer counter = map.get(character);
                counter++;
                if(counter != 1){
                    map.put(character, counter);
                }
            }else{
               map.put(character, 1);
            }
        }
        for (Character i: map.keySet()
             ) {


        }
    }
}

