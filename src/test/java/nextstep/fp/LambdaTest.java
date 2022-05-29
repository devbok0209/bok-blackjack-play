package nextstep.fp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class LambdaTest {
    private List<Integer> numbers;

    @BeforeEach
    public void setup() {
        numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
    }

    @Test
    void printAllOld() throws Exception {
        Lambda.printAllOld(numbers);
    }

    @Test
    void printAllLambda() throws Exception {
        Lambda.printAllLambda(numbers);
    }

    @Test
    void runThread() throws Exception {
        Lambda.runThread();
    }

    @Test
    void sumAll() throws Exception {
        int sum = Lambda.sumAll(numbers);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    void sumNewAll() throws Exception {
        int sum = Lambda.sumUsingLamda(numbers, number -> true);
        assertThat(sum).isEqualTo(21);
    }

    @Test
    void sumAllEven() throws Exception {
        int sum = Lambda.sumAllEven(numbers);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    void sumNewAllEven() throws Exception {
        int sum = Lambda.sumUsingLamda(numbers, number -> number % 2 == 0);
        assertThat(sum).isEqualTo(12);
    }

    @Test
    void sumAllOverThree() throws Exception {
        int sum = Lambda.sumAllOverThree(numbers);
        assertThat(sum).isEqualTo(15);
    }


    @Test
    void sumNewAllOverThree() throws Exception {
        int sum = Lambda.sumUsingLamda(numbers, number -> number > 3);
        assertThat(sum).isEqualTo(15);
    }

}
