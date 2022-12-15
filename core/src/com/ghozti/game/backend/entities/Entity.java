package com.ghozti.game.backend.entities;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

    Texture texture;//change to textureRegion
    Rectangle hitbox;
    Vector2 position;

    public Entity(Texture texture, float startX, float startY){
        this.texture = texture;
        position = new Vector2(startX,startY);
    }

    public Texture getTexture(){
        return texture;
    }

    public float getX(){
        return position.x;
    }

    public float getY(){
        return position.y;
    }

    public Vector2 getPositionVector(){
        return position;
    }

    public void setTexture(Texture texture){
        this.texture = texture;
    }

    public void addToPosition(float x, float y){
        position.add(x,y);
    }

    public void teleport(float x, float y){
        position.set(x,y);
    }
}
