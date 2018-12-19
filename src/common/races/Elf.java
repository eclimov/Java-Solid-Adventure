package common.races;

import common.Unit;
import common.interfaces.IRace;

public class Elf extends Unit implements IRace {
    @Override
    public String greeting() {
        return "Bal'a dash";
    }

    @Override
    public String farewell() {
        return "Shorel'aran";
    }
}
