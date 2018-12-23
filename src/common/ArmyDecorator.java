package common;

import java.util.ArrayList;

public class ArmyDecorator {
    private ArrayList<Unit> army;

    public ArmyDecorator(ArrayList<Unit> army) {
        this.army = army;
    }

    public ArrayList<Unit> killEveryone() {
        for (Unit unit : this.army) {
            if(!unit.isDead()) {
                unit.die();
            }
        }

        return this.army;
    }
}
