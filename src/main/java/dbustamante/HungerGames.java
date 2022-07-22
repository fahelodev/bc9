package dbustamante;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HungerGames {

    public static String[] whoEatsWho(final String zoo) {
        String[] bajada = zoo.split(",");
        ArrayList<String> animals= new ArrayList<>(Arrays.asList(bajada));
        ArrayList<String> resultado= new ArrayList<>();
        resultado.add(zoo);

        while (animals.size() > 1){
            for (int i = 0; i <= animals.size() - 1; i++) {
                boolean bool=false;
                switch (animals.get(i)){
                    case "bear": {
                        List<String> alimento = new ArrayList<>(Arrays.asList("big-fish", "cow", "bug", "chicken", "sheep", "leaves"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "fox": {
                        List<String> alimento = new ArrayList<>(Arrays.asList("chicken","sheep"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "lion":{
                        List<String> alimento = new ArrayList<>(Arrays.asList("antelope","cow"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "panda":
                    case "bug":
                    case "giraffe": {
                        List<String> alimento = new ArrayList<>(List.of("leaves"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "chicken": {
                        List<String> alimento = new ArrayList<>(List.of("bug"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "cow":
                    case "antelope":
                    case "sheep": {
                        List<String> alimento = new ArrayList<>(List.of("grass"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "big-fish": {
                        List<String> alimento = new ArrayList<>(List.of("little-fish"));
                        bool=come(animals, resultado, i, alimento);
                        break;
                    }
                    case "leaves":
                    case "grass": {
                        List<String> alimento = new ArrayList<>(List.of("nocome"));
                        bool=come(animals,resultado,i,alimento);
                        break;
                    }
                }
                if(bool){break;}
            }
        }
        resultado.add(animals.get(0));
        bajada=resultado.toArray(bajada);
        return bajada;
    }

    private static boolean come(ArrayList<String> animals, ArrayList<String> resultado, int i, List<String> alimento) {
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
