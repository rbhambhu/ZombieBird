package com.bt.gameworld;

import com.badlogic.gdx.Gdx;
import com.bt.gameobjects.Bird;
import com.bt.gameobjects.ScrollHandler;
import com.bt.zbhelpers.AssetLoader;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class GameWorld {

    private Bird bird;

    private ScrollHandler scroller;

    private boolean isAlive = true;

    public GameWorld(int midPointY) {
        // Initialize the bird here.
        bird = new Bird(33, midPointY - 5, 17, 12);

        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {

        bird.update(delta);
        scroller.update(delta);

        if(isAlive && scroller.collides(bird)) {
            // Clean up on game over
            AssetLoader.dead.play();
            scroller.stop();
            isAlive = false;
        }
    }

    public Bird getBird() {

        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }

}
