package com.bt.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.bt.gameobjects.Bird;
import com.bt.gameobjects.ScrollHandler;
import com.bt.zbhelpers.AssetLoader;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class GameWorld {

    private Bird bird;

    private ScrollHandler scroller;

    private Rectangle ground;

    public GameWorld(int midPointY) {
        // Initialize the bird here.
        bird = new Bird(33, midPointY - 5, 17, 12);

        scroller = new ScrollHandler(midPointY + 66);

        ground = new Rectangle(0, midPointY + 66, 136, 11);
    }

    public void update(float delta) {
        // Add a delta cap so that if our game takes too long
        // to update, we will not break our collision detection.

        if (delta > .15f) {
            delta = .15f;
        }

        bird.update(delta);
        scroller.update(delta);

        if (scroller.collides(bird) && bird.isAlive()) {
            scroller.stop();
            bird.die();
            AssetLoader.dead.play();
        }

        if (Intersector.overlaps(bird.getBoundingCircle(), ground)) {
            scroller.stop();
            bird.die();
            bird.decelerate();
        }
    }

    public Bird getBird() {

        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }

}
