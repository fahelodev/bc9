package gGavotti;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class isVeryEvenNumberClassTest {

    @Test
    public void isVeryEvenTest(){

            assertEquals(        true,  isVeryEvenNumberClass.isVeryEvenNumber(0));
            assertEquals(        true,  isVeryEvenNumberClass.isVeryEvenNumber(4));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(12));
            assertEquals(        true,  isVeryEvenNumberClass.isVeryEvenNumber(222));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(5));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(45));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(4554));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(1234));
            assertEquals(        false,  isVeryEvenNumberClass.isVeryEvenNumber(88));
            assertEquals(        true,  isVeryEvenNumberClass.isVeryEvenNumber(24));
            assertEquals(        true,  isVeryEvenNumberClass.isVeryEvenNumber(400000220));
        }
    }

