package com.misid;

import java.util.UUID;

public class GenerateurID {

    // Exercice 18
    // méthode generer() qui retourne un identifiant 
    // aléatoire unique de 10 caractères.
    public String generer() {
        return UUID.randomUUID().toString().substring(0, 10);
    }
}
