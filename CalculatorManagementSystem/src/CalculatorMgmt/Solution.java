package CalculatorMgmt;

import java.util.Scanner;

abstract class Calculator {
    
    abstract int add(int a, int b);
}

class Adder extends Calculator {
  
    int add(int a, int b) {
        System.out.println("Adding integers: " + a + " " + b);
        return a + b;
    }
}

class Multiplier {
    int multiply(int a, int b, Calculator calculator) {
        int result = 0;
        for (int i = 0; i < b; i++) {
            result = calculator.add(result, a);
        }
        return result;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        Adder adder = new Adder();

        System.out.println("Testing Addition");
        System.out.println("Sum = " + adder.add(a, b));

        Multiplier multiplier = new Multiplier();
        System.out.println("Testing Multiplication");
        System.out.println("Product = " + multiplier.multiply(a, b, adder));
    }
}
