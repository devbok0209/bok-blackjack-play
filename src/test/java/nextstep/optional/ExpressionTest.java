package nextstep.optional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;


 class ExpressionTest {
    @Test
    void of() throws IllegalAccessException {
        assertTrue(Expression.PLUS == Expression.of("+"));
    }

    @Test
    void notValidExpression() {
        assertThatIllegalArgumentException()
                .isThrownBy(() -> {
                    Expression.of("&");
                });
    }
}
