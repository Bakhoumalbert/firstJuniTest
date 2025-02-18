package com.misid;

public class TexteUtil {

    public static String transformerTexte(String texte) {
        if (texte == null) {
            return null; // Gestion du cas null
        }
        return texte.trim().toUpperCase();
    }
}
