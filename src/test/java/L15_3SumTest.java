import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class L15_3SumTest {

    //List<List<Integer>> threeSum(int[] nums)

    private static Stream<Arguments> threeSumArgumentsProvider() {
         return Stream.of(
                 Arguments.of(new int[]{-1, 0, 1, 2, -1, -4}, List.of (List.of(-1,0,1), List.of(-1,-1,2)))
         );
    }


    @ParameterizedTest
    @MethodSource("threeSumArgumentsProvider")
    public void testThreeSum(int[] nums, List<List<Integer>> expectedResult) {
        List<List<Integer>> actualResults = new L15_3Sum().threeSum(nums);

        Assertions.assertArrayEquals(new List[]{expectedResult}, new List[]{actualResults});
    }
}
