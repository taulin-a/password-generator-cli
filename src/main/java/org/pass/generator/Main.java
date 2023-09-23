package org.pass.generator;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParameterException;
import org.pass.generator.exception.InvalidStrategyException;
import org.pass.generator.gen.strategy.PassGenStrategyFactory;
import org.pass.generator.model.PasswordGenInputDTO;

public class Main {
    public static void main(String[] args) {
        try {
            var passGenInput = new PasswordGenInputDTO();

            JCommander.newBuilder()
                    .addObject(passGenInput)
                    .build()
                    .parse(args);

            var strategy = PassGenStrategyFactory.getInstance().getStrategy(passGenInput.getStrategy());

            System.out.printf("Password generated: %s%n", strategy.generate(passGenInput.getLength()));
        } catch (ParameterException e) {
            System.out.printf("Invalid parameter: %s%n", e.getMessage());
        } catch (InvalidStrategyException e) {
            System.out.println(e.getMessage());
        }
    }
}