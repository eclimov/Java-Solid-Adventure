package allies;

import common.races.Dragon;
import common.interfaces.IFly;

public class AllyDragon extends Dragon implements IFly {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}
