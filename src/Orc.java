public class Orc extends Unit implements IRace {
    @Override
    public String greeting() {
        return "Mok-rah";
    }

    @Override
    public String farewell() {
        return "Zug-zug";
    }
}
