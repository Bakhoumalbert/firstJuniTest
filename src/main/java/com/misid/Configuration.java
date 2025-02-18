package com.misid;

public class Configuration {

    // 1. Instance unique (static)
    private static Configuration instance;

    // 2. Constructeur privé (empêche new Configuration())
    private Configuration() {
        // Initialisation si besoin (ex : lire des fichiers de config)
        System.out.println("Instance Configuration créée !");
    }

    // 3. Méthode d’accès publique pour obtenir l’instance unique
    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration(); // Crée l'instance une seule fois
        }
        return instance;
    }

    // Méthode exemple : obtenir une valeur fictive de configuration
    public String getParametre(String cle) {
        return "Valeur pour " + cle;
    }
}
