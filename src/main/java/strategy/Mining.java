package strategy;

import state.Activity;

public class Mining implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just mining...");
    }
}
