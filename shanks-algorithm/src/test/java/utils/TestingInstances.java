package utils;

import ro.marcel.algorithm.impl.Group;

import java.math.BigInteger;
import java.util.List;

public class TestingInstances {

    public static final List<TestInstance> instances = List.of(
            new TestInstance(BigInteger.valueOf(3), new Group(BigInteger.valueOf(113), BigInteger.valueOf(112)), BigInteger.valueOf(57), BigInteger.valueOf(100)),
            new TestInstance(BigInteger.valueOf(17), new Group(BigInteger.valueOf(509), BigInteger.valueOf(127)), BigInteger.valueOf(438), BigInteger.valueOf(59))
    );
}
