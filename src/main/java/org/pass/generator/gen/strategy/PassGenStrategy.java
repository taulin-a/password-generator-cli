package org.pass.generator.gen.strategy;

import java.util.Random;

public abstract class PassGenStrategy {
    protected final Random random;

    public PassGenStrategy() {
        this.random = new Random();
    }

    protected String generate(final int len, final String alphabet) {
        var builder = new StringBuilder();
        for (int i = 0; i < len; i++) {
            builder.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        return builder.toString();
    }

    public abstract String generate(int len);
}
