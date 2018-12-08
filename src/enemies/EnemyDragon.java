package enemies;

import common.races.Dragon;
import common.interfaces.IFly;

public class EnemyDragon extends Dragon implements IFly {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
