package com.company.firstLesson.nod;

import java.util.Scanner;

public class NodBadExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int edgeForcycle;
        if (firstNumber > secondNumber) {
            edgeForcycle = secondNumber;
        } else {
            edgeForcycle = firstNumber;
        }
        int nod=0;
        for (int i = 1; i<=edgeForcycle;i++){
            if(firstNumber%i==0 && secondNumber%i==0) {
                nod=i;
            }
        }
        System.out.println(nod);
    }
}
