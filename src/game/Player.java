package game;

import data.Map;

public class Player {
    public static Movestates movestates = Movestates.IDLE;

    public static void move() {
        switch (movestates) {
            case RIGHT:
                Map.x -= 4;
                break;
            case LEFT:
                Map.x += 4;
                break;
        }
        switch (movestates){
            case JUMP: Map.y -= 4;
                break;
            case FALL: Map.y += 4;
                break;
        }
    }
}
