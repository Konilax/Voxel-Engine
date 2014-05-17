package com.konilax.voxel;

import com.nishu.utils.GameLoop;
import com.nishu.utils.Screen;
import com.nishu.utils.Window;
import org.lwjgl.opengl.Display;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.util.glu.GLU.gluPerspective;

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
        glViewport(0, 0, Display.getWidth(), Display.getHeight());
        glMatrixMode(GL_PROJECTION);
        glLoadIdentity();

        gluPerspective(67.0f, WIDTH / HEIGHT, 0.001f, 1000f);
        glMatrixMode(GL_MODELVIEW);
    }

    public void update() {

    }

    public void render() {
        glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
        glClearColor(0, 0, 0.75f, 1);
    }

    public void dispose() {

    }

    public static void main(String[] args) {
        Window.createWindow(WIDTH, HEIGHT, TITLE, false);
        new Voxel();
    }

}
