package gGavotti;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class KataReverseWordsTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", KataReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", KataReverseWords.reverseWords("apple"));
        assertEquals("a b c d", KataReverseWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", KataReverseWords.reverseWords("double  spaced  words"));
    }
}
