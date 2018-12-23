package common.interfaces;

import common.Unit;

import java.util.ArrayList;

public interface Originator {
    public Memento save();

    public void restore(Memento memento);

    public void setUnits(ArrayList<Unit> units);
}
