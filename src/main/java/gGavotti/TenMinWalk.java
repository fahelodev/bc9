package gGavotti;

public class TenMinWalk {

    public static boolean isValid(char[] chars) {

        int DistanciaNS=0;
        int DistanciaEO=0;

        if (!(chars.length==10)) return false;

        for (int i=0; i<10; i++){

            switch (chars[i]){

                case 'n' : {
                    DistanciaNS++;
                    break;
                }
                case 's' : {
                    DistanciaNS--;
                    break;
                }
                case 'e' : {
                    DistanciaEO++;
                    break;
                }
                case 'o' : {
                    DistanciaEO--;
                    break;
                }
            }
        }

        if (DistanciaEO == 0 && DistanciaNS == 0) return true; else return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid(new char[]{'n','s','n','s','n','s','n','s','n','s'}));
    }
}


