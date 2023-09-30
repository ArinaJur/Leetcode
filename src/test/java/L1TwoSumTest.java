import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L1TwoSumTest {

    private static Stream<Arguments> twoSumArgumentsProvider() {
        return Stream.of(
                Arguments.of(new int[]{2,7,11,15}, 9, new int[]{0, 1}),
                Arguments.of(new int[]{3,2,4}, 6, new int[]{1, 2}),
                Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
                Arguments.of(new int[]{}, 9, new int[]{-1, -1}),
                Arguments.of(new int[]{0, 8}, 9, new int[]{-1, -1}),
                Arguments.of(new int[]{0, 0}, 0, new int[]{0, 1}),
                Arguments.of(new int[]{2,-7,11,15}, 4, new int[]{1, 2})
        );
    }

    @ParameterizedTest
    @MethodSource("twoSumArgumentsProvider")
    void testTwoSum(
            int[] nums,
            int target,
            int[] expectedResult
    ) {
        L1TwoSum ts = new L1TwoSum();
        int[] actualResult = ts.twoSum(nums, target);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("twoSumArgumentsProvider")
    void testTwoSum_On(
            int[] nums,
            int target,
            int[] expectedResult
    ) {
        L1TwoSum ts = new L1TwoSum();
        int[] actualResult = ts.twoSum_On(nums, target);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
