package org.pass.generator.ui;

import org.pass.generator.ui.impl.CLIOutputComponent;
import org.pass.generator.ui.impl.DefaultOutputComponent;

import java.util.Objects;

public class UIComponentProvider {
    private static UIComponentProvider instance;

    private UIComponentProvider() {
    }

    public UIComponent provide() {
        try {
            return new CLIOutputComponent();
        } catch (RuntimeException unused) {
            return new DefaultOutputComponent();
        }
    }

    public static UIComponentProvider getInstance() {
        if (Objects.isNull(instance)) {
            instance = new UIComponentProvider();
        }
        return instance;
    }
}
