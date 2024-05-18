package org.pass.generator.ui;

import static org.pass.generator.ui.UIConstants.ANSI_RED_BACKGROUND;
import static org.pass.generator.ui.UIConstants.ANSI_RESET;

public class CLIBaseComponent {
    protected String formatErrorMessage(String errMessage) {
        return ANSI_RED_BACKGROUND.concat(errMessage).concat(ANSI_RESET);
    }
}
