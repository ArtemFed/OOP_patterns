package abstractFactory.goblinsAttackTeam;

import abstractFactory.Leader;

public class LeaderGoblin implements Leader {

    @Override
    public void PlanAttack() {
        System.out.println("The Goblin is planning an attack ");
    }
}
