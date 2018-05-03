package data;

import draw.IL;
import ui.Gui;

import java.awt.*;
import java.util.ArrayList;

public class Map {
    public static int x = 0, y = 0;
    public static Point backgroundPos[] = new Point[2];
    public static int kachelnX, kachelnY, kachelGroesse, kachelGroesseCurrent;
    public static ArrayList<Point> collision = new ArrayList<>();
    public static int[][] layer1, layer2, layer3;

    public static void load() {
        layer1 = new int[kachelnX + 1][kachelnY + 1];
        layer2 = new int[kachelnX + 1][kachelnY + 1];
        layer3 = new int[kachelnX + 1][kachelnY + 1];

        kachelGroesseCurrent = kachelGroesse * 2;
        y = Gui.height - (kachelnY * Map.kachelGroesseCurrent) - (int) (Map.kachelGroesseCurrent * 1.6) + 1;

        backgroundPos[0] = new Point(0,0);
        backgroundPos[1] = new Point(IL.bg.getWidth(),0);

    }

    public static int posXToCoord(int x) {
        return x * Map.kachelGroesseCurrent + Map.x;
    }

    public static int posYToCoord(int y) {
        return y * Map.kachelGroesseCurrent + Map.y;
    }


}
