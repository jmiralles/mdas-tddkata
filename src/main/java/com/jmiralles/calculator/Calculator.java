package com.jmiralles.calculator;

public class Calculator {

    public int Add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return stringToNumber(numbers);
        } else {
            String[] parts = numbers.split(",");
            return stringToNumber(parts[0].trim()) + stringToNumber(parts[1].trim());
        }
    }

    private int stringToNumber(String number) {
        return Integer.parseInt(number);
    }
}
