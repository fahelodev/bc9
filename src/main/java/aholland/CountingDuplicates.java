package aholland;

public class CountingDuplicates {

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

    public static int duplicateCount(String text) {
        String textoAlfanum = text.replaceAll("[^A-Za-z\\d]", ""); //limita solo a un texto alfanumerico
        textoAlfanum = textoAlfanum.toLowerCase(); //sin distincion entre mayusculas y minusculas
        char[] arrayLetras = textoAlfanum.toCharArray(); //separa el texto caracter por caracter
        int cont = 0;
        String letRepet = "";

        for (int i = 0; i < arrayLetras.length; i++) {
            for (int j = i + 1; j < arrayLetras.length; j++) {
                if (arrayLetras[i] == arrayLetras[j]) {
                    CharSequence aux = new StringBuilder(1).append(arrayLetras[j]);
                    if (!letRepet.contains(aux)) {
                        letRepet += arrayLetras[j];
                        cont++;
                    }
                }

            }
        }
        return cont;
    }

    public static void main(String []args){
        System.out.println(duplicateCount("indivisibility"));
        System.out.println(duplicateCount("chamaco"));
    }
}
