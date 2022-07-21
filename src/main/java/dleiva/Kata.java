package dleiva;

import java.util.Objects;

/*Crea una función que devuelva el nombre del ganador en una pelea entre dos luchadores.
Cada luchador se turna para atacar al otro y el que mata al otro primero sale victorioso.
Tanto la salud como el daño por ataque (damage_per_attack para python) serán números enteros mayores que 0.* */
public class Kata {
    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        // Your code goes here. Have fun!
        int health1 = fighter1.health;
        int health2 = fighter2.health;
        String winner;
        boolean turn = !Objects.equals(firstAttacker, fighter1.name);
        while (health1 > 0 && health2 > 0){
            if(turn){
                health1 -= fighter2.damagePerAttack;
                turn = false;
            } else {
                health2 -= fighter1.damagePerAttack;
                turn = true;
            }
        }
        if(health1 <= 0)
            winner = fighter2.name;
        else
            winner = fighter1.name;
        return winner;
    }
}