package ro.marcel.algorithm.impl;

import org.junit.Test;
import utils.TestingInstances;

public class ShanksAlgorithmTest {


    @Test
    public void runInstances() {
        TestingInstances.instances.forEach(instance -> {
            final var result = ShanksAlgorithm.given(instance.generator(), instance.group(), instance.result());
            assert result.equals(instance.expectedValue());
        });
    }
}
