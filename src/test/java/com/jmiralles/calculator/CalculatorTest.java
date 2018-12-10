package com.jmiralles.calculator;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class CalculatorTest {
    public Calculator calculator;

    @BeforeTest
    public void setUp() {
        calculator = new Calculator();
    }

    @DataProvider
    public Object[][] dataMethod() {
        return new Object[][] { { "1,2" , 3}, { "4, 8" , 12 }, { "9 ,10", 19} };
    }

    @Test
    public void add_empty_string() {
        int expected = 0;
        int actual = calculator.Add("");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add_single_number() {
        int expected = 6;
        int actual = calculator.Add("6");
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataMethod")
    public void add_two_numbers(String numbers, int result) {
        int expected = result;
        int actual = calculator.Add(numbers);
        Assert.assertEquals(actual, expected);
    }


}