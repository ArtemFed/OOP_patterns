package mediator;

public class Program {
    public static void main(String[] args) {
        BlackRaven raven = new BlackRaven();

        Dwarf king = new KingDwarf(raven, "Mad King");
        Dwarf warrior1 = new WarriorDwarf(raven, "John");
        Dwarf warrior2 = new WarriorDwarf(raven, "Gimli");

        raven.setKing(king);
        raven.addDwarfToRaven(warrior1);
        raven.addDwarfToRaven(warrior2);

        warrior1.sendMessage("We've been attacked!");

        System.out.println();

        king.sendMessage("Good luck!");
    }
}
