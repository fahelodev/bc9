package aholland;

import java.util.ArrayList;
import java.util.HashMap;
public class Estructuras {
    public static void main(String[] args) {

        //HASHMAP
        HashMap<String, String> hashMap= new HashMap<>(); //son objetos que nos permiten guardar valores

        hashMap.put("England", "London"); //.put nos permite agregar valores (la clave es el pais y el valor es la provincia)
        hashMap.put("Germany", "Berlin");
        hashMap.put("Norway", "Oslo");

        for (String i : hashMap.keySet()) {
            System.out.println("key: " + i + " value: " + hashMap.get(i));
        }

        System.out.println("++++++++++PUT++++++++++++");
        System.out.println(hashMap);
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("++++++++++GET++++++++++++");
        System.out.println(hashMap.get("Norway"));
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("++++++++++REMOVE+++++++++");
        System.out.println(hashMap.remove("Germany"));
        System.out.println("+++++++++++++++++++++++++");

        System.out.println("++++++++++++++++++++++");
        System.out.println(hashMap.size());
        System.out.println("++++++++++++++++++++++");

        System.out.println("+++++++++CLEAR++++++++++");
        hashMap.clear();
        System.out.println(hashMap);
        System.out.println("+++++++++++++++++++++++++");


    //ARRAYS-LISTAS
        String[] autos;
        autos= new String[]{"BMW", "Volvo", "Audi"};
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(autos[1]);
        autos[1]="Opel";
        System.out.println(autos[1]);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(autos.length);

        for (int i = 0; i < autos.length; i++) {
            System.out.println(autos[i]);
        }
        System.out.println("+++++++++++++++++++++++++");
        for (String elementos:autos) {
            System.out.println(elementos);
        }
        System.out.println("+++++++++++++++++++++++++");


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // se obtiene el 7
        System.out.println("+++++++++++++++++++++++++");
        int[][] myNumbers2 = { {1, 2, 3, 4}, {5, 6, 7} };
        int x1 = myNumbers2[0][2];
        System.out.println(x1); // Outputs 3
        System.out.println("*************************");

        int[][] matriz={    {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9},
        };
        int m = matriz[2][2];
        System.out.println(m); // Outputs 9
        System.out.println("*************************");

        //ARRAY LIST
        ArrayList<String> autos2= new ArrayList<>();
        autos2.add("Chevrolet");
        autos2.add("Toyota");
        autos2.add("Ford");
        System.out.println("-----------------------");
        System.out.println(autos2);
        autos2.get(0);
        autos2.set(0, "Masero");
        autos2.remove(2);
        System.out.println(autos2);
        System.out.println("-----------------------");

    }
}
