package com.company.firstLesson;

public class SwitchExample {
    public static void main(String[] args) {
        int i = 1;
        switch (i) {
            case 1:
                System.out.println("i=1");
                break;
            case 2:
                System.out.println("i=2");
                break;
            default:
                System.out.println("You make mistake we dont have such point of menu");
                break;
        }
    }
}
