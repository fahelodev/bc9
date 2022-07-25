package gGavotti;

import java.lang.*;

/*
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
Define String.prototype.toAlternatingCase such that each lowercase letter becomes uppercase and each uppercase letter becomes lowercase.
 */

public class StringUtils {


    public static void main(String[] args) {

        String pal= "HoOLlLA MuNNnndDO...";
        System.out.println(toAlternativeString(pal));

    }

    public static String toAlternativeString(String string) {

        //Compruebo si es mayuscula o minuscula y le cambio el estado.
        //Lo agrego a respuesta.

        String respuesta="";
        for (int i=0; i<string.length();i++){

            if (Character.isLowerCase(string.charAt(i))) respuesta+=Character.toUpperCase(string.charAt(i));
            else if (Character.isUpperCase(string.charAt(i))) respuesta+=Character.toLowerCase(string.charAt(i));
            else respuesta+=string.charAt(i);

        }
        return respuesta;
    }
}
