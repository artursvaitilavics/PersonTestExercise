package sda.calculator;

public class Calculator {
    public int add(int arg1, int arg2) {
        return arg1 + arg2;
    }

    public int subtract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiply(int val1, int val2) {
        return val1 * val2;
    }

    public int divide(int arg1, int arg2) {
        return arg1 / arg2;
    }

    public int power(int arg1, int arg2){
        int result = arg1;
        for (int i = 1; i < arg2; i++) {
            result = result * arg1;
        }
        return result;
    }
}
