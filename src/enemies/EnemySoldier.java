package enemies;

import common.interfaces.IWalker;
import common.races.Orc;

public class EnemySoldier extends Orc implements IWalker {
    @Override
    public void walk() {
        System.out.println("walk");
    }
}
