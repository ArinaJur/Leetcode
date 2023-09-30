import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L27RemoveElementTest {

    private static Stream<Arguments> dataLongestCommonPrefix() {
        return Stream.of(
                Arguments.of(new int[]{1, 2, 3, 4, 2, 5, 2, 9}, 2, 5),
                Arguments.of(new int[]{1, 2, 3, 4, Integer.MAX_VALUE, 5, 2, Integer.MAX_VALUE}, 2, 6),
                Arguments.of(new int[]{1, 2, 3, 4, Integer.MAX_VALUE, 5, 2, Integer.MAX_VALUE}, Integer.MAX_VALUE, 6),
                Arguments.of(new int[]{}, 2, 0),
                Arguments.of(new int[]{3, 3}, 3, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("dataLongestCommonPrefix")
    public void testRemoveElementTime(int[] nums, int val, int expectedResult) {
        L27RemoveElement removeElement = new L27RemoveElement();
        int actualResult = removeElement.removeElement(nums, val);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @MethodSource("dataLongestCommonPrefix")
    public void testRemoveElementMemory(int[] nums, int val, int expectedResult) {
        L27RemoveElement removeElement = new L27RemoveElement();
        int actualResult = removeElement.removeElementMemory(nums, val);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
