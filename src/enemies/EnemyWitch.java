package enemies;

import common.interfaces.ICurser;
import common.interfaces.IFly;
import common.races.Orc;

public class EnemyWitch extends Orc implements ICurser, IFly {
    @Override
    public void curse() {
        System.out.println("fly");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
