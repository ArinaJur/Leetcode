import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L9PalindromeNumberTest {

    private static Stream<Arguments> palindromeNumberArgumentsProvider() {
        return Stream.of(
                Arguments.of(121, true),
                Arguments.of(-121, false),
                Arguments.of(10, false),
                Arguments.of(1001, true),
                Arguments.of(8, true),
                Arguments.of(0, true),
                Arguments.of(1034, false)
        );
    }

    @ParameterizedTest
    @MethodSource("palindromeNumberArgumentsProvider")
    public void testPalindromeNumber(int x, boolean expectedResult) {
        L9PalindromeNumber pn = new L9PalindromeNumber();
        boolean actualResult = pn.isPalindrome(x);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("palindromeNumberArgumentsProvider")
    public void testPalindromeNumber1(int x, boolean expectedResult) {
        L9PalindromeNumber pn = new L9PalindromeNumber();
        boolean actualResult = pn.isPalindrome1(x);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("palindromeNumberArgumentsProvider")
    public void testPalindromeNumber2(int x, boolean expectedResult) {
        L9PalindromeNumber pn = new L9PalindromeNumber();
        boolean actualResult = pn.isPalindrome2(x);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
