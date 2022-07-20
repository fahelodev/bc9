package gGavotti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class KataReverseTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", KataReverse.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", KataReverse.reverseWords("apple"));
        assertEquals("a b c d", KataReverse.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", KataReverse.reverseWords("double  spaced  words"));
    }
}
