package ro.marcel.algorithm.impl;

import java.math.BigInteger;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.TreeMap;

public class ShanksAlgorithm {

    public static BigInteger given(final BigInteger generator, final Group group, final BigInteger result) {
        final var m = group.order().sqrt().add(BigInteger.ONE);

        final var table = new TreeMap<BigInteger, BigInteger>();

        for(var idx = BigInteger.ZERO; idx.compareTo(m) < 0; idx = idx.add(BigInteger.ONE))
            table.put(generator.modPow(idx, group.modulus()), idx);

        final var multiplier = generator.modPow(m.negate(), group.modulus());
        for(BigInteger idx = BigInteger.ZERO, gamma = result; idx.compareTo(m) < 0; idx = idx.add(BigInteger.ONE)) {
            final var foundElement = Optional.ofNullable(table.get(gamma));

            if(foundElement.isPresent())
                return idx.multiply(m).add(foundElement.get());

            gamma = gamma.multiply(multiplier).mod(group.modulus());
        }

        throw new NoSuchElementException();
    }
}
