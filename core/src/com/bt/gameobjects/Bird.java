package com.bt.gameobjects;

import com.badlogic.gdx.math.Vector2;

/**
 * Created by Xavie_000 on 3/16/2015.
 */
public class Bird {
    private Vector2 position;
    private Vector2 velocity;
    private Vector2 acceleration;

    private float rotation;
    private int width;
    private int height;

    public Bird(float x, float y, int width, int height) {
        this.width = width;
        this.height = height;
        position = new Vector2(x, y);
        velocity = new Vector2(0, 0);
        acceleration = new Vector2(0, 460);
    }

    public void update(float delta) {

        /*
         * So, what is this actually doing?
         * We multiply acceleration and velocity vectors by delta which is the amount of time that
         * has passed since the update method was previously called. This will normalize our
         * movement. We scale the vectors with delta to achieve frame-rate independent movement.
         */

        // Simulates gravity, add scaled acceleration to velocity.
        velocity.add(acceleration.cpy().scl(delta));

        // Max velocity cap.
        if(velocity.y > 200) {
            velocity.y = 200;
        }

        // Add scaled velocity to position.
        position.add(velocity.cpy().scl(delta));
    }

    public void onClick() {
        velocity.y = -140;
    }

    public float getX() {
        return position.x;
    }

    public float getY() {
        return position.y;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getRotation() {
        return rotation;
    }
}
