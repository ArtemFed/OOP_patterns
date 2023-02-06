package state;

public class Dwarf {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }
    public void changeActivity() {
        if (activity instanceof Sleeping) {
            setActivity(new Mining());
        } else if (activity instanceof Mining) {
            setActivity(new ElfFighting());
        } else if (activity instanceof ElfFighting) {
            setActivity(new BeerDrinking());
        } else if (activity instanceof BeerDrinking) {
            setActivity(new Sleeping());
        }
    }

    public void executeActivity() {
        activity.justDoIt();
    }
}
