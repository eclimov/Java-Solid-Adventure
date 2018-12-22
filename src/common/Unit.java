package common;

import common.interfaces.IAttacker;
import common.interfaces.IRace;
import common.interfaces.IUnit;

public class Unit implements IAttacker, IUnit {
    private String name;
    private int age;
    private boolean dead = false;

    @Override
    public void attack() {
        System.out.println(this.getClass().getName() + " attacks");
    }

    @Override
    public Unit spawn() {
        System.out.printf(this + " spawned ('%s')%n", ((IRace)this).greeting());

        return this;
    }

    @Override
    public String toString() {
        return String.format("%s '%s'(age: %d)",
                this.getClass().getName(), this.getName(), this.getAge());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public void die() {
        System.out.println(this.getClass().getName() + " died");
        this.dead = true;
    }

    @Override
    public boolean isDead() {
        return this.dead;
    }

    public Unit setName(String name) {
        this.name = name;
        return this;
    }

    public Unit setAge(int age) {
        this.age = age;
        return this;
    }
}
