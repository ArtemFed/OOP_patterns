package abstractFactory;

import abstractFactory.dwarfsAttackTeam.DwarfsAttackTeamFactory;

public class EreborAttack {
    public static void main(String[] args) {
        AttackTeamFactory attackTeamFactory = new DwarfsAttackTeamFactory();
        Leader leader = attackTeamFactory.getLeader();
        Scout scout = attackTeamFactory.getScout();
        Warrior warrior = attackTeamFactory.getWarior();

        System.out.println("Creating dwarfs attack team...");
        leader.PlanAttack();
        scout.SpotEnemy();
        warrior.Attack();
    }
}
