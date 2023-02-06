package prototype;

public class WarriorsFactory {
    Warrior warrior;

    public WarriorsFactory(Warrior warrior) {
        this.warrior = warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    Warrior cloneWarrior() {
        return (Warrior) warrior.copy();
    }
}
