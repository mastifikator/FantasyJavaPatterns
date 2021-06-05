package Flyweight;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Battle extends JFrame {
    private List<Orc> orcs = new ArrayList<>();

    public void bornOrc(int x, int y, String name, Color color, String otherOrcData){
        OrcType orcType = OrcFactory.getOrcType(name, color, otherOrcData);
        Orc orc = new Orc(x,y,orcType);
        orcs.add(orc);
    }

    @Override
    public void paint(Graphics g) {
        for (Orc orc : orcs){
            orc.draw(g);
        }
    }
}
