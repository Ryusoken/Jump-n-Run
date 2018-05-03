package draw;

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

        //Draw code


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
