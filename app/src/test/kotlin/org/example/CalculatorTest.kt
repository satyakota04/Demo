package org.example

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class CalculatorTest {
    private val calculator = Calculator()

    @Test
    fun addSumsTwoNumbers() {
        assertEquals(5, calculator.add(2, 3))
    }

    @Test
    fun divideReturnsQuotient() {
        assertEquals(5, calculator.divide(10, 2))
    }

    @Test
    fun divideByZeroThrows() {
        assertThrows<IllegalArgumentException> { calculator.divide(1, 0) }
    }

    @ParameterizedTest
    @CsvSource("2,true", "7,false", "0,true")
    fun isEven(n: Int, expected: Boolean) {
        assertEquals(expected, calculator.isEven(n))
    }

    @Test
    fun evenAndOdd() {
        assertTrue(calculator.isEven(4))
        assertFalse(calculator.isEven(3))
    }
}
