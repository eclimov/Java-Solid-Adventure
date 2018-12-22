package common.factory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String type) {
        type = type.toLowerCase();
        switch (type) {
            case "ally":
                return AllyFactory.getInstance();

            case "enemy":
                return EnemyFactory.getInstance();

            case "neutral":
                return NeutralFactory.getInstance();

            default:
                return null;
        }
    }
}
