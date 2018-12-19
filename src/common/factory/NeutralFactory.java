package common.factory;

import common.Unit;
import neutrals.NeutralArcher;
import neutrals.NeutralSolder;

public class NeutralFactory extends AbstractFactory {
    @Override
    public Unit getAlly(String unitType) {
        return null;
    }

    @Override
    public Unit getEnemy(String unitType) {
        return null;
    }

    @Override
    public Unit getNeutral(String unitType) {
        unitType = unitType.toLowerCase();
        switch (unitType) {
            case "solder":
                return new NeutralSolder();

            case "archer":
                return new NeutralArcher();

            default:
                return null;
        }
    }
}
