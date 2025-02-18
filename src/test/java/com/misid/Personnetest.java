package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertAll;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;


public class PersonneTest {

    Personne persManup;

    @Before
    @DisplayName("Initialisation de la class personneTest")
    public void setUp() {
        persManup = new Personne("Jean", 20);
    }

   @After
   @DisplayName("Nettoyage de la class personneTest")
   public void tearDown() {
       persManup = null;
       System.out.println("Nettoyage de la class personneTest  terminé");
   }

    // Test des getters
    @Test
    @DisplayName("Test du nom")
    public void testNom() {
        assertEquals("Jean", persManup.getNom());
    }

    @Test
    @DisplayName("Test de l'âge")
    public void testAge() {
        assertEquals(20, persManup.getAge());
    }

    // Exercice 9 : Tests de la méthode toString()
    @Test
    @DisplayName("Test de la méthode toString()")
    public void testToString() {
        assertEquals("Nom=Jean, Age=20", persManup.toString());
    }

    // Exercice 10 : Test de la classe List avec assertAll()

    // Créez un test unitaire pour vérifier que la taille de la liste est égale à 1.
    @Test
    @DisplayName("Test de l'ajout d'un élément à la liste")
    public void testAjouterElement() {
        List<String> list = new ArrayList<>();
        persManup.ajouterElement(list, "Jean");
        persManup.ajouterElement(list, "Marie");
        persManup.ajouterElement(list, "Pierre");
        assertEquals(3, list.size());
    }

    // Utilisez l'assertion assertAll() pour tester plusieurs conditions dans le même 
    // test, comme vérifier la taille de la liste et la présence de l'élément ajouté.
    @Test
    public void testManyWithAssertAll() {
        List<String> list = new ArrayList<>();
        persManup.ajouterElement(list, "Jean");
        persManup.ajouterElement(list, "Marie");
        persManup.ajouterElement(list, "Pierre");
        assertAll("test", // j'utilise jUnit 4
            () -> assertEquals(3, list.size()),
            () -> assertTrue(list.contains("Jean")),
            () -> assertTrue(list.contains("Pierre")),
            () -> assertFalse(list.contains("Paul")),
            // le contenu d'index 0 doit être "Jean"
            () -> assertEquals("Jean", list.get(0)),
            // le contenu d'index 1 doit être "Marie"
            () -> assertEquals("Marie", list.get(1)),
            // le contenu d'index 2 doit être "Pierre"
            () -> assertEquals("Pierre", list.get(2))
        );
    }

    // Exercice 11
    // Test de l'email valide
    @Test
    @DisplayName("Test de l'email valide")
    public void testEmailValide() {
        assertTrue(persManup.estEmailValide("jean@gmail.com"));
    }

    @Test
    @DisplayName("Test de l'email invalide")
    public void testEmailInvalide() {

        assertFalse(persManup.estEmailValide("jean@gmail"));
        assertFalse(persManup.estEmailValide("jean-#paul@gmail.com"));

    }

    @Test
    @DisplayName("Test de l'email sans @")
    public void testEmailWithoutAt() {
        assertFalse(persManup.estEmailValide("jean.com"));
    }

    @Test
    @DisplayName("Test de l'email invalide null")
    public void testEmailInvalideNull() {
        assertFalse(persManup.estEmailValide(null));
    }

    @Test
    @DisplayName("Test de l'email invalide vide")
    public void testEmailInvalideVide() {
        assertFalse(persManup.estEmailValide(""));
    }

    // Exercice 12
    // Test de la méthode obtenirNomsUtilisateurs()
    @Test
    @DisplayName("Test de la méthode obtenirNomsUtilisateurs()")
    public void testObtenirNomsUtilisateurs() {
        List<String> noms = persManup.obtenirNomsUtilisateurs();
        assertEquals(3, noms.size());
        assertEquals("Jean", noms.get(0));
        assertEquals("Marie", noms.get(1));
        assertEquals("Pierre", noms.get(2));
        assertFalse(noms.contains("Paul"));
    }

    // Exercice 13

}
