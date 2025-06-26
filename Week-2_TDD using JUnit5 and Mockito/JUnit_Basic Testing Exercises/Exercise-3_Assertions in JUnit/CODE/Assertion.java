package com.AssertionInJUnit.junit;

import org.junit.jupiter.api.Test;  // ✅ Required to mark the method as a test

import static org.junit.jupiter.api.Assertions.*;

public class Assertion {

    @Test
    public void testAssertions() {
        // Assert equals
        assertEquals(5, 2 + 3);

        // Assert true
        assertTrue(5 > 3);

        // Assert false
        assertFalse(5 < 3);

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
    }
}
