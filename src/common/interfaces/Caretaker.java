package common.interfaces;

import java.util.Stack;

public interface Caretaker {
    public Stack<Memento> stack = new Stack<Memento>();
    public void addMemento(Memento m);
    public Memento getMemento();
}
