package org.pass.generator.ui.impl;

import org.pass.generator.ui.CLIBaseComponent;
import org.pass.generator.ui.UIComponent;

public class DefaultOutputComponent extends CLIBaseComponent implements UIComponent {
    private static final String LINE_BREAK = "%n";

    @Override
    public void displayMessage(String message, String... params) {
        System.out.printf((message) + LINE_BREAK, (Object[]) params);
    }

    @Override
    public void displayErrorMessage(String message, String... params) {
        System.err.printf((message) + LINE_BREAK, (Object[]) params);
    }
}
