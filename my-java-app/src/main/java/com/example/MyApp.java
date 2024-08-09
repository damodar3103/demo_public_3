package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyApp {
    private static final Logger logger = LogManager.getLogger(MyApp.class);

    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            logger.error("An error occurred: ", e);
        }
    }

    private static void throwException() throws Exception {
        throw new Exception("This is a test exception");
    }
}
