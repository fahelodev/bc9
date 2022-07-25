package bMunoz;

public class KataFight {

    public static String declareWinner(KataFighter fighter1, KataFighter fighter2, String firstAttacker) {
        String winner = "";
        boolean aux = false;

        while (HayGanador(aux))
        {
            if (GolpeaJugador1(fighter1, firstAttacker))
            {
                fighter2.health -= fighter1.damagePerAttack;

                if (SinVidaJugador2(fighter2))
                {
                    aux = true;
                    winner= fighter1.name;

                }
                firstAttacker = fighter2.name;
            }
            else if(GolpeaJugador2(fighter2, firstAttacker))
            {
                fighter1.health -= fighter2.damagePerAttack;

                if (SinVidaJugador1(fighter1))
                {
                    aux = true;
                    winner= fighter2.name;
                }
                firstAttacker = fighter1.name;
            }
        }
        return winner;
    }

    private static boolean SinVidaJugador2(KataFighter fighter2) {
        return fighter2.health <= 0;
    }
    private static boolean SinVidaJugador1(KataFighter fighter1) {
        return fighter1.health <= 0;
    }
    private static boolean GolpeaJugador1(KataFighter fighter1, String firstAttacker) {
        return firstAttacker.equals(fighter1.name);
    }

    private static boolean GolpeaJugador2(KataFighter fighter2, String firstAttacker) {
        return firstAttacker.equals(fighter2.name);
    }

    private static boolean HayGanador(Boolean aux) {
        return !aux;
    }
}
