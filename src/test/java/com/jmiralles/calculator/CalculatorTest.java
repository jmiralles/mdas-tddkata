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

    @DataProvider
    public Object[][] multipleDataMethod() {
        return new Object[][] { { "4, 8, 6" , 18 }, { "1, 9 ,10, 45", 65} };
    }

    @DataProvider
    public Object[][] newLinesDataMethod() {
        return new Object[][] { { "1\n2, 3" , 6 }, { "5, 2\n4, 3" , 14}};
    }

    @Test
    public void add_empty_string() {
        int expected = 0;
        int actual = calculator.Add("");
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void add_single_number() {
        int expected = 16;
        int actual = calculator.Add("16");
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "dataMethod")
    public void add_two_numbers(String numbers, int result) {
        int expected = result;
        int actual = calculator.Add(numbers);
        Assert.assertEquals(actual, expected);
    }

    @Test(dataProvider = "multipleDataMethod")
    public void add_multiple_numbers(String numbers, int result) {
        int expected = result;
        int actual = calculator.Add(numbers);
        Assert.assertEquals(actual, expected);
    }


    @Test(dataProvider = "newLinesDataMethod")
    public void add_multiple_numbers_with_newlines(String numbers, int result) {
        int expected = result;
        int actual = calculator.Add(numbers);
        Assert.assertEquals(actual, expected);
    }


}