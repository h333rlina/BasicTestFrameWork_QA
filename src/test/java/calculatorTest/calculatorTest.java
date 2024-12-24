package calculatorTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class calculatorTest {@Test
public void testAddPositiveNumbers() {
    // Arrange
    Calculator calculator = new Calculator();

    // Act
    int result = calculator.add(5, 3);

    // Assert
    assertEquals(8, result, "The sum of 5 and 3 should be 8");
}

    @Test
    public void testAddNegativeNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(-5, -3);

        // Assert
        assertEquals(-8, result, "The sum of -5 and -3 should be -8");
    }

    @Test
    public void testAddPositiveAndNegativeNumbers() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(5, -3);

        // Assert
        assertEquals(2, result, "The sum of 5 and -3 should be 2");
    }

    @Test
    public void testAddZero() {
        // Arrange
        Calculator calculator = new Calculator();

        // Act
        int result = calculator.add(0, 5);

        // Assert
        assertEquals(5, result, "The sum of 0 and 5 should be 5");
    }
}

