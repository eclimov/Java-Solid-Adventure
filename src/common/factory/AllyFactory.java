package common.factory;

import allies.AllyCommander;
import allies.AllyDragon;
import allies.AllyMage;
import allies.AllySoldier;
import common.Unit;

public class AllyFactory extends AbstractFactory {
    private static AllyFactory allyFactoryInstance;

    private AllyFactory(){};

    public static AllyFactory getInstance()
    {
        if(allyFactoryInstance == null) {
            allyFactoryInstance = new AllyFactory();
        }

        return allyFactoryInstance;
    }

    @Override
    public Unit getAlly(String unitType) {
        unitType = unitType.toLowerCase();
        switch (unitType) {
            case "commander":
                return new AllyCommander();

            case "dragon":
                return new AllyDragon();

            case "mage":
                return new AllyMage();

            case "soldier":
                return new AllySoldier();

            default:
                return null;
        }
    }

    @Override
    public Unit getEnemy(String unitType) {
        return null;
    }

    @Override
    public Unit getNeutral(String unitType) {
        return null;
    }
}
