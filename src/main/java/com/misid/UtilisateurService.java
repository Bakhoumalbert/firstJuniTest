package com.misid;

public class UtilisateurService {

    public static void supprimerUtilisateur(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("L'ID de l'utilisateur ne peut pas être null ou vide.");
        }
        // Logique de suppression (non implémentée ici)
        System.out.println("Utilisateur avec ID " + id + " supprimé.");
    }
}
