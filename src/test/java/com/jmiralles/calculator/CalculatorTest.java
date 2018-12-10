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
    public void add_zero_numbers() {
        int expected = 0;
        int actual = calculator.Add("");
        Assert.assertEquals(actual, expected);
    }

}