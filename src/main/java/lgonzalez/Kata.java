package lgonzalez;

public class Kata {
    public static String declareWinner(Fighter Peleador1, Fighter Peleador2, String ElPrimero) {
        if(CualEsPrimero(Peleador1, ElPrimero)){
            while (MientrasPuedanPelear(Peleador1, Peleador2)){
                Peleador2.setHealth(Peleador2.getHealth() - Peleador1.getDamagePerAttack());
                if(Peleador2.getHealth() > 0){
                    Peleador1.setHealth(Peleador1.getHealth() - Peleador2.getDamagePerAttack());
                }

            }
        }else{
            while (MientrasPuedanPelear(Peleador1, Peleador2)){
                Peleador1.setHealth(Peleador1.getHealth() - Peleador2.getDamagePerAttack());
                if(Peleador1.getHealth() > 0){
                    Peleador2.setHealth(Peleador2.getHealth() - Peleador1.getDamagePerAttack());
                }

            }
        }

        if(Peleador1.getHealth() <= 0){
            return Peleador2.getName();
        }else{
            return Peleador1.getName();
        }

    }

    private static boolean CualEsPrimero(Fighter Peleador1, String ElPrimero) {
        return Peleador1.getName().equals(ElPrimero);
    }

    private static boolean MientrasPuedanPelear(Fighter Peleador1, Fighter Peleador2) {
        return Peleador1.getHealth() > 0 && Peleador2.getHealth() > 0;
    }
}

