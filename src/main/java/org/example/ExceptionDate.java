package org.example;

public class ExceptionDate extends Exception{

    public ExceptionDate() {
    }

    public void exceptionData(String i) {
        System.out.println("Exception: DateNotCorrectFormat");
        System.out.printf("It`s not correct date format: %s", i);
        System.out.println();
    }


}
