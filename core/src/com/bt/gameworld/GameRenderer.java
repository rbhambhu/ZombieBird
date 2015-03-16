package com.bt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class GameRenderer {

    // Reference to the updated world.
    private GameWorld myWorld;
    // Orthographic camera, converts 3D scene to 2D
    private OrthographicCamera cam;

    public GameRenderer(GameWorld world) {
        myWorld = world;

        cam = new OrthographicCamera();
        // Args: Orthographic projection, Width, Height. This is the size of the game world.
        cam.setToOrtho(true, 136, 204);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");

        // Draw a black background to prevent flickering.
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


    }
}
