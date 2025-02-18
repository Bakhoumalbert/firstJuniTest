package com.misid;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import java.util.Arrays;

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
        assertEquals("Bonjour", (String) strManup.concatener("Bon", "jour"));
    }

    // Quant le premier String est null
    @Test
    public void concatener_WhenFirstStringIsNull() {
        assertThrows(NullPointerException.class, () -> {
            strManup.concatener(null, "World");
        });
    }

    // Quant le second String est null
    @Test
    public void concatener_whenSecondStringIsNull() {
        assertThrows(NullPointerException.class, () -> {
            strManup.concatener("Hello", null);
        });
    }

    // Exercice 15
    //  GestionProduits avec une méthode rechercherProduit(String nomProduit) 
    // Quant le produit existe
    @Test
    public void rechercherProduit_WhenProductExists() {
        strManup.gestionProduits();
        assertTrue(strManup.rechercherProduit("Pomme"));
    }

    // Quant le produit n'existe pas
    @Test
    public void rechercherProduit_WhenProductDoesNotExist() {
        strManup.gestionProduits();
        assertFalse(strManup.rechercherProduit("Poire"));
    }

    // Quant le produit est null
    @Test
    public void rechercherProduit_WhenProductIsNull() {
        strManup.gestionProduits();
        assertFalse(strManup.rechercherProduit(null));
    }

    // Exercice 17
    // Crée une méthode transformerTexte(String texte) qui met en majuscules toutes les 
    // lettres et supprime les espaces en début et fin.
    @Test
    public void transformerTexte_WhenTextIsNull() {
        assertThrows(NullPointerException.class, () -> {    
            strManup.transformerTexte(null);
        });
    }

    @Test
    public void transformerTexte_WhenTextIsNotNull() {
        assertEquals("BONJOUR", strManup.transformerTexte("  Bonjour "));
    }

    // Exercice 20
    // La liste triée est correcte.
    @Test
    public void trierListe_WhenListIsNull() {
        assertThrows(NullPointerException.class, () -> {
            strManup.trierListe(null);
        });
    }

    //Une liste vide ne pose pas de problème. 
    @Test
    public void trierListe_WhenListIsEmpty() {
        assertEquals(Arrays.asList(), strManup.trierListe(Arrays.asList()));
    }

    @Test
    public void trierListe_WhenListIsNotNull() {
        assertEquals(Arrays.asList("Banane", "Orange", "Pomme"), strManup.trierListe(Arrays.asList("Pomme", "Banane", "Orange")));
    }

    // Une liste avec un seul élément reste inchangée. 
    @Test
    public void trierListe_WhenListHasOneElement() {
        assertEquals(Arrays.asList("Pomme"), strManup.trierListe(Arrays.asList("Pomme")));
    }
}
