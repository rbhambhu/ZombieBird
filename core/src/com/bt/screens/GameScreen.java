package com.bt.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.bt.gameworld.GameWorld;
import com.bt.gameworld.GameRenderer;

public class GameScreen implements Screen{

    private GameWorld world;
    private GameRenderer renderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
        // Initialize world.
        world = new GameWorld();
        // Initialize renderer.
        renderer = new GameRenderer(world);
    }

    @Override
    public void render(float delta) {
        // GAME LOOP
        // The following is so the GameScreen doesn't have to do all the rendering itself.

        // GameWorld updates. Passing delta into update to perform frame-rate independent movement.
        world.update(delta);
        // GameRenderer renders.
        renderer.render();
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
