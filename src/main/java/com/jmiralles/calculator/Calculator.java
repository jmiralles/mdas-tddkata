package com.jmiralles.calculator;

public class Calculator {

    public int Add(String numbers) {
        if (numbers.length() == 0) return 0;

        int sum = 0;
        String[] numbersArray = numbers.split(",|\\n");

        for (String number : numbersArray) {
            sum += stringToNumber(number.trim());
        }

        return sum;
    }

    public int stringToNumber(String number) {
        return Integer.parseInt(number);
    }
}
