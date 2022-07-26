package lgonzalez;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Estructuras {

    public static void main(String[] args){
        HashMap <String, String> estructura = new HashMap();
        /*
        estructura.put("England", "London");
        estructura.put("Germany", "Berlin");
        estructura.put("Norway", "Oslo");
        estructura.put("USA", "Washington DC");

        System.out.println("////PUT///");
        System.out.println(estructura);
        System.out.println("////GET///");
        System.out.println(estructura.get("Norway"));
        System.out.println("////REMOVE///");
        estructura.remove("Germany");
        System.out.println(estructura);
        System.out.println("////Clear///");
        estructura.clear();
        System.out.println(estructura);



        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        System.out.println(cars[0]);
        */

        System.out.println("/////ArrrayList////");

        ArrayList<String> nuevoArray = new ArrayList<>();

        nuevoArray.add("Volvo");
        nuevoArray.add("BMW");
        nuevoArray.add("Ford");
        nuevoArray.add("Mazda");

        System.out.println(nuevoArray);

    }




}
