package abstractFactory;

import abstractFactory.goblinsAttackTeam.GoblinsAttackTeamFactory;

public class MoriaAttack {
    public static void main(String[] args) {
        AttackTeamFactory attackTeamFactory = new GoblinsAttackTeamFactory();
        Leader leader = attackTeamFactory.getLeader();
        Scout scout = attackTeamFactory.getScout();
        Warrior warrior = attackTeamFactory.getWarior();

        System.out.println("Creating goblins attack team...");
        leader.PlanAttack();
        scout.SpotEnemy();
        warrior.Attack();
    }
}
