package com.jmiralles.calculator;

public class Calculator {

    public int Add(String numbers) {
        if (numbers.length() == 0) {
            return 0;
        } else if (numbers.length() == 1) {
            return Integer.parseInt(numbers);
        }
        return -1;
    }
}
