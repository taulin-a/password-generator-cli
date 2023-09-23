package org.pass.generator.exception;

public class InvalidStrategyException extends RuntimeException {
    public InvalidStrategyException(String strategyStr) {
        super("Invalid strategy: ".concat(strategyStr));
    }
}
