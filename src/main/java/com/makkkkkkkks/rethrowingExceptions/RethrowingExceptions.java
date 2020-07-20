package main.java.com.makkkkkkkks.rethrowingExceptions;

public class RethrowingExceptions {
    public static void someMethod() throws Exception {
        someMethod2();
    }

    public static void someMethod2() throws Exception {
        someMethod();
    }
}
