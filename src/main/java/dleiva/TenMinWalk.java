package dleiva;

public class TenMinWalk {
    public static boolean isValid(char[] chars) {
        int ubicacion = 0;

        if(chars.length!=10){return false;}

        for (int i = 0; i < 10; i++) {
            switch (chars[i]) {
                case 'n' -> ubicacion += 10;
                case 's' -> ubicacion -= 10;
                case 'w' -> ubicacion += 1;
                case 'e' -> ubicacion -= 1;
            }
        }
        return (ubicacion==0);
    }
}