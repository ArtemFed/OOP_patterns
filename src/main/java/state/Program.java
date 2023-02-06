package state;

public class Program {
    public static void main(String[] args) {
        Activity activity = new Sleeping();
        Dwarf dwarf = new Dwarf();

        dwarf.setActivity(activity);

        for (int i = 0; i < 10; i++) {
            dwarf.executeActivity();
            dwarf.changeActivity();
        }
    }
}
