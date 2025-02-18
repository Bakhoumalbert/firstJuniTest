package com.misid;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatriceAvanceTest {

    @Test
    public void sinus_shouldReturnCorrectValue() {
        CalculatriceAvance calc = new CalculatriceAvance();
        double result = calc.sinus(90);
        assertEquals(1.0, result); // sinus(90°) = 1
    }

    @Test
    public void sinus_shouldReturnZeroForZeroDegrees() {
        CalculatriceAvance calc = new CalculatriceAvance();
        double result = calc.sinus(0);
        assertEquals(0.0, result);
    }

    @Test
    public void logarithme_shouldReturnCorrectValue() {
        CalculatriceAvance calc = new CalculatriceAvance();
        double result = calc.logarithme(1);
        assertEquals(0.0, result); // log(1) = 0
    }

    @Test
    public void logarithme_shouldThrowException_whenNegativeInput() {
        CalculatriceAvance calc = new CalculatriceAvance();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.logarithme(-5);
        }, "Le Logarithme doit être positive");
    }

    @Test
    public void logarithme_shouldThrowException_whenZeroInput() {
        CalculatriceAvance calc = new CalculatriceAvance();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.logarithme(0);
        });
    }
}
