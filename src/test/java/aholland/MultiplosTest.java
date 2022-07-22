package aholland;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplosTest {
    @Test
    public void multiplosTest(){
        assertEquals(78, Multiplos.Acumulador(20));
    }

    @Test
    public void multiplosTest1(){
        assertEquals(195, Multiplos.Acumulador(30));
    }

    @Test
    public void multiplosNegTest(){
        assertEquals(0, Multiplos.Acumulador(-20));
    }
}
