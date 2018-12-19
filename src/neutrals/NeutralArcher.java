package neutrals;

import common.interfaces.IArcher;
import common.races.Elf;

public class NeutralArcher extends Elf implements IArcher {
    @Override
    public void shoot() {
        System.out.println("shoot");
    }
}
