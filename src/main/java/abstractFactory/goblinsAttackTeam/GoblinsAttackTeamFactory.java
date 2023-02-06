package abstractFactory.goblinsAttackTeam;

import abstractFactory.AttackTeamFactory;
import abstractFactory.Leader;
import abstractFactory.Scout;
import abstractFactory.Warrior;

public class GoblinsAttackTeamFactory implements AttackTeamFactory {

    @Override
    public Leader getLeader() {
        return new LeaderGoblin();
    }

    @Override
    public Scout getScout() {
        return new ScoutGoblin();
    }

    @Override
    public Warrior getWarior() {
        return new WarriorGoblin();
    }
}
