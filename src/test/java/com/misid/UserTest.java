package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.assertDoesNotThrow;

import static org.junit.Assert.*;

public class UserTest {

    User userManup;

    @Before
    public void setUp() {
        userManup = new User("123");
    }

    @After
    public void tearDown() {
        userManup = null;
        System.out.println("Nettoyage de la class UserManipulation  terminé");
    }

    // Exercice 14
    // Test de la méthode isActiv()
    @Test
    public void isActivTest() {
        assertEquals(true, userManup.isActiv());
    }

    // Exercice 16
    // Test de la méthode supprimerUtilisateur()
    @Test
    @DisplayName("Doit lever IllegalArgumentException si l'ID est null")
    public void supprimerUtilisateur_whenIdIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            userManup.supprimerUtilisateur(null);
        });
    }

    @Test
    @DisplayName("Doit lever IllegalArgumentException si l'ID est vide")
    public void supprimerUtilisateur_shouldThrowException_whenIdIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            userManup.supprimerUtilisateur("");
        });
    }

    @Test
    @DisplayName("Ne doit pas lever d'exception avec un ID valide")
    public void supprimerUtilisateur_whenIdIsValid() {
        try {
            userManup.supprimerUtilisateur("123");
            assertTrue(true); // Si on arrive ici, pas d'exception levée
        } catch (Exception e) {
            fail("Ne devrait pas lever d'exception");
        }
    }
}
