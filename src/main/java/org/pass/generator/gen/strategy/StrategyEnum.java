package org.pass.generator.gen.strategy;

import java.util.Arrays;

public enum StrategyEnum {
    SECURE,
    ALPHA_NUM,
    NUMERIC;

    public static StrategyEnum ofStr(String value) {
        return Arrays.stream(values())
                .filter(s -> s.name().equals(value))
                .findFirst()
                .orElse(null);
    }
}
