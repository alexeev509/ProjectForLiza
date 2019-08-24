package com.company.firstLesson;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        //reference field
        //object
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("you entered incorrect input values!");
        }else {
            int s = a * b;
            System.out.println("S= " + s);
        }
        System.out.println("End of the program");
    }

}
