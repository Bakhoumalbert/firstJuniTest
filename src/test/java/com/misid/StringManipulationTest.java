package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class StringManipulationTest {

    StringManipulation strManup;

    @Before
    public void setUp() {
        strManup = new StringManipulation();
    }

    @After
    public void tearDown() {
        strManup = null;
        System.out.println("Nettoyage de la class StringManipulation  terminé");
    }


    // Exercice 13

    @Test
    public void Concatetest() {
        assertEquals("Bonjour", (String) strManup.Concatener("Bon", "jour"));
    }

    // Quant le premier String est null
    @Test
    public void concatener_WhenFirstStringIsNull() {
        assertThrows(NullPointerException.class, () -> {
            strManup.Concatener(null, "World");
        });
    }

    // Quant le second String est null
    @Test
    public void concatener_whenSecondStringIsNull() {
        assertThrows(NullPointerException.class, () -> {
            strManup.Concatener("Hello", null);
        });
    }

    //Exercice 14

    public void user() {

    }
}
