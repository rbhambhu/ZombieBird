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
    private ShapeRenderer shapeRenderer;

    public GameRenderer(GameWorld world) {
        myWorld = world;

        cam = new OrthographicCamera();
        // Args: Orthographic projection, Width, Height. This is the size of the game world.
        cam.setToOrtho(true, 136, 204);

        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);
    }

    public void render() {
        Gdx.app.log("GameRenderer", "render");

        // Draw a black background to prevent flickering.
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        // Draw the filled rectangle.
        shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);

        // Chooses RGB color of 87, 109, 120 at full opacity.
        shapeRenderer.setColor(87 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the rectangle rom myWorld (Using ShapeType.Filled).
        shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y,
                myWorld.getRect().width, myWorld.getRect().height);

        // MUST be done every single time.
        shapeRenderer.end();

        // Draw the rectangle's outline.
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);

        shapeRenderer.setColor(155 / 255.0f, 109 / 255.0f, 120 / 255.0f, 1);

        // Draws the rectangle rom myWorld (Using ShapeType.Line).
        shapeRenderer.rect(myWorld.getRect().x, myWorld.getRect().y,
                myWorld.getRect().width, myWorld.getRect().height);

        shapeRenderer.end();
    }
}
