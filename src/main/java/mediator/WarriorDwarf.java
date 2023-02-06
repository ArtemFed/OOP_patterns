package mediator;

public class WarriorDwarf implements Dwarf {
    Raven raven;
    String name;

    public WarriorDwarf(Raven raven, String name) {
        this.raven = raven;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void sendMessage(String message) {
        raven.sendMessage(message, this);
    }

    @Override
    public void getMessage(String message) {
        System.out.println(name + " received message: " + message);
    }
}
