package com.ghozti.game.backend.entities.player;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.ghozti.game.backend.entities.Entity;

public class Player extends Entity implements InputProcessor {

    public Player(Texture texture, float startX, float startY, float width, float height, Batch batch) {
        super(texture, startX, startY, width, height, batch);
    }

    @Override
    public void update(){
        if (moveUp){
            addToPosition(0,movementSpeed);
        }else if (moveDown){
            addToPosition(0,-movementSpeed);
        }
        if (moveLeft){
            addToPosition(-movementSpeed,0);
        }else if (moveRight){
            addToPosition(movementSpeed,0);
        }
        if(!moveUp && !moveDown && !moveLeft && !moveRight){
            addToPosition(0,0);
        }
    }

    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.W){
            //state = "U";
            moveUp = true;
        }
        if (keycode == Input.Keys.A){
            //state = "L";
            moveLeft = true;
        }
        if (keycode == Input.Keys.S){
            //state = "D";
            moveDown = true;
        }
        if (keycode == Input.Keys.D){
            //state = "R";
            moveRight = true;
        }
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        if (keycode == Input.Keys.W){
            moveUp = false;
        }
        if (keycode == Input.Keys.A){
            moveLeft = false;
        }
        if (keycode == Input.Keys.S){
            moveDown = false;
        }
        if (keycode == Input.Keys.D){
            moveRight = false;
        }
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
