package com.misid;

import java.security.SecureRandom;

public class GenerateurID {

    private static final String CARACTERES = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
    private static final int LONGUEUR_ID = 10;
    private static final SecureRandom RANDOM = new SecureRandom();

    public static String generer() {
        StringBuilder id = new StringBuilder(LONGUEUR_ID);
        for (int i = 0; i < LONGUEUR_ID; i++) {
            int index = RANDOM.nextInt(CARACTERES.length()); // Génère un index aléatoire
            id.append(CARACTERES.charAt(index)); // Ajoute un caractère aléatoire
        }
        return id.toString();
    }
}
