package common.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "ally":
                return new AllyFactory();

            case "enemy":
                return new EnemyFactory();

            case "neutral":
                return new NeutralFactory();

            default:
                return null;
        }
    }
}
