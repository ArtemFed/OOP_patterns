package simpleFactory;

public class ArcherDwarfFactory implements DwarfFactory {

    @Override
    public Dwarf createDwarf() {
        return new ArcherDwarf();
    }
}


