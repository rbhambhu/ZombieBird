package com.bt.gameworld;

import com.badlogic.gdx.Gdx;
import com.bt.gameobjects.Bird;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class GameWorld {

    private Bird bird;

    public GameWorld(int midPontY) {
        // Initialize the bird here.
        bird = new Bird(33, midPontY - 5, 17, 12);
    }

    public void update(float delta) {
        bird.update(delta);
    }

    public Bird getBird() {
        return bird;
    }

}
