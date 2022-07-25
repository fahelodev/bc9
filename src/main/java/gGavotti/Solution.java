package gGavotti;

/*
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
 */

public class Solution {

    public static int solution(int number) {

        int suma=0;

        //Compruebo si number es menor que 0.
        if (number <0){

            return 0;

        }else {
            //Compruebo que cada valor menor a number sea multiplo de 3 o 5.
            for (int i = 1; i < number; i++) {

                if (i % 3 == 0 || i % 5 == 0) {

                    suma += i;
                }
            }
        }
        return suma;
    }


    public static void main(String[] args) {

        System.out.println(solution(16));
    }
}





