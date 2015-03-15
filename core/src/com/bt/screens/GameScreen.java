package com.bt.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class GameScreen implements Screen{

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
    }

    @Override
    public void render(float delta) {
        // Sets a color to fill the screen with.
        // (RGB = 10, 15, 230), Opacity of 1 (100%).
        Gdx.gl.glClearColor(10/255.0f, 15/255.0f, 230/255.0f, 1f);
        // Fills the screen with the selected color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "Resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "Show Called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "Hide Called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "Pause Called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "Resume Called");
    }

    @Override
    public void dispose() {
        // Leave blank.
    }
}
