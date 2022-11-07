package bMunoz;

import java.util.Stack;
import java.util.Queue;
import java.util.ArrayList;
import java.util.*;

public class Estructuras {

    public static void main(String[] args)
    {
        //1- Estructura HASHMAP
        HashMap<String, String> hashMap= new HashMap<>();

        hashMap.put("England", "London");
        hashMap.put("Germany","Berlin");
        hashMap.put("Norway","Oslo");

        for(String i : hashMap.keySet())
        {
                System.out.println("key: "+i);
        }

        System.out.println("**************************");
        System.out.println(hashMap);
        System.out.println("**************************");

        //-----------------------o---------------------------
        System.out.println("************GET**************");
        System.out.println(hashMap.get("Norway"));
        System.out.println("**************************");
        System.out.println("************REMOVE*************");
        System.out.println(hashMap.remove("Germany"));
        System.out.println("**************************");
        System.out.println("************PUT*************");
        System.out.println(hashMap);
        System.out.println("**************************");

        //-----------------------o---------------------------
        System.out.println("************Clear*************");
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println("**************************");

        //Estructura Array
        String[] cars;
        cars = new String[]{"Volvo","BMW","Ford","Hazda"};
        System.out.println("**************************");
        System.out.println(cars[0]);

        //-----------------------o---------------------------

        System.out.println("***********Intercambio***************");
        cars[0] = "Opel";
        System.out.println(cars[0]);

        //-----------------------o---------------------------

        System.out.println("************Cantidad de Marcas**************");
        System.out.println(cars.length);

        //-----------------------o---------------------------

        System.out.println("************Loop For**************");

        for(int i = 0; i < cars.length; i++)
        {
            System.out.println(cars[i]);
        }

        //-----------------------o---------------------------

        System.out.println("************Loop For-Each**************");
        for (String elemento : cars)
        {
            System.out.println(elemento);
        }

        //Estructura Matriz

        System.out.println("************Matriz**************");
        int[][] myNumbers = {{1,2,3},
                            { 4,5,6},
                            { 7,8,9}};

        //-----------------------o---------------------------

        System.out.println("************Mostrar un dato de la Matriz**************");
        int x = myNumbers[0][2];
        System.out.println(x);

        //-----------------------o---------------------------

        System.out.println("************Mostrar un otro dato de la Matriz**************");
        x = myNumbers[2][0];
        System.out.println(x);
        System.out.println("**************************");


        //Estructura ArrayList

        ArrayList<String> Cars2 = new ArrayList<>();
        Cars2.add("Volvo");
        Cars2.add("BWM");
        Cars2.add("Ford");
        Cars2.add("Mazda");

        System.out.println("**************************");
        System.out.println(Cars2);

        Cars2.set(0,"Opel");

        Cars2.remove(3);

        System.out.println(Cars2);
        Cars2.clear();
        System.out.println(Cars2);
        System.out.println("**************************");

        //-----------------------o---------------------------

        Stack<String> MrPila = new Stack<>();

        System.out.println("************Agregando a la pila**************");

        MrPila.push("Rojo");
        MrPila.push("Verde");
        MrPila.push("Azul");

        System.out.println(MrPila);

        System.out.println("************Sacando de la pila**************");

        while (!MrPila.empty())
        {
            System.out.println(MrPila.pop());
        }

        System.out.println(MrPila);

        //-----------------------o---------------------------

        Queue<String> MrCola = new LinkedList<>();

        MrCola.offer("Blanco");
        MrCola.offer("Negro");
        MrCola.offer("Gris");

        System.out.println(MrCola);

        System.out.println("**************************");

        System.out.println(MrCola.peek());

        MrCola.remove();
        System.out.println(MrCola);
        System.out.println(MrCola.peek());


    }
}
