import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L14LongestCommonPrefixTest {
    private static Stream<Arguments> dataLongestCommonPrefix() {
        return Stream.of(
                Arguments.of(new String[]{"aa","ab"}, "a"),
                Arguments.of(new String[]{"flower","flow","flight"}, "fl"),
                Arguments.of(new String[]{"cow","dog","horse"}, ""),
                Arguments.of(new String[]{"","dog","horse"}, ""),

                Arguments.of(new String[]{}, "")
        );
    }

    @ParameterizedTest
    @MethodSource("dataLongestCommonPrefix")
    public void testLongestCommonPrefix(String[] words, String expectedResult) {
        L14LongestCommonPrefix lp = new L14LongestCommonPrefix();
        String actualResult = lp.longestCommonPrefix(words);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
