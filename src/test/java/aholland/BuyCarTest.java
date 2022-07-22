package aholland;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BuyCarTest {

    @Test
    public void ahorrar() { //
        int[] r = new int[] { 6, 766 };
        assertArrayEquals(r, BuyCar.nbMonths(2000, 8000, 1000, 1.5));
        System.out.println("En " + r[0] + " meses puede comprar el auto y le sobra $" + r[1]);
    }
    @Test
    public void noahorrar() { //
        int[] r = new int[] { 0, 4000 };
        assertArrayEquals(r, BuyCar.nbMonths(12000, 8000, 1000, 1.5));
        System.out.println("No necesita ahorrar, puede comprar el auto y le sobra $" + r[1]);
    }
}
