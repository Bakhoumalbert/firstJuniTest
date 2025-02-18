package com.misid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringManipulation {

    // Exercice 13
    // Méthode pour concaténer deux chaînes
    public String concatener(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("Les chaînes ne doivent pas être null");
        }
        return a + b;
    }

    // Exercice 15
    // GestionProduits avec une méthode rechercherProduit(String nomProduit) 

    private List<String> produits;

    // Constructeur pour initialiser la liste
    public List<String> gestionProduits() {
        this.produits = new ArrayList<>();
        produits.add("Pomme");
        produits.add("Banane");
        produits.add("Orange");
        return produits;
    }

    // Méthode pour rechercher un produit par son nom
    public boolean rechercherProduit(String nomProduit) {
        if (nomProduit == null) {
            return false; // Si le nom est null, ce n'est jamais valide
        }
        return produits.contains(nomProduit);
    }

    // Exercice 17
    // Crée une méthode transformerTexte(String texte) qui met en majuscules toutes les 
    // lettres et supprime les espaces en début et fin.
    public String transformerTexte(String texte) {
        if (texte == null) {
            throw new NullPointerException("Le texte ne doit pas être null");
        }
        return texte.toUpperCase().trim();
    }

    // Exercice 20
    // Crée une méthode trierListe(List<String> noms) qui trie une liste de noms par ordre 
    // alphabétique. 
    public List<String> trierListe(List<String> noms) {
        if (noms == null) {
            throw new NullPointerException("La liste ne doit pas être null");
        }
        return noms.stream().sorted().collect(Collectors.toList());
    }
}
