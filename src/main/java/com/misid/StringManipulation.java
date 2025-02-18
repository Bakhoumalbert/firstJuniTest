package com.misid;

public class StringManipulation {

    public String Concatener(String a, String b) {
        if (a == null || b == null) {
            throw new NullPointerException("Les chaînes ne doivent pas être null");
        }
        return a + b;
    }
}
