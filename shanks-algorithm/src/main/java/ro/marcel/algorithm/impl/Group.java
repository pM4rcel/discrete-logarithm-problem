package ro.marcel.algorithm.impl;

import java.math.BigInteger;

public record Group(
        BigInteger modulus,
        BigInteger order
) {
}
