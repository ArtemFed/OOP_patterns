package strategy;

import state.Activity;

public class Dwarf {
    state.Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
