package com.misid;

public class Calculatrice {


    public int addition(int nb1, int nb2){
        if (nb1 < 0) {
            throw new ArithmeticException();
        }
        return nb1 + nb2;
    }

    // Traitement des cas limites
    public int additionExact(int a, int b) {
        return Math.addExact(a, b);
    }

    public int additionbyZero(int nb1, int nb2){
        if (nb1 < 0) {
            throw new IllegalArgumentException();
        }
        return nb1 + nb2;
    }


    public int soustraction(int nb1, int nb2){
        return nb1 - nb2;
    }

    public int soustractionExact(int a, int b) {
        return Math.subtractExact(a, b);
    }

    public int multiplication(int nb1, int nb2){
        return nb1 * nb2;
    }

    public int division(int nb1, int nb2){
        if(nb2 == 0){
            throw new ArithmeticException("Division par zero impossible");
        }
        return nb1 / nb2;
    }




}