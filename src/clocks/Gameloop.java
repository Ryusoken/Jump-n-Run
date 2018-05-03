package clocks;

public class Gameloop implements Runnable{

    private boolean running = true;

    @Override
    public void run() {
        long lastTime = System.nanoTime();
        final double FPS = 60.0;
        double ns = 1000000000 / FPS;
        double deltaTime = 0;

        while(running){

            long currentTime = System.nanoTime();
            deltaTime += (currentTime - lastTime) / ns;
            lastTime = currentTime;

            if(deltaTime >= 1){
                update();
                deltaTime --;
            }

        }

    }

    public void update(){

    }
}
