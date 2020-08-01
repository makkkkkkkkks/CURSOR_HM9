package main.java.com.makkkkkkkks.executor;

import main.java.com.makkkkkkkks.rethrowingExceptions.RethrowingExceptions;
import main.java.com.makkkkkkkks.safeDivision.SafeDivision;
import main.java.com.makkkkkkkks.exceptionDemonstration.ExceptionDemonstration;

public class Executor {
    public static void execute() {
        ExceptionDemonstration.exeptionA();
        ExceptionDemonstration.exeptionB();
        ExceptionDemonstration.customIoException();
        ExceptionDemonstration.customNullPointerException();
        SafeDivision.division();
        try {
            RethrowingExceptions.someMethod();
        } catch (Exception e) {
            System.out.println("Catch");;
        }
    }
}
