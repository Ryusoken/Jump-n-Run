package actions;

import data.Maploader;
import draw.IL;
import ui.Gui;

public class Main {

    public static void main(String[] args) {

        IL.load();
        Maploader.load();
        Gui g = new Gui();
        g.create();

    }

}
