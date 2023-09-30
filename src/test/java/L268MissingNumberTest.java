import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L268MissingNumberTest {

    private static Stream<Arguments> missingNumberArgs() {
        return Stream.of(
                Arguments.of(new int[]{3,0,1}, 2),
                Arguments.of(new int[]{0}, 1),
                Arguments.of(new int[]{9,6,4,2,3,5,7,0,1}, 8),
                Arguments.of(new int[]{}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("missingNumberArgs")
    public void testMissingNumber2(int[] nums, int expectedResult) {
        L268MissingNumber mn = new L268MissingNumber();
        int actualResult = mn.missingNumber2(nums);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
