package com.company.firstLesson.nod;

import java.util.Scanner;

public class EvclydAlgorithmNod {
    public static void main(String[] args) {
        //log2 A+log2 B - максимальное время которое может работать этот алгоритм
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();

        while (firstNumber != 0 && secondNumber != 0) {
            if (firstNumber > secondNumber) {
                firstNumber = firstNumber % secondNumber;
            } else {
                secondNumber = secondNumber % firstNumber;
            }
        }

        if (firstNumber == 0) {
            System.out.println(secondNumber);
        } else {
            System.out.println(firstNumber);
        }

    }
}
