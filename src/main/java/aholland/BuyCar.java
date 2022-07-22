package aholland;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double ahorrado = 0;
        int meses = 0;
        double porcentaje = percentLossByMonth/100;
        double autoViejo = startPriceOld;
        double autoNuevo = startPriceNew;

        if(puedeComprar(autoViejo, autoNuevo)) { //precio autoviejo mayor a autonuevo
            return new int[] { meses, (int) Math.round(autoViejo - autoNuevo)}; //lo que sobro luego de comprar el auto
        }

        do{
            ahorrado += savingperMonth; //acumular lo ahorrado por mes
            meses++; //cuenta los meses
            if(cada2Meses(meses)){ //si pasaron 2 meses el porcentaje aumenta un 0,5
                porcentaje += 0.005;
            }
            autoViejo -= autoViejo*porcentaje; //formula de perdida de valores de los autos
            autoNuevo -= autoNuevo*porcentaje;

        }
        while (noAlcanza(ahorrado, autoViejo, autoNuevo)); //se va a repetir el bucle mientras no alcance para comprar el auto nuevo

        return new int[] { meses, (int) Math.round(autoViejo + ahorrado - autoNuevo)};
    }

    private static boolean cada2Meses(int meses) {
        return meses % 2 == 0;
    }

    private static boolean puedeComprar(double autoViejo, double autoNuevo) {
        return autoViejo >= autoNuevo;
    }

    private static boolean noAlcanza(double ahorrado, double autoViejo, double autoNuevo) {
        return autoViejo + ahorrado < autoNuevo;
    }
}