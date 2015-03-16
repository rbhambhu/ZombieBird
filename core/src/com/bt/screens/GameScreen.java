package com.bt.screens;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.bt.gameworld.GameWorld;
import com.bt.gameworld.GameRenderer;
import com.bt.zbhelpers.InputHandler;

public class GameScreen implements Screen{

    private GameWorld world;
    private GameRenderer renderer;

    private float runTime = 0;

    public GameScreen() {

        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int)gameHeight, midPointY);

        Gdx.input.setInputProcessor(new InputHandler(world.getBird()));
    }

    @Override
    public void render(float delta) {
        // GAME LOOP

        runTime += delta;
        // GameWorld updates. Passing delta into update to perform frame-rate independent movement.
        world.update(delta);
        // GameRenderer renders.
        renderer.render(runTime);
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
