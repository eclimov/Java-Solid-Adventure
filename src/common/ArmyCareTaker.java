package common;

import common.interfaces.Caretaker;
import common.interfaces.Memento;

public class ArmyCareTaker implements Caretaker {
    @Override
    public void addMemento(Memento m) {
        stack.push(m);
    }
    @Override
    public Memento getMemento() {
        return stack.pop();
    }
}
