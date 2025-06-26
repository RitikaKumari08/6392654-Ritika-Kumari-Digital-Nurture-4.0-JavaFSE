package com.AAA.patterns;

import org.junit.jupiter.api.*; // ✅ JUnit 5 imports
import static org.junit.jupiter.api.Assertions.*; // ✅ JUnit 5 assert

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
        System.out.println("Setup complete.");
    }

    @AfterEach
    void tearDown() {
        calculator = null;
        System.out.println("Teardown complete.");
    }

    @Test
    void testAddition() {
        // Arrange
        int a = 10;
        int b = 5;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(15, result);
    }

    @Test
    void testSubtraction() {
        // Arrange
        int a = 10;
        int b = 3;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(7, result);
    }
}


