package allies;

import common.races.Human;
import common.interfaces.IProtector;
import common.interfaces.IWalker;

public class AllySoldier extends Human implements IWalker, IProtector {
    @Override
    public void protect() {
        System.out.println("protect");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
