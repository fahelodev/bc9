package dleiva;

public class TenMinWalk{
        public static boolean isValid(char[] walk) {
            // Insert brilliant code here
            //return true;


            if (walk.length != 10) {
                return false;
            }

            int x = 0;
            int y = 0;

            for (Character c : walk) {
                switch (c) {
                    case 'n':
                        y++;
                        break;
                    case 's':
                        y--;
                        break;
                    case 'e':
                        x--;
                        break;
                    case 'w':
                        x++;
                        break;
                    default :
                        break;
                }
            }

            return x == 0 && y == 0;
        }
}