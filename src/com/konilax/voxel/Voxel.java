package com.konilax.voxel;

import com.nishu.utils.GameLoop;
import com.nishu.utils.Screen;
import com.nishu.utils.Window;

public class Voxel extends Screen {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "Voxel Engine";

    private GameLoop gameLoop;

    public Voxel() {
        gameLoop = new GameLoop();
        gameLoop.setScreen(this);
        gameLoop.setDebugMode(true);
        gameLoop.start(60);
    }

    public void init() {

    }

    public void initGL() {

    }

    public void update() {

    }

    public void render() {

    }

    public void dispose() {

    }

    public static void main(String[] args) {
        Window.createWindow(WIDTH, HEIGHT, TITLE, false);
        new Voxel();
    }

}
