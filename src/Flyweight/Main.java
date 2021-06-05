package Flyweight;

import java.awt.*;

public class Main {
    static final int CANVAS_SIZE = 1000;
    static final int ORC_TO_BORN = 1_000_000;
    static final int ORC_TYPES = 6;

    public static void main(String[] args) {
        Battle battle = new Battle();
        for (int i = 0; i < Math.floor(ORC_TO_BORN/ORC_TYPES); i++) {
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Green Orc", Color.GREEN, "Texture");
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Yellow Orc", Color.YELLOW, "Texture");
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "White Orc", Color.WHITE, "Texture");
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Pink Orc", Color.PINK, "Texture");
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Red Orc", Color.RED, "Texture");
            battle.bornOrc(random(0, CANVAS_SIZE), random(0, CANVAS_SIZE), "Black Orc", Color.BLACK, "Texture");
        }
        battle.setSize(CANVAS_SIZE, CANVAS_SIZE);
        battle.setVisible(true);


        System.out.println(ORC_TO_BORN + " orc drawn");
        System.out.println("---------------------");
        System.out.println("Memory usage:");
        System.out.println("Orc size (8 bytes) * " + ORC_TO_BORN);
        System.out.println("+ OrcTypes size (~30 bytes) * " + ORC_TYPES + "");
        System.out.println("---------------------");
        System.out.println("Total: " + ((ORC_TO_BORN * 8 + ORC_TYPES * 30) / 1024 / 1024) +
                "MB (instead of " + ((ORC_TO_BORN * 38) / 1024 / 1024) + "MB)");

    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
