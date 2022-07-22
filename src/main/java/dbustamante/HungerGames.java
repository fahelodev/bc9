package dbustamante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class  HungerGames {

    public static String[] whoEatsWho(final String zoo) {
        String[] bajada = zoo.split(","); //Convertir String a un Array separado por comas.
        ArrayList<String> animals= new ArrayList<>(Arrays.asList(bajada)); //Ingresar a ArrayList para uso dinámico (agregar y quitar posiciones)
        ArrayList<String> resultado= new ArrayList<>();
        resultado.add(zoo);
        int counter=0; //contador de referencia para escapar de ciclo while

        while (animals.size() > 1 && counter < animals.size()){
            for (int i = 0; i <= animals.size() - 1; i++) {
                boolean bool;
                switch (animals.get(i)) {
                    case "bear" -> {
                        List<String> alimento = new ArrayList<>(Arrays.asList("big-fish", "cow", "bug", "chicken", "sheep", "leaves"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "fox" -> {
                        List<String> alimento = new ArrayList<>(Arrays.asList("chicken", "sheep"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "lion" -> {
                        List<String> alimento = new ArrayList<>(Arrays.asList("antelope", "cow"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "panda", "bug", "giraffe" -> {
                        List<String> alimento = new ArrayList<>(List.of("leaves"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "chicken" -> {
                        List<String> alimento = new ArrayList<>(List.of("bug"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "cow", "antelope", "sheep" -> {
                        List<String> alimento = new ArrayList<>(List.of("grass"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "big-fish" -> {
                        List<String> alimento = new ArrayList<>(List.of("little-fish"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    case "leaves", "grass" -> {
                        List<String> alimento = new ArrayList<>(List.of("noeat"));
                        bool = comer(animals, resultado, i, alimento);
                        if (bool) {
                            counter = 0;
                        }
                    }
                    default -> {
                        bool = false;
                        counter++;
                        if (counter > animals.size()) {
                            bool = true;
                        }
                    }
                }
                if(bool){break;}
            }
        }
        //animals=wale+fox
        String result =String.join(",",animals);
        resultado.add(result);
        String[] estadoFinalZoo= new String[resultado.size()];
        estadoFinalZoo=resultado.toArray(estadoFinalZoo);
        return estadoFinalZoo;
    }

    private static boolean comer(ArrayList<String> animals, ArrayList<String> resultado, int i, List<String> alimento) {
        boolean bool=false;
        if (i-1 >= 0 && alimento.contains(animals.get(i - 1))) {
            resultado.add(animals.get(i) + " eats " + animals.get(i - 1));
            animals.remove(i - 1);
            bool=true;
        }
        if (i+1 < animals.size() && alimento.contains(animals.get(i + 1))) {
            resultado.add(animals.get(i) + " eats " + animals.get(i + 1));
            animals.remove(i + 1);
            bool=true;
        }
        return bool;
    }
}
