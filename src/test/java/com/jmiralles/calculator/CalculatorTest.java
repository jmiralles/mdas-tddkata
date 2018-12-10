package com.jmiralles.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CalculatorTest {
    public Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void sum_two_numbers() {
        int expected = 3;
        int actual = calculator.Add(1, 2);
        Assert.assertEquals(actual, expected);
    }


}