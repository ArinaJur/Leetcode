import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class IncrementDecrementTest {

    private static Stream<Arguments> incrementDecrementProvider() {
        return Stream.of(
                Arguments.of(new String[]{"--X","X++","X++"}, 1),
                Arguments.of(new String[]{"++X","++X","X++"}, 0),
                Arguments.of(new String[]{"X++","++X","--X","X--"}, 0)
        );
    }

    @ParameterizedTest
    @MethodSource("incrementDecrementProvider")
    void testIncrementDecrement(String[] operations, int x) {
        IncrementDecrement id = new IncrementDecrement();
        int actualResult = id.finalValueAfterOperations(operations);

        Assertions.assertEquals(x, actualResult);
    }
}
