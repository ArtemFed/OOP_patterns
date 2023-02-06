package abstractFactory.goblinsAttackTeam;

import abstractFactory.Scout;

public class ScoutGoblin implements Scout {

    @Override
    public void SpotEnemy() {
        System.out.println("The Goblin is spotting enemies");
    }
}
