package gGavotti;

/*
Write a function that returns true if the number is a "Very Even" number.

If a number is a single digit, then it is simply "Very Even" if it itself is even.

If it has 2 or more digits, it is "Very Even" if the sum of its digits is "Very Even".

Examples
number = 88 => returns false -> 8 + 8 = 16 -> 1 + 6 = 7 => 7 is odd

number = 222 => returns true -> 2 + 2 + 2 = 6 => 6 is even

number = 5 => returns false

number = 841 => returns true -> 8 + 4 + 1 = 13 -> 1 + 3 => 4 is even

Note: The numbers will always be 0 or positive integers!
 */

public class isVeryEvenNumberClass {

    public static boolean isVeryEvenNumber(int number) {

        //Primero validar que el numero sea par y menor o mayor que diez.
        //Separarlos y sumar. Repetir el proceso hasta que sea de un solo digito.

        if (number < 10 && esPar(number)) return true; //Si ya es VeryEven

        int sumatoria = 0;                            //Primera vuelta
        String numeroString = getString(number);
        sumatoria = sumarDigitos(numeroString);

        while (sumatoria > 9) {                       //Si sigue teniendo dos digitos vuelvo a hacer sumatoria
            numeroString = getString(sumatoria);
            sumatoria = 0;
            sumatoria = sumarDigitos(numeroString);

        }
        if (esPar(sumatoria)) return true;
        else return false;

    }

    private static int sumarDigitos(String numeroString) {
        int sum = 0;
        for (int i = 0; i < numeroString.length(); i++) {
            sum += getAnInt(numeroString, i);
        }
        return sum;
    }

    private static boolean esPar(int sumatoria) {
        return sumatoria % 2 == 0;
    }

    private static String getString(int number) {
        return String.valueOf(number);
    }

    private static int getAnInt(String numeroString, int i) {
        return Integer.parseInt(String.valueOf(numeroString.charAt(i)));
    }

}


