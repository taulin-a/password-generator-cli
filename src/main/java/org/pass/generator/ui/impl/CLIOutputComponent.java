package org.pass.generator.ui.impl;

import org.pass.generator.ui.CLIBaseComponent;
import org.pass.generator.ui.UIComponent;

import java.io.Console;
import java.util.Objects;

public class CLIOutputComponent extends CLIBaseComponent implements UIComponent {
    private final Console console;

    public CLIOutputComponent() {
        console = System.console();
        if (Objects.isNull(console)) {
            throw new RuntimeException("Console interface not available");
        }
    }

    @Override
    public void displayMessage(String message, String... params) {
        printToConsole(message.formatted((Object[]) params));
    }

    @Override
    public void displayErrorMessage(String message, String... params) {
        printToConsole(formatErrorMessage(message.formatted((Object[]) params)));
    }

    private void printToConsole(String message) {
        try (var writer = console.writer()) {
            writer.println(message);
        }
    }
}
