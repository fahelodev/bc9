package lgonzalez;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Dinglemouse {

    private static final Map<String, Set<String>> AnimalesParaComer = new HashMap<>();

    static {
        AnimalesParaComer.put("antelope", Collections.singleton("grass"));
        AnimalesParaComer.put("big-fish", Collections.singleton("little-fish"));
        AnimalesParaComer.put("bug", Collections.singleton("leaves"));
        AnimalesParaComer.put("bear", new HashSet<>(Arrays.asList("big-fish", "bug", "chicken", "cow", "leaves",
                "sheep")));
        AnimalesParaComer.put("chicken", Collections.singleton("bug"));
        AnimalesParaComer.put("cow", Collections.singleton("grass"));
        AnimalesParaComer.put("fox", new HashSet<>(Arrays.asList("chicken", "sheep")));
        AnimalesParaComer.put("giraffe", Collections.singleton("leaves"));
        AnimalesParaComer.put("lion", new HashSet<>(Arrays.asList("antelope", "cow")));
        AnimalesParaComer.put("panda", Collections.singleton("leaves"));
        AnimalesParaComer.put("sheep", Collections.singleton("grass"));
    }

    public static String[] QuienComeQue(final String input) {
        final List<String> QuienComeQuien = new LinkedList<>();
        final List<String> Animales = new ArrayList<>(Arrays.asList(input.split(",")));


        while (cadaRonda(QuienComeQuien, Animales));

        List<String> resulto = new LinkedList<>();
        resulto.add(input);
        resulto.addAll(QuienComeQuien);
        resulto.add(String.join(",", Animales));
        System.out.println(resulto);
        return resulto.toArray(new String[0]);
    }

    private static boolean cadaRonda(List<String> QuienComeQuien, List<String> Animales) {
        for (int i = 0; i < Animales.size(); i++) {
            if (puedeComerizq(Animales, i)) {
                comerHaciaIzq(QuienComeQuien, Animales, i);
                return true;
            } else if (puedeComerDerr(Animales, i)) {
                comerHaciaDerr(QuienComeQuien, Animales, i);
                return true;
            }
        }
        return false;
    }

    private static void comerHaciaDerr(List<String> QuienComeQuien, List<String> Animales, int i) {
        Comer(QuienComeQuien, Animales, i, i + 1);
    }

    private static void comerHaciaIzq(List<String> QuienComeQuien, List<String> Animales, int i) {
        Comer(QuienComeQuien, Animales, i, i - 1);
    }

    private static void Comer(List<String> QuienComeQuien, List<String> Animales, int Quien, int Que) {
        QuienComeQuien.add(String.format("%s eats %s", Animales.get(Quien), Animales.get(Que)));
        Animales.remove(Que);
    }

    private static boolean puedeComerDerr(List<String> Animales, int i) {
        final Set<String> Deborado = AnimalesParaComer.get(Animales.get(i));
        return i < Animales.size() - 1 && Deborado != null && Deborado.contains(Animales.get(i + 1));
    }

    private static boolean puedeComerizq(List<String> Animales, int i) {
        final Set<String> Deborado = AnimalesParaComer.get(Animales.get(i));
        return i > 0 && Deborado != null && Deborado.contains(Animales.get(i - 1));
    }

}