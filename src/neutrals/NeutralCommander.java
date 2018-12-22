package neutrals;

import common.interfaces.ICommander;
import common.races.Elf;

public class NeutralCommander extends Elf implements ICommander {
    @Override
    public void promoteSubordinate() {
        System.out.println("promote subordonate");
    }

    @Override
    public void sendOrders() {
        System.out.println("send orders");
    }
}