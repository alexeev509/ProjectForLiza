package com.company.firstLesson.cycles;

public class ForExample {
    public static void main(String[] args) {
        //циклы нужны для того чтобы действия которые повторяются много раз не повторять
        //Пример (плохой):
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");
        System.out.println("hello");

        //Как это исправить? - нужно использовать циклы
        //j = 0 - происходит только один раз
        for (int j = 0; j < 5; j++) {
            //j<5  - проверяется - если да, то выпрлняется все что внутри фигурных скобок фор
            System.out.println("hello in for "+j);
            //Вконце происходит действия j++
        }


    }
}
