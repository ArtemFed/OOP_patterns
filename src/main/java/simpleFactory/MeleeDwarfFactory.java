package simpleFactory;

public class MeleeDwarfFactory implements DwarfFactory {

    @Override
    public Dwarf createDwarf() {
        return new MeleeDwarf();
    }
}
