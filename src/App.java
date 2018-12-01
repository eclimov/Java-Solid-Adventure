import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int armyNumber = 5;  // Number is reduced for debugging purposes

        ArrayList<Unit> allyArmy = new ArrayList(armyNumber);
        System.out.println("*Allies*");
        for (int i = 0; i < armyNumber; i++) {
            allyArmy.add(pickRandomAlly().spawn());
        }

        System.out.println();

        ArrayList<Unit> enemyArmy = new ArrayList(armyNumber);
        System.out.println("*Enemies*");
        for (int i = 0; i < armyNumber; i++) {
            enemyArmy.add(pickRandomEnemy().spawn());
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("*Fight*\n");
        for(Unit unit: allyArmy) {
            int decision = (new Random()).nextInt(3);

            if(decision == 0) {  // In Production decision would ba based on some formula rather than random
                enemyArmy.get(allyArmy.indexOf(unit)).attack();
                unit.die();
            } else if(decision == 1) {
                unit.attack();
                enemyArmy.get(allyArmy.indexOf(unit)).die();
            } else {  // Both die
                unit.die();
                enemyArmy.get(allyArmy.indexOf(unit)).die();
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("*Survivors*");
        for(Unit unit: allyArmy) {
            if (!unit.isDead()) {
                System.out.printf("%s (%s)%n", unit.getClass().getName(), ((IRace) unit).farewell());
            }
        }
        for(Unit unit: enemyArmy) {
            if (!unit.isDead()) {
                System.out.printf("%s (%s)%n", unit.getClass().getName(), ((IRace) unit).farewell());
            }
        }
    }



    // This methods' purpose is just to avoid copy-paste in 'main'


    private static Unit pickRandomAlly() {
        int decision = (new Random()).nextInt(4);

        Unit unit = null;
        switch (decision) {
            case 0:  // Soldier
                unit = new AllySoldier();
                break;

            case 1:  // Dragon
                unit = new AllyDragon();
                break;

            case 2:  // Mage
                unit = new AllyMage();
                break;

            case 3:  // Commander
                unit = new AllyCommander();
                break;
        }

        return unit;
    }

    private static Unit pickRandomEnemy() {
        int decision = (new Random()).nextInt(4);

        Unit unit = null;
        switch (decision) {
            case 0:  // Soldier
                unit = new EnemySoldier();
                break;

            case 1:  // Dragon
                unit = new EnemyDragon();
                break;

            case 2:  // Mage
                unit = new EnemyWitch();
                break;

            case 3:  // Commander
                unit = new EnemyCommander();
                break;
        }

        return unit;
    }
}
