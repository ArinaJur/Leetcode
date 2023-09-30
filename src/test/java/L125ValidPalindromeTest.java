import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L125ValidPalindromeTest {
    private static Stream<Arguments> dataValidPalindrome() {
        return Stream.of(
                Arguments.of("A man, a plan, a canal: Panama", true),
                Arguments.of("race a car", false),
                Arguments.of("abba", true),
                Arguments.of("abcba", true),
                Arguments.of(" ", true),
                Arguments.of("a", true),
                Arguments.of(null, false),
                Arguments.of("", false),
                Arguments.of("Шалаш", false)
        );
    }

    @ParameterizedTest
    @MethodSource("dataValidPalindrome")
    public void testValidPalindrome(String string, boolean expectedResult) {
        L125ValidPalindrome vp = new L125ValidPalindrome();
        boolean actualResult = vp.isPalindrome(string);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
