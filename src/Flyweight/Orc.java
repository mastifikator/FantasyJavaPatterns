package Flyweight;

import java.awt.*;

public class Orc {
    private int x;
    private int y;
    private OrcType type;

    public Orc(int x, int y, OrcType type){
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g){
        type.draw(g, x, y);
    }

}
