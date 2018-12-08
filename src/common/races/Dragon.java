package common.races;

import common.interfaces.IRace;
import common.Unit;

public class Dragon extends Unit implements IRace {
    @Override
    public String greeting() {
        return "Grrrr";
    }

    @Override
    public String farewell() {
        return "Frrrr";
    }
}
