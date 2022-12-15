package com.ghozti.game.backend.entities;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;

public abstract class Entity {

    Texture texture;//change to textureRegion
    Vector2 position;
    float width, height;
    Batch batch;

    public Entity(Texture texture, float startX, float startY, float width, float height, Batch batch){
        this.texture = texture;
        position = new Vector2(startX,startY);
        this.width = width;
        this.height = height;
        this.batch = batch;
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

    public Batch getBatch(){
        return batch;
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

    public void draw(){
        batch.draw(texture,position.x,position.y);
    }
}
