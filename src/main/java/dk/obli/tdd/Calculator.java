package dk.obli.tdd;

import java.util.ArrayList;

public class Calculator {
    public static void main(String[] args) {
    }

    public int add(int a, int b) {
        return a+b;
    }

    public int add(String numbers) {
        String[] numbersArray = numbers.split(",");
        int returnNumber = 0;
        for (String s : numbersArray){
            returnNumber += Integer.parseInt(s.trim());
        }
        return returnNumber;
    }

    public int subtract(int a, int b) {
        return a-b;
    }

    public int multiply(int a, int b) {
        return a*b;
    }

    public int divide(int a, int b) {
        if(a == 0 || b == 0){
            return 0;
        }
        return a/b;
    }

    public int add(int... numbers) {
        int sum = 0;
        for (int n : numbers){
            sum += n;
        }
        return sum;
    }
}
