package com.epam.calculator;

public class Calculator {

    public double doAdd(double firstArgument, double secondArgument) {
        return firstArgument + secondArgument;
    }

    public double doDivide(double firstArgument, double secondArgument) {
        if (secondArgument == 0) {
            throw new ArithmeticException("Second argument must be > than 0");
        }
        return firstArgument / secondArgument;
    }

    public double doSubtract(double firstArgument, double secondArgument) {
        return firstArgument - secondArgument;
    }

    public double doMultiply(double firstArgument, double secondArgument) {
        return firstArgument * secondArgument;
    }
}