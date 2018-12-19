package neutrals;

import common.interfaces.IWalker;
import common.races.Elf;

public class NeutralSolder extends Elf implements IWalker {
    @Override
    public void walk() {
        System.out.println("walk");
    }
}
