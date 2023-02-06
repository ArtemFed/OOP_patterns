package abstractFactory.goblinsAttackTeam;

import abstractFactory.Warrior;

public class WarriorGoblin implements Warrior {
    @Override
    public void Attack() {
        System.out.println("The Goblin is hitting enemies");
    }
}
