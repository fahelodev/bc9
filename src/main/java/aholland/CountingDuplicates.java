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
    public class countingDuplicates {

        //Contar el número de duplicados
        public static int duplicateCount(String text) {
            //toma el String y guarda en un array de chard
            char[] arrayList= text.toCharArray();
            int cont=0;

            for (int i=0; i<arrayList.length;i++){
                //se crea un aux para comparar
                char aux= arrayList[i];
                for (int j=i+1; j<arrayList.length;j++){
                    if(aux==arrayList[j]){
                        cont++;
                    }
                }
            }
            return cont;
        }

        //distinct case-insensitive
        public static String distintCaseInsensitive(String text){

        }


        public static void main(String []args){

            System.out.println(duplicateCount("aabBcde"));
        }
    }

}
