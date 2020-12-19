package com.company.characterFrequency;

import java.util.HashMap;

public class CharacterFrequency {

    public void firstRepeat(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] characterArray = input.toCharArray();

        for (char c : characterArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (char c : characterArray) {
            if (charCountMap.get(c) > 1) {
                System.out.println("First Repeated Character In '" + input + "' is '" + c + "'");

                break;
            }
        }

    }

    public void firstNonRepeat(String input) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] characterArray = input.toCharArray();

        for (char c : characterArray) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                charCountMap.put(c, 1);
            }
        }
        for (char c : characterArray) {
            if (charCountMap.get(c) == 1) {
                System.out.println("First Non-Repeated Character In '" + input + "' is '" + c + "'");

                break;
            }
        }

    }

}
