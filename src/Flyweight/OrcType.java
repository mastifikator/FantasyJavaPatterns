package Flyweight;

import java.awt.*;

public class OrcType {
    //Это легковес в который выделены тяжелые части объекта Орк
    private String name;
    private Color color;
    private String otherOrcData;

    public OrcType(String name, Color color, String otherOrcData) {
        this.name = name;
        this.color = color;
        this.otherOrcData = otherOrcData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x - 4, y, 8, 15);
        g.fillOval(x - 5, y - 10, 10, 10);
        g.fillRect(x + 1, y, 10, 2);
        g.fillRect(x - 11, y, 10, 2);
        g.fillRect(x - 3, y + 13, 2, 13);
        g.fillRect(x + 2, y + 13, 2, 13);
    }
}
