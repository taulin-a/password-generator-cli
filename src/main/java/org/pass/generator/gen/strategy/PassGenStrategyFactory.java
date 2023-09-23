package org.pass.generator.gen.strategy;

import org.pass.generator.exception.InvalidStrategyException;
import org.pass.generator.gen.strategy.impl.AlphaNumStrategy;
import org.pass.generator.gen.strategy.impl.NumericStrategy;
import org.pass.generator.gen.strategy.impl.SecureStrategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PassGenStrategyFactory {
    private static PassGenStrategyFactory instance;

    private final Map<StrategyEnum, PassGenStrategy> strategyMap;

    public PassGenStrategyFactory() {
        strategyMap = new HashMap<>();
        strategyMap.put(StrategyEnum.SECURE, new SecureStrategy());
        strategyMap.put(StrategyEnum.ALPHA_NUM, new AlphaNumStrategy());
        strategyMap.put(StrategyEnum.NUMERIC, new NumericStrategy());
    }

    public PassGenStrategy getStrategy(String strategyStr) {
        StrategyEnum strategy;

        if (Objects.isNull(strategyStr) || strategyStr.isBlank()) {
            strategy = StrategyEnum.SECURE;
        } else {
            strategy = StrategyEnum.ofStr(strategyStr);

            if (Objects.isNull(strategy)) throw new InvalidStrategyException(strategyStr);
        }

        return strategyMap.get(strategy);
    }

    public static PassGenStrategyFactory getInstance() {
        if (Objects.isNull(instance)) instance = new PassGenStrategyFactory();

        return instance;
    }
}
