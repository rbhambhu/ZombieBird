package com.bt.gameobjects;

import java.util.Random;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class Pipe extends Scrollable {

    private Random r;

    public Pipe(float x, float y, int width, int height, float scrollspeed) {
        super(x, y, width, height, scrollspeed);
        r = new Random();
    }

    @Override
    public void reset(float newX) {
        super.reset(newX);
        // Change the height to a random number
        height = r.nextInt(90) + 15;
    }
}
