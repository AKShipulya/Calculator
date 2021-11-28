package com.epam.calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testDoAddShouldAddWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doAdd(3, 2);
        //then
        Assert.assertEquals(5, actual, 0.0001);
    }

    @Test
    public void testDoAddShouldAddWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doAdd(-3, -2);
        //then
        Assert.assertEquals(-5, actual, 0.0001);
    }

    @Test
    public void testDoAddShouldAddWhenNumbersNegativeAndPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doAdd(3, -2);
        //then
        Assert.assertEquals(1, actual, 0.0001);
    }

    @Test
    public void testDoDivideShouldDivideWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doDivide(3, 2);
        //then
        Assert.assertEquals(1.5, actual, 0.0001);
    }

    @Test
    public void testDoDivideShouldDivideWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doDivide(-3, -2);
        //then
        Assert.assertEquals(1.5, actual, 0.0001);
    }

    @Test(expected = java.lang.ArithmeticException.class)
    public void testDoDivideShouldThrowExceptionWhenDivideByZero() {
        //given
        Calculator calculator = new Calculator();
        //when
        calculator.doDivide(3, 0);
    }

    @Test
    public void testDoSubtractShouldSubtractWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doSubtract(3, 2);
        //then
        Assert.assertEquals(1, actual, 0.0001);
    }

    @Test
    public void testDoSubtractShouldSubtractWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doSubtract(-3, -2);
        //then
        Assert.assertEquals(-1, actual, 0.0001);
    }

    @Test
    public void testDoSubtractShouldSubtractWhenNumbersPositiveAndNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doSubtract(3, -2);
        //then
        Assert.assertEquals(5, actual, 0.0001);
    }

    @Test
    public void testDoMultiplyShouldMultiplyWhenNumbersPositive() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doMultiply(3, 2);
        //then
        Assert.assertEquals(6, actual, 0.0001);
    }

    @Test
    public void testDoMultiplyShouldMultiplyWhenNumbersNegative() {
        //given
        Calculator calculator = new Calculator();
        //when
        double actual = calculator.doMultiply(-3, -2);
        //then
        Assert.assertEquals(6, actual, 0.0001);
    }

}