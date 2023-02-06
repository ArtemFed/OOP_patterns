package prototype;

public class ArmyMaker {
    public static void main(String[] args) {
        Warrior source = new Warrior(1, "Sword");

        System.out.println("Source = " + source);

        WarriorsFactory warriorsFactory = new WarriorsFactory(source);
        System.out.println("Copy = " + warriorsFactory.warrior);
    }
}
