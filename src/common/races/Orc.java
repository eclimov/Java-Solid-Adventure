package common.races;

import common.interfaces.IRace;
import common.Unit;

public class Orc extends Unit implements IRace {
    @Override
    public String greeting() {
        return "Mok-rah";
    }

    @Override
    public String farewell() {
        return "Zug-zug";
    }
}
