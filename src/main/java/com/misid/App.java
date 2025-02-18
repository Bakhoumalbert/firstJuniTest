package com.misid;

import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculatrice calc = new Calculatrice();
        int son = calc.addition(4, 5);

        Logger.getLogger(App.class.getName()).info( "Le resultat de 5 + 4 est : " + son );

        StringManipulation strManup = new StringManipulation();
        String texte = "Bonjour";
        String resultat = strManup.transformerTexte(texte);
        Logger.getLogger(App.class.getName()).info( "Le texte en majuscules et sans espaces est : " + resultat); 
    
        GenerateurID gen = new GenerateurID();
        String id = gen.generer();
        Logger.getLogger(App.class.getName()).info( "L'identifiant est : " + id);
    }
}
