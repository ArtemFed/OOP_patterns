package abstractFactory;

public interface AttackTeamFactory {
    Leader getLeader();
    Scout getScout();
    Warrior getWarior();
}
