package common.factory;

import common.Unit;
import enemies.EnemyCommander;
import enemies.EnemyDragon;
import enemies.EnemySoldier;
import enemies.EnemyWitch;

public class EnemyFactory extends AbstractFactory {
    private static EnemyFactory enemyFactoryInstance;

    private EnemyFactory(){};

    public static EnemyFactory getInstance()
    {
        if(enemyFactoryInstance == null) {
            enemyFactoryInstance = new EnemyFactory();
        }

        return enemyFactoryInstance;
    }

    @Override
    public Unit getAlly(String unitType) {
        return null;
    }

    @Override
    public Unit getEnemy(String unitType) {
        unitType = unitType.toLowerCase();
        switch (unitType) {
            case "commander":
                return new EnemyCommander();

            case "dragon":
                return new EnemyDragon();

            case "soldier":
                return new EnemySoldier();

            case "witch":
                return new EnemyWitch();

            default:
                return null;
        }
    }

    @Override
    public Unit getNeutral(String unitType) {
        return null;
    }
}
