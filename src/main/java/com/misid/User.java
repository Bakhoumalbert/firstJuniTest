package com.misid;

import java.util.logging.Logger;

public class User {
    private static final Logger LOGGER = Logger.getLogger(User.class.getName());
    private String id;
    private boolean isActiv = true;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // Exercice 14
    // Méthode pour vérifier si un utilisateur est activé
    public boolean isActiv() {
        return isActiv;
    }

    // Exercice 14
    // Méthode pour désactiver un utilisateur
    public void setActiv(boolean activ) {
        isActiv = activ;
    }

    // Exercice 16
    // supprimerUtilisateur(String id) 
    public void supprimerUtilisateur(String id) {
        if (id == null) {
            throw new IllegalArgumentException("L'ID ne peut pas être null ou vide.");
        }
        
        LOGGER.info("Utilisateur avec l'ID " + id + " supprimé.");
    }
}
