package abstractFactory.dwarfsAttackTeam;

import abstractFactory.Leader;
import abstractFactory.Scout;
import abstractFactory.AttackTeamFactory;
import abstractFactory.Warrior;

public class DwarfsAttackTeamFactory implements AttackTeamFactory {

    @Override
    public Leader getLeader() {
        return new LeaderDwarf();
    }

    @Override
    public Scout getScout() {
        return new ScoutDwarf();
    }

    @Override
    public Warrior getWarior() {
        return new WarriorDwarf();
    }
}
