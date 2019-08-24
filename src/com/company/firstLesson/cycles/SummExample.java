package com.company.firstLesson.cycles;

public class SummExample {
    public static void main(String[] args) {
        int summ = 0;

        for (int i = 0; i < 5; i++) {
            summ = summ + i;
            System.out.println(summ);
        }

        summ=0;
        int j=0;
        while (j<5){
            summ+=j;
            //summ=summ+j;
            System.out.println("summ in while="+summ);
            j++;
        }


    }
}
