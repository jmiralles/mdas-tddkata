package com.jmiralles.calculator;

public class Calculator {

    public int Add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return stringToNumber(numbers);
        } else {
            int sum = 0;
            String[] parts = numbers.split(",");

            for (String i : parts)
                sum += stringToNumber(i.trim());

            return sum;
        }
    }

    private int stringToNumber(String number) {
        return Integer.parseInt(number);
    }
}
