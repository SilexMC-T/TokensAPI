package net.silexmc.tokens.api;

import java.math.BigInteger;
import java.util.UUID;

public interface TokensAPI {
    BigInteger getValue(UUID uniqueID, boolean total);

    String getValueToString(UUID uniqueID, boolean total);

    String getValueToFormat(UUID uniqueID, boolean total);

    default BigInteger getValue(UUID uniqueID) {
        return this.getValue(uniqueID, false);
    }

    default String getValueToString(UUID uniqueID) {
        return this.getValueToString(uniqueID, false);
    }

    default String getValueToFormat(UUID uniqueID) {
        return this.getValueToFormat(uniqueID, false);
    }

    void setValue(UUID uniqueID, BigInteger value);

    void addValue(UUID uniqueID, BigInteger value);

    void takeValue(UUID uniqueID, BigInteger value);

    boolean hasValue(UUID uniqueID, BigInteger value);

    default void setValue(UUID uniqueID, Integer value) {
        this.setValue(uniqueID, BigInteger.valueOf(value));
    }

    default void addValue(UUID uniqueID, Integer value) {
        this.addValue(uniqueID, BigInteger.valueOf(value));
    }

    default void takeValue(UUID uniqueID, Integer value) {
        this.takeValue(uniqueID, BigInteger.valueOf(value));
    }

    default boolean hasValue(UUID uniqueID, Integer value) {
        return this.hasValue(uniqueID, BigInteger.valueOf(value));
    }
}
