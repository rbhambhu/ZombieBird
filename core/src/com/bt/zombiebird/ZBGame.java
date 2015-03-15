package com.bt.zombiebird;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.bt.screens.GameScreen;

// Game is an abstract class that partially implements ApplicationListener Interface for android.
// Game doesn't implement the create() method, we must do that here. This becomes an
// application listener object then.
public class ZBGame extends Game {

    @Override
    public void create() {
        // Platform agnostic System.out.println()
        Gdx.app.log("ZBGame", "Created");
        // Method available via the interface
        setScreen(new GameScreen());
    }
}
