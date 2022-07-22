package aholland;

public class Multiplos {
    //Si enumeramos todos los números naturales debajo de 10 que son múltiplos de 3 o 5, obtenemos 3, 5, 6 y 9.
    //La suma de estos múltiplos es 23.
    //Termina la solución para que devuelva la suma de todos los múltiplos de 3 o 5 por debajo del número pasado.
    //Además, si el número es negativo, devuelve 0 (para los idiomas que los tienen).
    //Nota: si el número es un múltiplo de 3 y 5, solo cuéntelo una vez .
    public static int Acumulador(int numero){
        int acu=0;
        if(numero<0){
            return 0;
        }else{
            for(int i=0;i<numero;i++){
                if(i%3==0 || i%5==0){
                    acu+=i;
                }
            }
            return acu;
        }

    }

    public static void main(String[] args) {
        System.out.println(Acumulador(30));
    }
}
