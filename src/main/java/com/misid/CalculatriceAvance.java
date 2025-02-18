package com.misid;

public class CalculatriceAvance {

    // Calcule le sinus d'un angle en DEGRÉS
    public double sinus(double degrees) {
        double radians = Math.toRadians(degrees); // conversion degrés -> radians
        return Math.sin(radians);
    }

    // Calcule le logarithme népérien (base e)
    public double logarithme(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Le logarithme est défini uniquement pour x > 0");
        }
        return Math.log(x);
    }
}

