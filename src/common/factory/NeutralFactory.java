package common.factory;

import common.Unit;
import neutrals.NeutralArcher;
import neutrals.NeutralCommander;
import neutrals.NeutralDragon;
import neutrals.NeutralSolder;

public class NeutralFactory extends AbstractFactory {
    private static NeutralFactory neutralFactoryInstance;

    private NeutralFactory(){};

    public static NeutralFactory getInstance()
    {
        if(neutralFactoryInstance == null) {
            neutralFactoryInstance = new NeutralFactory();
        }

        return neutralFactoryInstance;
    }

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
            case "soldier":
                return new NeutralSolder();

            case "archer":
                return new NeutralArcher();

            case "commander":
                return new NeutralCommander();

            case "dragon":
                return new NeutralDragon();

            default:
                return null;
        }
    }
}
