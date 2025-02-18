package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CalculatriceTest {

    // Exercice 5 : Utiliser @BeforeEach
    Calculatrice calc;

    @Before
    public void setUp() {
        calc = new Calculatrice();
    }

    @After
    public void tearDown() {
        calc = null;
        System.out.println("Nettoyage terminé");
    }

    @Test
    public void additionTest() {
        //Calculatrice calc = new Calculatrice();
        calc = new Calculatrice();
        int som = calc.addition(4, 5);
        assertEquals(9, som);
    }

    @Test
    public void returnFalseValue() {
        //Calculatrice calc = new Calculatrice();
        calc = new Calculatrice();
        int som = calc.addition(4, 5);
        boolean t = som == 9;
        assertTrue(t);
    }

    @Test
    public void subtractionTest() {
        //Calculatrice calc = new Calculatrice();
        calc = new Calculatrice();
        int sous = calc.soustraction(4, 5);
        assertEquals(-1, sous);
        //assertThrows()
    }

    @Test
    public void multiplicationTest() {
        //Calculatrice calc = new Calculatrice();
        calc = new Calculatrice();
        int mult = calc.multiplication(4, 5);
        assertEquals(20, mult);
    }

    @Test
    public void divisionTest() {
        //Calculatrice calc = new Calculatrice();
        calc = new Calculatrice();
        int div = calc.division(20, 2);
        assertEquals(10, div);
    }

//    @Test
//    public void divisionTestParZero() {
//        //Calculatrice calc = new Calculatrice();
//        calc = new Calculatrice();
//        int div = calc.division(12, 0);
//            assertThrows("Division par zero", ArithmeticException.class, () -> {calc.division(12, 0);});
//    }

//    @Test
//    public void additionValeurNegativeParAssertThrows(){
//        //Calculatrice calculatrice = new Calculatrice();
////        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
////            calculatrice.addition(-1, 5);
////        });
//        assertThrows("numero negative", ArithmeticException.class, () -> {
//            calc = new Calculatrice();
//            calc.additionExact(-1, 5);
//        });
//
//        //assertThrows("numero negative", ArithmeticException.class, () -> calculatrice.addition(-1, 5));
//    }



    @Test
    public void testDivisionbyZero() {
        calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> { calc.division(12, 0);});
    }

    @Test
    public void divisionTestTryCatche() {
        //Calculatrice calc = new Calculatrice();

        try {
//            assertEquals((int) 6, calc.division(12, 2));
            calc.division(12, 0);
            fail("Division should throw ArithmeticException");
        } catch (ArithmeticException e) {
            assertEquals("Division by zero", e.getMessage());
        }
    }

    // Exercice 3-4
    @Test
    public  void addition_RetrunMaxValue_whenAddingZeroToMaxValue() {
        Calculatrice calc = new Calculatrice();
        int result = calc.additionExact(Integer.MAX_VALUE, 0);
        assertEquals(Integer.MAX_VALUE, result);
    }

    @Test
    public void addition_shouldThrowException_whenOverflowPositive() {
        //Calculatrice calc = new Calculatrice();
        assertThrows(NullPointerException.class, () -> {
            calc.additionExact(Integer.MAX_VALUE, 1);
        });
    }

    @Test
    public void testDivisionByZero() {
        //Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> {
            calc.division(12, 0);
        });
    }

    // L'addition de deux grands nombres
    @Test
    public void addition_shouldThrowException_whenAddingTwoLargePositiveNumbers() {
        //Calculatrice calc = new Calculatrice();
        assertThrows(ArithmeticException.class, () -> {
            calc.additionExact(1503002650, 1104050702);
        });
    }

    // With assertThrows()
    @Test
    public void addition_shouldBeLessThanLimit() {
        //calc = new Calculatrice();
        int result = calc.additionExact(500_000_000, 400_000_000); // 500 millions + 400 millions

        // Vérifier que le résultat est inférieur à 1 milliard
        assertTrue("La somme devrait être inférieure à 1 milliard", result < 1_000_000_000);
    }


    //Exercice 5 : Utilisation de @BeforeEach pour initialisation





}
