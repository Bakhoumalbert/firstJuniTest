package com.misid;

import java.util.List;
import java.util.ArrayList;

public class Personne {

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }   

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Exercice 9 : Méthode toString()
    public String toString() {
        return "Nom="+ nom + ", Age=" + age ;
    }

    // Exercice 10 : Test de la classe List avec assertAll()

    // Methode pour ajouter des personnes à la liste
    public void ajouterElement(List<String> list, 
    String element) {
        list.add(element);
    }

    // Methode pour obtenir la liste des personnes
    public List<Personne> getList() {
        List<Personne> list = new ArrayList<>();
        list.add(new Personne("Jean", 20));
        list.add(new Personne("Marie", 30));
        list.add(new Personne("Pierre", 40));
        return list;
    }


    // Exercice 11  
    // Méthode pour vérifier si un email est valide
    public boolean estEmailValide(String email) {
        if (email == null) {
            return false; // Une chaîne null n'est jamais valide
        }
        // Regex simple pour vérifier un email
        return email.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\\\.[A-Za-z0-9-]+)*(\\\\.[A-Za-z]{2,})$");
    }

    // Exercice 12
    // Méthode pour obtenir la liste des noms des utilisateurs
    public List<String> obtenirNomsUtilisateurs() {
        List<String> noms = new ArrayList<>();
        Personne jean = new Personne("Jean", 20);
        noms.add(jean.getNom());
        Personne marie = new Personne("Marie", 30);
        noms.add(marie.getNom());
        Personne pierre = new Personne("Pierre", 40);
        noms.add(pierre.getNom());
        return noms;
    }
}


