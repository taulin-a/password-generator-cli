package org.pass.generator.model;

import com.beust.jcommander.Parameter;

public class PasswordGenInputDTO {
    @Parameter(names = {"--length", "-l"})
    private int length;

    @Parameter(names = {"--strategy", "-s"})
    private String strategy;

    public PasswordGenInputDTO() {
    }

    public PasswordGenInputDTO(int length, String strategy) {
        this.length = length;
        this.strategy = strategy;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }
}
