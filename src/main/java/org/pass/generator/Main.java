package org.pass.generator;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import org.pass.generator.exception.InvalidStrategyException;
import org.pass.generator.gen.strategy.PassGenStrategyFactory;
import org.pass.generator.model.PasswordGenInputDTO;
import org.pass.generator.ui.UIComponentProvider;

public class Main {
    public static void main(String[] args) {
        var uiComponent = UIComponentProvider.getInstance().provide();
        try {
            var passGenInput = new PasswordGenInputDTO();

            JCommander.newBuilder()
                    .addObject(passGenInput)
                    .build()
                    .parse(args);

            var strategy = PassGenStrategyFactory.getInstance().getStrategy(passGenInput.getStrategy());
            uiComponent.displayMessage("Password generated: %s", strategy.generate(passGenInput.getLength()));
        } catch (ParameterException e) {
            uiComponent.displayErrorMessage("Invalid parameter: %s", e.getMessage());
        } catch (InvalidStrategyException e) {
            uiComponent.displayErrorMessage(e.getMessage());
        }
    }
}