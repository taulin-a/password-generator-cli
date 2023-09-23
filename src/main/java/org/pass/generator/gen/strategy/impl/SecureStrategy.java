package org.pass.generator.gen.strategy.impl;

import org.pass.generator.gen.strategy.PassGenStrategy;

import static org.pass.generator.gen.strategy.Alphabet.LETTERS;
import static org.pass.generator.gen.strategy.Alphabet.NUMBERS;
import static org.pass.generator.gen.strategy.Alphabet.SPECIAL;

public class SecureStrategy extends PassGenStrategy {
    private final static String ALPHABET = LETTERS.concat(NUMBERS).concat(SPECIAL);

    @Override
    public String generate(int len) {
        return generate(len, ALPHABET);
    }
}
