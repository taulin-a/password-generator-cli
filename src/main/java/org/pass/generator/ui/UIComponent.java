package org.pass.generator.ui;

public interface UIComponent {
    void displayMessage(String message, String... params);

    void displayErrorMessage(String message, String... params);
}
