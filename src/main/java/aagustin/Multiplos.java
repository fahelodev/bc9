/*Consigna
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 *  The sum of these multiples is 23.Finish the solution
 *  so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
 *  Additionally, if the number is negative, return 0 (for languages that do have them).
 * Sumar los multiplos de 3 o 5 hasta el 23?
 * usar un for que aumente de 3 en 3 hasta llegar al numero que enviamos ?
 * */
package aagustin;

public class Multiplos {
    int sum;
        public int solution(int number) {
            for (int i=0; i>number;i++){
                if (i % 3==0 && i % 5==0){sum= sum+i;}
            }
            return sum;
        }
}
