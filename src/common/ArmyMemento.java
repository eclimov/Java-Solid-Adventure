package common;

import common.interfaces.Memento;

import java.util.ArrayList;

public class ArmyMemento implements Memento {
    private ArrayList<Unit> units;

    public ArmyMemento(ArrayList<Unit> units) {
        this.units = units;
    }

    @Override
    public ArrayList<Unit> getUnits() {
        return units;
    }

    public ArmyMemento setUnits(ArrayList<Unit> units) {
        this.units = units;
        return this;
    }
}
