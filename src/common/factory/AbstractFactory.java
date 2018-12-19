package common.factory;

import common.Unit;

public abstract class AbstractFactory {
    public abstract Unit getAlly(String unitType);
    public abstract Unit getEnemy(String unitType);
    public abstract Unit getNeutral(String unitType);
}
