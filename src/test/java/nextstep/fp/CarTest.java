package nextstep.fp;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    public void 이동() {
        Car car = new Car("pobi", 0);
        Car lamdaActual = car.move(() -> true);
        assertThat(lamdaActual).isEqualTo(new Car("pobi", 1));
    }

    @Test
    public void 정지() {
        Car car = new Car("pobi", 0);
        Car lamdaActual = car.move(() -> false);
        assertThat(lamdaActual).isEqualTo(new Car("pobi", 0));
    }
}
