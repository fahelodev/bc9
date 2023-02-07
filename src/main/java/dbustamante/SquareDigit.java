package dbustamante;

import java.util.ArrayList;
import java.util.List;

public class SquareDigit {

    public static void main(String[] args) {
        squareDigits(9119);
        squareDigits(0);
    }

    public static int squareDigits(int n) {
        char[] chars = (""+n).toCharArray();
        String  result="";
        for(char c : chars){
           result += String.valueOf(Integer.parseInt(String.valueOf(c))*Integer.parseInt(String.valueOf(c)));
        }
        return Integer.valueOf(result);
    }
}
