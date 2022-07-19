package gGavotti;

/**
 * Contar el número de duplicados
 *
 * Escriba la función duplicateCount, que devuelva
 * el numero (entero) de letras duplicadas.
 *
 * String de entrada:
 * 1. distinct case-insensitive
 * 2. Acepta solo Alfanumericos
 *
 * Ejemplos de retornos de la funcion
 *
 * "abcde" -> 0 # ningún carácter se repite más de una vez
 * "aabbcde" -> 2 # 'a' y 'b'
 * "aabBcde" -> 2 # 'a' aparece dos veces y 'b' dos veces (`b` y` B`)
 * "indivisibility" -> 1 # 'i' aparece seis veces
 * "aA11" -> 2 # 'a' y '1'
 * "ABBA" -> 2 # 'A' y 'B' ocurren dos veces
 */


public class CountingDuplicates {
    public static int duplicateCount(String text) {

        //Pogo todas las letras en minuscula.
        //Hago un array que guarde las letras ya suamdas.
        //Recorro text hasta lenght - 1 para no salir de rango.

        text.toLowerCase();
        char [] LetrasContadas = new char[text.length()];
        int contador=0;

        for(int i=0; i<text.length()-1;i++){

            for(int j=i+1; j<text.length();j++){

                //Creo la funcion "fueContada" que devuelve si la letra ya se encuentra en el array de LetrasContadas.
                if(text.charAt(i)==text.charAt(j) && !fueContada(text.charAt(i), LetrasContadas)){

                    contador++;
                    LetrasContadas[i]=text.charAt(i);

                }
            }
        }
        return contador;
    }

    private static boolean fueContada(char c, char[] LetContadas) {

        boolean seEncuentra=false;
        for(int i=0; i<LetContadas.length;i++){

            if (c == LetContadas[i]) {
                seEncuentra=true;
                break;
            }
        }
        return seEncuentra;
    }

    public static void main(String []args){
        System.out.println(duplicateCount("aabbccccczzz"));
    }
}
