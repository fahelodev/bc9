package dleiva;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

class VeryEvenTest {

//import static arguments;

// TODO: Replace examples and use TDD by writing your own tests

    class SampleTests {
        @ParameterizedTest(name = "number = {0}")
        @MethodSource
        @DisplayName("test some numbers")
        void sampleTests(int number, boolean expected) {
            assertEquals(expected, VeryEven.isVeryEvenNumber(number), number +" is " + (expected ? "" : "not ") + "'Very Even'");
        }

        static Stream<Arguments> sampleTests() {
            return Stream.of(arguments(        0,  true),
                    arguments(        4,  true),
                    arguments(       12, false),
                    arguments(      222,  true),
                    arguments(        5, false),
                    arguments(       45, false),
                    arguments(     4554, false),
                    arguments(     1234, false),
                    arguments(       88, false),
                    arguments(       24,  true),
                    arguments(400000220,  true));
        }
    }
}