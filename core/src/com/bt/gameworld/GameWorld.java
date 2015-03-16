package com.bt.gameworld;

import com.badlogic.gdx.Gdx;
import com.bt.gameobjects.Bird;
import com.bt.gameobjects.ScrollHandler;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class GameWorld {

    private Bird bird;

    private ScrollHandler scroller;

    public GameWorld(int midPointY) {
        // Initialize the bird here.
        bird = new Bird(33, midPointY - 5, 17, 12);

        scroller = new ScrollHandler(midPointY + 66);
    }

    public void update(float delta) {

        bird.update(delta);
        scroller.update(delta);
    }

    public Bird getBird() {

        return bird;
    }

    public ScrollHandler getScroller() {
        return scroller;
    }

}
