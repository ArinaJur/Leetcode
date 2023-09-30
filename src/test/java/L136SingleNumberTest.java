import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L136SingleNumberTest {
    private static Stream<Arguments> singleNumberArguments () {
        return Stream.of (
                Arguments.of(new int[]{4,1,2,1,2}, 4),
                Arguments.of(new int[]{1,2,3,2,3}, 1),
                Arguments.of(new int[]{0}, 0),
                Arguments.of(new int[]{}, 0),
                Arguments.of(new int[]{-967,-590,980,-806,145,-881,357,-787,-592,859,627,-929,296,818,-194,586,-106,
                        -479,967,132,-396,-692,464,726,-967,-590,980,-806,145,-881,357,-787,-592,859,627,-929,296,818,
                        -194,586,-106,-479,967,132,-396,-692,464,726,-755}, -755)
        );
    }

    @ParameterizedTest
    @MethodSource("singleNumberArguments")
    public void testSingleNumber(int[] arr, int expectedResult) {
        L136SingleNumber sn = new L136SingleNumber();
        int actualResult = sn.singleNumber(arr);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}

