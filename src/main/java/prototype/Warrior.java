package prototype;

public class Warrior implements Copyable {
    private int level;
    private String weapon;

    public Warrior(int level, String weapon) {
        this.level = level;
        this.weapon = weapon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public Object copy() {
        Warrior copy = new Warrior(level, weapon);
        return copy;
    }

    @Override
    public String toString() {
        return "Warrior {level=" + level + ", weapon=" + weapon + "}";
    }
}
