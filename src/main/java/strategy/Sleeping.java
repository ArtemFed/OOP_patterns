package strategy;

import state.Activity;

public class Sleeping implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just sleeping...");
    }
}
