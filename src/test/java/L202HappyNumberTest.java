import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class L202HappyNumberTest {

    private static Stream<Arguments> happyNumberArguments() {
        return Stream.of (
                Arguments.of(19, true),
                Arguments.of(2, false),
                Arguments.of(1, true),
                Arguments.of(7, true),
                Arguments.of(229, false),
                Arguments.of(4, false),
                Arguments.of(Integer.MAX_VALUE, false),
                Arguments.of(0, false)
        );
    }

    @ParameterizedTest
    @MethodSource("happyNumberArguments")
    public void testHappyNumber(int n, boolean expectedResult) {
        L202HappyNumber hn = new L202HappyNumber();

        Assertions.assertEquals(expectedResult, hn.isHappy(n));
    }
}
