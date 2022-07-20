package gGavotti;

import java.lang.*;

/*
Complete the function that accepts a string parameter, and reverses each word in the string.
All spaces in the string should be retained.
 */

public class KataReverseWords {

    public static void main(String[] args) {

        System.out.println(reverseWords("  Hola  muNdoO"));

    }

    public static String reverseWords(final String original) {

        //Creo variable primera letra que apunte a la primera letra de cada palabra
        String respuesta = "";
        int j = 0;
        int primera_letra = 0;

        while (j < original.length()-1) {

            //Chequeo los espacios en blanco
            while (original.charAt(j) == ' ' && j < original.length()) {
                respuesta += original.charAt(j);
                j++;
            }
            primera_letra = j;

            // Avanzo sobre la palabra hasta dejar la j en el primer espacio en blanco.
            while (original.charAt(j) != ' ' && j < original.length()-1) j++;

            int i;
            if (j != original.length()-1) i=j;else i=j+1; //Compruebo para no salir de rango.

            //Recorro la palabra hacia atras y voy guardando en la respuesta.
            while (i > primera_letra) {
                respuesta += original.charAt(i-1);// Asigno i-1 ya que j esta en el primer espacion en blanco.
                i--;
            }

        }
        return respuesta;
    }

}
