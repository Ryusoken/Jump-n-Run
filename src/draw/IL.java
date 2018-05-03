package draw;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IL {
    public static BufferedImage bg;
    public static BufferedImage[] texture;

    public static void load(){

        texture = new BufferedImage[2];
        for (int i = 0; i < texture.length; i++) {
            try {
                texture[i] = ImageIO.read(new FileInputStream(new File("rsc/textures/" + (i + 1) + ".png")));
                bg = ImageIO.read(new File("rsc/bg.png"));
            } catch (IOException e) {
                System.out.println("Tiles not found error");
            }
        }
    }
}
