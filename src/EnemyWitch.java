public class EnemyWitch extends Orc implements ICurser, IFly {
    @Override
    public void curse() {
        System.out.println("fly");
    }

    @Override
    public void fly() {
        System.out.println("fly");
    }
}
