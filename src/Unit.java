public class Unit implements IAttacker, IUnit {
    private boolean dead = false;

    @Override
    public void attack() {
        System.out.println(this.getClass().getName() + " attacks");
    }

    @Override
    public Unit spawn() {
        System.out.printf(this.getClass().getName() + " spawned ('%s')%n", ((IRace)this).greeting());

        return this;
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
}
