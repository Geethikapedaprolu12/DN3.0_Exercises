package com.example.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance("Logger1");
        Logger logger2 = Logger.getInstance("Logger2");

        
        if (logger1 == logger2) {
            System.out.println("Both logger1 and logger2 reference the same instance.");
        } else {
            System.out.println("Different instances exist.");
        }

        
        logger1.log("This is a log message from Logger1.");
        logger2.log("This is a log message from Logger2.");
    }
}