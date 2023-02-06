package strategy;

import state.Activity;

public class ElfFighting implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just Elf fighting...");
    }
}
