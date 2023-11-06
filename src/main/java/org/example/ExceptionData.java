package org.example;

public class ExceptionData extends Exception {
    public ExceptionData() {
    }

    public void exceptionData(String i) {
        System.out.println("Exception: DataNotCorrectFormat");
        System.out.printf("It`s not correct format: %s", i);
        System.out.println();
    }
}
