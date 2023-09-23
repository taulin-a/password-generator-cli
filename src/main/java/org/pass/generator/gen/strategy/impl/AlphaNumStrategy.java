package org.pass.generator.gen.strategy.impl;

import org.pass.generator.gen.strategy.PassGenStrategy;

import static org.pass.generator.gen.strategy.Alphabet.LETTERS;
import static org.pass.generator.gen.strategy.Alphabet.NUMBERS;

public class AlphaNumStrategy extends PassGenStrategy {
    private static final String ALPHABET = LETTERS.concat(NUMBERS);

    @Override
    public String generate(int len) {
        return generate(len, ALPHABET);
    }
}
