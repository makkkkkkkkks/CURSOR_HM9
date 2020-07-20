package main.java.com.makkkkkkkks.exceptionDemonstration;

import main.java.com.makkkkkkkks.exeption.ExceptionA;
import main.java.com.makkkkkkkks.exeption.ExceptionB;

import java.io.IOException;

public class ExceptionDemonstration {
    public static void exeptionA() {
        try {
            throw new ExceptionA("throw ExceptionA ");
        } catch (ExceptionA exeptionA) {
            System.out.println("Catch exception A");
        }
    }

    public static void exeptionB() {
        try {
            throw new ExceptionB("throw ExceptionB");
        } catch (ExceptionB exeptionB) {
            System.out.println("Catch exception B");
        }
    }

    public static void customNullPointerException() {
        try {
            throw new NullPointerException("throw NullPointerException");
        } catch (NullPointerException nullPointerException) {
            System.out.println("Catch NullPointerException");
        }
    }

    public static void customIoException() {
        try {
            throw new IOException("throw IOException");
        } catch (IOException ioException) {
            System.out.println("Catch IOException");
        }
    }
}
