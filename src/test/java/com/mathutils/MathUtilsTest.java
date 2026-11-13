
package com.mathutils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {

    private final MathUtils math = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(6, math.add(2, 3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, math.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        assertEquals(12, math.multiply(3, 4));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, math.divide(6, 3));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class,
                () -> math.divide(5, 0));
    }
}
