package data;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Maploader {

   static File file;

    public static void load() {


        try {
            file = new File("data/mapdata.txt");
            Scanner sc = new Scanner(file);

            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();
            String s4 = sc.nextLine();
            String s5 = sc.nextLine();

            String[] ss1 = s1.split(",");
            String[] ss2 = s2.split(",");
            String[] ss3 = s3.split(",");
            String[] ss4 = s4.split(",");
            String[] ss5 = s5.split(",");


            Map.kachelnX = Integer.parseInt(ss1[0]) - 1;
            Map.kachelnY = Integer.parseInt(ss1[1]) - 1;
            Map.kachelGroesse = Integer.parseInt(ss1[2]);

            Map.load();

            for (int i = 0; i < ss2.length - 1; i++) {
                Map.collision.add(new Point(Integer.parseInt(ss2[i]), Integer.parseInt(ss2[i + 1])));
            }

            int temp2 = 0;
            for (int x = 0; x < Map.kachelnX + 1; x++) {
                for (int y = 0; y < Map.kachelnY + 1; y++) {
                    Map.layer1[x][y] = Integer.parseInt(ss3[temp2]);
                    Map.layer2[x][y] = Integer.parseInt(ss4[temp2]);
                    Map.layer3[x][y] = Integer.parseInt(ss5[temp2]);
                    temp2++;

                }
            }


            sc.close();
            System.out.println("loaded...");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
