package neutrals;

import common.interfaces.IFly;
import common.races.Dragon;

public class NeutralDragon extends Dragon implements IFly {
    @Override
    public void fly() {
        System.out.println("fly");
    }
}