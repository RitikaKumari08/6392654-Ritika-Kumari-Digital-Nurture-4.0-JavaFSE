package com.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestErrorMessages {
    private static final Logger logger = LoggerFactory.getLogger(TestErrorMessages.class);

    public static void main(String[] args) {
        logger.error("This is an error message");
        logger.warn("This is a warning message");
    }
}

