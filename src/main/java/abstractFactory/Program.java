package abstractFactory;

import simpleFactory.ArcherDwarfFactory;
import simpleFactory.Dwarf;
import simpleFactory.DwarfFactory;
import simpleFactory.MeleeDwarfFactory;

public class Program {
    public static void main(String[] args) {
        DwarfFactory dwarfFactory1 = createDwarfFactoryBySpeciality("Archer");
        Dwarf dwarf1 = dwarfFactory1.createDwarf();

        dwarf1.attack();

        DwarfFactory dwarfFactory2 = createDwarfFactoryBySpeciality("Melee");
        Dwarf dwarf2 = dwarfFactory2.createDwarf();

        dwarf2.attack();
    }

    static DwarfFactory createDwarfFactoryBySpeciality(String speciality) {
        if (speciality.equalsIgnoreCase("archer")) {
            return new ArcherDwarfFactory();
        } else if (speciality.equalsIgnoreCase("melee")) {
            return new MeleeDwarfFactory();
        } else {
            throw new RuntimeException(speciality + " is unknown speciality");
        }
    }
}
