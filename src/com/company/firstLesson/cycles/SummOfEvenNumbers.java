package com.company.firstLesson.cycles;

public class SummOfEvenNumbers {
    public static void main(String[] args) {
        int summ=0;
        int i=0;
        for(;i<15;i++){
            //if
            if(i%2==0) {
                summ+=i;
                System.out.println(summ);
            }
        }
        //while
    }
}
