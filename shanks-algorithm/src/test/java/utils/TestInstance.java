package utils;

import ro.marcel.algorithm.impl.Group;

import java.math.BigInteger;

public record TestInstance(
        BigInteger generator,
        Group group,
        BigInteger result,
        BigInteger expectedValue
) {

}
