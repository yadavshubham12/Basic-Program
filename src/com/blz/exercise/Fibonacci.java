package com.blz.exercise;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println("Enter the Fibonacci Series " +n+ "Numbers");
        for (int i = 1; i <= n; ++i){
            System.out.println(firstNumber + " ");
            int nextNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = nextNumber;
        }

    }
}
