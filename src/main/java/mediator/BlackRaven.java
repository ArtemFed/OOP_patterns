package mediator;

import java.util.ArrayList;
import java.util.List;

public class BlackRaven implements Raven {
    Dwarf king;
    List<Dwarf> dwarfs = new ArrayList<>();

    public void setKing(Dwarf dwarf) {
        king = dwarf;
    }

    public void addDwarfToRaven(Dwarf dwarf) {
        dwarfs.add(dwarf);
    }

    @Override
    public void sendMessage(String message, Dwarf dwarf) {
        for (Dwarf gnome : dwarfs) {
            if (gnome != dwarf) {
                gnome.getMessage(message);
            }
        }
        king.getMessage(message);
    }
}
