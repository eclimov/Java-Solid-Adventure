public class Human extends Unit implements IRace {
    @Override
    public String greeting() {
        return "Greetings!";
    }

    @Override
    public String farewell() {
        return "Farewell!";
    }
}
