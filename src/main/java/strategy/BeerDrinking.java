package strategy;

import state.Activity;

public class BeerDrinking implements Activity {
    @Override
    public void justDoIt() {
        System.out.println("Just beer drinking...");
    }
}
