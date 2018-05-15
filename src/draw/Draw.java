package draw;

import data.Map;
import ui.Gui;

import javax.swing.*;
import java.awt.*;

public class Draw extends JLabel {
    //FPS Variables
    private int frames, lastFrames;
    private long timer = System.currentTimeMillis();

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_OFF);

        //Draw Background
        g.drawImage(IL.bg, Map.backgroundPos[0].x, Map.backgroundPos[0].y, Gui.width, Gui.height, null);

        //Draw Map
        for (int x = 0; x < Map.layer1.length; x++) {
            for (int y = 0; y < Map.layer1[x].length; y++) {
                if (Map.layer1[x][y] > 0) {
                    g.drawImage(IL.texture[Map.layer1[x][y] - 1], Map.posXToCoord(x), Map.posYToCoord(y),
                            Map.kachelGroesseCurrent, Map.kachelGroesseCurrent, null);
                }
            }
        }

        for (int x = 0; x < Map.layer2.length; x++) {
            for (int y = 0; y < Map.layer2[x].length; y++) {
                if (Map.layer2[x][y] > 0) {
                    g.drawImage(IL.texture[Map.layer2[x][y] - 1], Map.posXToCoord(x), Map.posYToCoord(y),
                            Map.kachelGroesseCurrent, Map.kachelGroesseCurrent, null);
                }
            }
        }

        for (int x = 0; x < Map.layer3.length; x++) {
            for (int y = 0; y < Map.layer3[x].length; y++) {
                if (Map.layer3[x][y] > 0) {
                    g.drawImage(IL.texture[Map.layer3[x][y] - 1], Map.posXToCoord(x), Map.posYToCoord(y),
                            Map.kachelGroesseCurrent, Map.kachelGroesseCurrent, null);
                }
            }
        }

        //FPS Calculation
        g.setColor(Color.GRAY);
        g.setFont(new Font("Arial", Font.PLAIN, 10));
        frames++;
        if (System.currentTimeMillis() - timer > 500) {
            timer += 500;
            lastFrames = frames;
            frames = 0;
        }

        g.drawString(String.valueOf(lastFrames * 2), 5, 10);


        repaint();
    }

}
