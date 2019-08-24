package com.company.firstLesson;

public class ExampleWithConvertionOfTypes {
    public static void main(String[] args) {
        int a=8;
        int b=3;
        //a/b - будет считать как int т.к. они оба инты, и только после этого они
        // будут переводится в double!
        double c=a/b;
        System.out.println(c);

        double d=8;
        double e=3;

        double f= d/e;

        System.out.println(f);
    }
}
