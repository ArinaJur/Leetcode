import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L66PlusOneTest {
    private static Stream<Arguments> plusOneArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,7,3,3}, new int[]{2,7,3,4}),
                Arguments.of(new int[]{2,7,3,0}, new int[]{}),
                Arguments.of(new int[]{8,9,9,9}, new int[]{9,0,0,0}),
                Arguments.of(new int[]{9, 9, 9, 9}, new int[]{1, 0, 0, 0, 0}),
                Arguments.of(new int[]{9}, new int[]{1, 0}),
                Arguments.of(new int[]{9, 1, 9}, new int[]{9, 2, 0}),
                Arguments.of(new int[]{3}, new int[]{4})
        );
    }

    @ParameterizedTest
    @MethodSource("plusOneArgumentsProvider")
    void testplusOne(int[] digits, int[] expectedResult) {
        L66PlusOne po = new L66PlusOne();
        int[] actulResult = po.plusOne(digits);

        Assertions.assertArrayEquals(expectedResult, actulResult);
    }
}
