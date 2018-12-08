package allies;

import common.races.Human;
import common.interfaces.ICaster;
import common.interfaces.IFly;

public class AllyMage extends Human implements IFly, ICaster {
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void castSpell() {
        System.out.println("cast spell");
    }
}
