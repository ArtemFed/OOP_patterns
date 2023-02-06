package simpleFactory;

public class MeleeDwarf implements Dwarf{

    @Override
    public void attack() {
        System.out.println("The dwarf hit with an axe");
    }
}
