
package com.mathutils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(MathUtils.class);

    public int add(int a, int b) {
        LOGGER.info("Adding {} and {}", a, b);
        return a + b;
    }

    public int subtract(int a, int b) {
        LOGGER.info("Subtracting {} from {}", b, a);
        return a - b;
    }

    public int multiply(int a, int b) {
        LOGGER.info("Multiplying {} and {}", a, b);
        return a * b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            LOGGER.error("Cannot divide by zero");
            throw new IllegalArgumentException(
                    "Divisor cannot be zero");
        }

        LOGGER.info("Dividing {} by {}", a, b);
        return (double) a / b;
    }
}
