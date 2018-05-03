package actions;

import game.Movestates;
import game.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT || e.getKeyCode() == KeyEvent.VK_A) {
            Player.movestates = Movestates.LEFT;
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT || e.getKeyCode() == KeyEvent.VK_D) {
            Player.movestates = Movestates.RIGHT;
        } else {
            Player.movestates = Movestates.IDLE;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
