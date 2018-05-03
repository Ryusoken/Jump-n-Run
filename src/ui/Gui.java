package ui;

import actions.KeyHandler;
import draw.Draw;

import javax.swing.*;

public class Gui {

    JFrame frame;

    Draw d;

    public static int width = 1280, height = 720;

    public void create() {
        frame = new JFrame("Jump n Run");
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.addKeyListener(new KeyHandler());
        frame.requestFocus();

        d = new Draw();
        d.setBounds(0, 0, width, height);
        d.setVisible(true);
        frame.add(d);

        frame.setVisible(true);


    }

}
