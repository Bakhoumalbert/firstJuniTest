package com.misid;

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

        System.out.println( "Le resultat de 5 + 4 est : " + son );
    }
}
