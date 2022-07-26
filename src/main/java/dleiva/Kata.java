package dleiva;

import java.util.Objects;

/*Crea una función que devuelva el nombre del ganador en una pelea entre dos luchadores.
Cada luchador se turna para atacar al otro y el que mata al otro primero sale victorioso.
Tanto la salud como el daño por ataque (damage_per_attack para python) serán números enteros mayores que 0.* */
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
            String winner;
            boolean turn = true;
            if(firstAttacker == fighter1.name){
                turn = false;
            }

            while (stillAlive(fighter1.health, fighter2.health)){
                if(turn){
                    fighter1.health -= fighter2.damagePerAttack;
                    turn = false;
                } else {
                    fighter2.health -= fighter1.damagePerAttack;
                    turn = true;
                }
            }

            if(fighter1.health <= 0)
                winner = fighter2.name;
            else
                winner = fighter1.name;
            return winner;
        }

        private static boolean stillAlive(int health1, int health2) {
            return health1 > 0 && health2 > 0;
        }
    }
