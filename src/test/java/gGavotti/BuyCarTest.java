package gGavotti;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BuyCarTest {
    @Test
    public void test1 () {
        int[] r = new int[] { 6, 766 }; // se ejecuta con los datos del resultado
        assertArrayEquals(r, BuyCar.nMeses(2000, 8000, 1000, 1.5));
        System.out.println("*******************Test 1****************************************");
        System.out.println("*****************************************************************");
        System.out.println("************VALORES ESPERADOS************************************");
        System.out.println("Numero de mes:"+r[0]+ "\nDinero devuelvo $"+r[1]);
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
    }
    @Test
    public void test2() {
        int[] r = new int[] { 0, 4000 }; //precio del vehiculo viejo es mayor
        assertArrayEquals(r, BuyCar.nMeses(12000, 8000, 1000, 1.5));
        System.out.println("*******************Test 2****************************************");
        System.out.println("*****************************************************************");
        System.out.println("************VALORES ESPERADOS************************************");
        System.out.println("Numero de mes:"+r[0]+ "\nDinero devuelvo $"+r[1]);
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
    }
    @Test
    public void test3() {
        int[] r = new int[] { 0, 0 }; // precio de los vehiculos iguales
        assertArrayEquals(r, BuyCar.nMeses(8000, 8000, 1000, 1.5));
        System.out.println("*******************Test 3****************************************");
        System.out.println("*****************************************************************");
        System.out.println("************VALORES ESPERADOS************************************");
        System.out.println("Numero de mes:"+r[0]+ "\nDinero devuelvo $"+r[1]);
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
    }


}
