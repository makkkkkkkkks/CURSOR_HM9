package main.java.com.makkkkkkkks.rethrowingExceptions;

public class RethrowingExceptions {
    public static void someMethod() {
        try {
            someMethod2();
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
        }
        {
            System.out.println("Caught inside someMethod1.");
        }
    }

    public static void someMethod2() {
        try {
            throw new NullPointerException("Demo of Exception ");
        } catch (NullPointerException e) {
            e.printStackTrace(System.out);
            {
                System.out.println("Caught inside someMethod2.");
                throw e;
            }
        }
    }
}