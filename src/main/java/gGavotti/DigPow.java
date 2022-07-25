package gGavotti;

/*
Some numbers have funny properties. For example:

89 --> 8&sup1; + 9&sup2; = 89 * 1

695 --> 6&sup2; + 9&sup3; + 5&#x2074;= 1390 = 695 * 2

46288 --> 4&sup3; + 6&#x2074;+ 2&#x2075; + 8&#x2076; + 8&#x2077; = 2360688 = 46288 * 51

Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p

we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
In other words:

Is there an integer k such as : (a ^ p + b ^ (p+1) + c ^(p+2) + d ^ (p+3) + ...) = n * k

If it is the case we will return k, if not return -1.

Note: n and p will always be given as strictly positive integers.

digPow(89, 1) should return 1 since 8&sup1; + 9&sup2; = 89 = 89 * 1
digPow(92, 1) should return -1 since there is no k such as 9&sup1; + 2&sup2; equals 92 * k
digPow(695, 2) should return 2 since 6&sup2; + 9&sup3; + 5&#x2074;= 1390 = 695 * 2
digPow(46288, 3) should return 51 since 4&sup3; + 6&#x2074;+ 2&#x2075; + 8&#x2076; + 8&#x2077;
 */


public class DigPow {
    public static long digPow(int n, int p) {

        String nString = String.valueOf(n);
        long sumatoria = 0;

        for (int i = 0; i < nString.length(); i++)
            sumatoria += (long) Math.pow(ObtenerUnEntero(nString, i), p + i);

        if (sumatoria % n == 0) return sumatoria / n;
        else return -1;

    }

    private static int ObtenerUnEntero(String nString, int i) {
        return Integer.parseInt(String.valueOf(nString.charAt(i)));
    }
}





