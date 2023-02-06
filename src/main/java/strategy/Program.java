package strategy;

import state.BeerDrinking;
import state.ElfFighting;
import state.Mining;
import state.Sleeping;

public class Program {
    public static void main(String[] args) {
        Dwarf dwarf = new Dwarf();

        dwarf.setActivity(new Sleeping());
        dwarf.executeActivity();

        dwarf.setActivity(new Mining());
        dwarf.executeActivity();

        dwarf.setActivity(new ElfFighting());
        dwarf.executeActivity();

        dwarf.setActivity(new BeerDrinking());
        dwarf.executeActivity();

        dwarf.setActivity(new strategy.Sleeping());
        dwarf.executeActivity();
    }
}
