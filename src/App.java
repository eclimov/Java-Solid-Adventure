import allies.AllyCommander;
import allies.AllyDragon;
import allies.AllyMage;
import allies.AllySoldier;
import common.factory.AbstractFactory;
import common.factory.FactoryProducer;
import common.interfaces.IRace;
import common.Unit;
import enemies.EnemyCommander;
import enemies.EnemyDragon;
import enemies.EnemySoldier;
import enemies.EnemyWitch;
import neutrals.NeutralArcher;
import neutrals.NeutralSolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        ArrayList<String> commonTypes = new ArrayList<String>();
        commonTypes.add("soldier");
        commonTypes.add("commander");
        commonTypes.add("dragon");

        ArrayList<String> allyTypes = (ArrayList<String>) commonTypes.clone();
        allyTypes.add("mage");

        ArrayList<String> enemyTypes = (ArrayList<String>) commonTypes.clone();
        enemyTypes.add("witch");

        ArrayList<String> neutralTypes = (ArrayList<String>) commonTypes.clone();
        neutralTypes.add("archer");

        ArrayList<String> possibleNames = new ArrayList<String>();
        possibleNames.add("John");
        possibleNames.add("Peter");
        possibleNames.add("Todd");
        possibleNames.add("Andrew");
        possibleNames.add("Gordon");
        possibleNames.add("Bill");
        possibleNames.add("Maria");
        possibleNames.add("Anna");

        AbstractFactory allyFactory = FactoryProducer.getFactory("ally");
        AbstractFactory enemyFactory = FactoryProducer.getFactory("enemy");
        AbstractFactory neutralFactory = FactoryProducer.getFactory("neutral");

        int armyNumber = 7;  // Number is reduced for debugging purposes

        ArrayList<Unit> allyArmy = new ArrayList(armyNumber);
        int neutralsJoinedToAllies = (new Random()).nextInt(3);  // Number of neutrals to join ally army
        System.out.println("*Allies*");
        for (int i = 0; i < armyNumber; i++) {
            Unit unit = allyFactory
                    .getAlly(getRandomItem(allyTypes))
                    .setName(getRandomItem(possibleNames))
                    .setAge(20 + (new Random()).nextInt(30))
                    .spawn();
            allyArmy.add(unit);

            if(i < neutralsJoinedToAllies) {
                Unit neutral = neutralFactory
                        .getNeutral(getRandomItem(neutralTypes))
                        .setName(getRandomItem(possibleNames))
                        .setAge(20 + (new Random()).nextInt(30))
                        .spawn();
                allyArmy.add(neutral);
            }
        }

        System.out.println();

        ArrayList<Unit> enemyArmy = new ArrayList(armyNumber);
        int neutralsJoinedToEnemies = (new Random()).nextInt(3);  // Number of neutrals to join enemy army
        System.out.println("*Enemies*");
        for (int i = 0; i < armyNumber; i++) {
            Unit unit = enemyFactory
                    .getEnemy(getRandomItem(enemyTypes))
                    .setName(getRandomItem(possibleNames))
                    .setAge(20 + (new Random()).nextInt(30))
                    .spawn();
            enemyArmy.add(unit);

            if(i < neutralsJoinedToEnemies) {
                Unit neutral = neutralFactory
                        .getNeutral(getRandomItem(neutralTypes))
                        .setName(getRandomItem(possibleNames))
                        .setAge(20 + (new Random()).nextInt(30))
                        .spawn();
                enemyArmy.add(neutral);
            }
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("*Fight*\n");
        for(Unit allyUnit: allyArmy) {
            int decision = (new Random()).nextInt(3);

            // In Production decisions would be based on some formula rather than random
            if(decision == 0) {  // ally dies, enemy survives
                for (Unit enemyUnit: enemyArmy) {  // Not quite optimal, but it's ok for now
                    if(!enemyUnit.isDead()) {
                        enemyUnit.attack();
                        break;
                    }
                }
                allyUnit.die();
            } else if(decision == 1) {  // ally survives, next enemy alive dies
                allyUnit.attack();
                for (Unit enemyUnit: enemyArmy) {  // Not quite optimal, but it's ok for now
                    if(!enemyUnit.isDead()) {
                        enemyUnit.die();
                        break;
                    }
                }
            } else {  // Both die
                allyUnit.attack();
                for (Unit enemyUnit: enemyArmy) {  // Not quite optimal, but it's ok for now
                    if(!enemyUnit.isDead()) {
                        enemyUnit.attack();
                        enemyUnit.die();
                        break;
                    }
                }
                allyUnit.die();
            }
            System.out.println();
        }

        System.out.println("-----------------------------------------------------");

        System.out.println("*Survivors*");
        for(Unit unit: allyArmy) {
            if (!unit.isDead()) {
                System.out.printf("%s (%s)%n", unit, ((IRace) unit).farewell());
            }
        }
        for(Unit unit: enemyArmy) {
            if (!unit.isDead()) {
                System.out.printf("%s (%s)%n", unit, ((IRace) unit).farewell());
            }
        }
    }

    public static <E> E getRandomItem(ArrayList<E> arrayList) {
        return arrayList.get(new Random().nextInt(arrayList.size()));
    }
}
