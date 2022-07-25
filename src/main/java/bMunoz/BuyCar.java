package bMunoz;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth)
    {
        int meses=0;
        double precioNuevo=startPriceNew;
        double precioViejo=startPriceOld;
        double sobrante;
        double ahorros=0;
        double descuento=(percentLossByMonth / 100);

        while (dineroSuficiente(precioNuevo, precioViejo, ahorros))
        {
            meses++;

            descuento = descuentoBiMensual(meses, descuento);

            precioNuevo -= (precioNuevo*descuento);
            precioViejo -= (precioViejo*descuento);

            ahorros += savingperMonth;

        }
        sobrante=(ahorros+precioViejo)-precioNuevo;

        return new int[]{meses, (int) sobrante};
    }
    private static double descuentoBiMensual(int meses, double descuento)
    {
        if (meses % 2 == 0)
        {
            descuento += 0.005;

        }
        return descuento;
    }
    private static boolean dineroSuficiente(double precioNuevo, double precioViejo, double ahorros)
    {
        return (precioViejo + ahorros) < precioNuevo;
    }

}
