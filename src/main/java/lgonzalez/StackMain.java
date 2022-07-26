package lgonzalez;

import java.util.Stack;

public class StackMain {
    private static int sumaTotal=0;
    private static Stack <Integer> operaciones = new Stack<>();

    public static void main(String[] args){

        sumar(10);
        sumar(20);
        sumar(30);
        sumar(4);
        sumar(7);

        System.out.println("valor Actual: " + sumaTotal);

        previewDeshacer();

        System.out.println("Valor actual: " + sumaTotal);

        Deshacer();

        System.out.println("Valor actual: " + sumaTotal);

    }

    private static void Deshacer() {
        System.out.println("Se deshizo la ultima operacion");
        sumaTotal-= operaciones.pop();
    }

    private static void previewDeshacer() {
        System.out.println("Previsualizacion de deshacer la ultima operacion" + (sumaTotal + operaciones.peek()));

    }

    private static void sumar(int numero) {
        operaciones.push(numero);
        sumaTotal+= numero;
        System.out.println("Se realizo una operacion, valor actual: " + sumaTotal);

    }


}
