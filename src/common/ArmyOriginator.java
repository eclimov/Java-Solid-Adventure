package common;

import com.sun.deploy.util.StringUtils;
import common.interfaces.Memento;
import common.interfaces.Originator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArmyOriginator implements Originator {
    private ArrayList<Unit> units;

    @Override
    public Memento save() {
        return new ArmyMemento(this.units);
    }
    @Override
    public void restore(Memento memento) {
        this.units = memento.getUnits();
    }

    @Override
    public void setUnits(ArrayList<Unit> units) {
        this.units = units;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    @Override
    public String toString() {
        return units.stream()
                .map(Object::toString)
                .collect(Collectors.joining("\n"));
    }
}
