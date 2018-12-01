public class AllySoldier extends Human implements IWalker, IProtector {
    @Override
    public void protect() {
        System.out.println("protect");
    }

    @Override
    public void walk() {
        System.out.println("walk");
    }
}
