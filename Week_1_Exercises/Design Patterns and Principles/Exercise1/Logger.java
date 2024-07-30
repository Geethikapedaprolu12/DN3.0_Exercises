package com.example.singleton;

import java.util.HashMap;
import java.util.Map;

public class Logger {

    private static Map<String, Logger> instances = new HashMap<>();
    private String name;

    private Logger(String name) {
        this.name = name;
    }

    public static Logger getInstance(String name) {
        if (!instances.containsKey(name)) {
            synchronized (Logger.class) {
                if (!instances.containsKey(name)) {
                    instances.put(name, new Logger(name));
                }
            }
        }
        return instances.get(name);
    }

    public void log(String message) {
        System.out.println("Log from " + name + ": " + message);
    }
}