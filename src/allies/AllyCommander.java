package allies;

import common.races.Human;
import common.interfaces.ICommander;

public class AllyCommander extends Human implements ICommander {
    @Override
    public void promoteSubordinate() {
        System.out.println("promote subordonate");
    }

    @Override
    public void sendOrders() {
        System.out.println("send orders");
    }
}
