package simpleFactory;

public class ArcherDwarf implements Dwarf{

    @Override
    public void attack() {
        System.out.println("The dwarf fired a bow");
    }
}
