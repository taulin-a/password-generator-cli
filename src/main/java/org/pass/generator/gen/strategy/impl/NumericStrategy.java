package org.pass.generator.gen.strategy.impl;

import org.pass.generator.gen.strategy.Alphabet;
import org.pass.generator.gen.strategy.PassGenStrategy;

public class NumericStrategy extends PassGenStrategy {
    @Override
    public String generate(int len) {
        return generate(len, Alphabet.NUMBERS);
    }
}
