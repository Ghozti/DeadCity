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

    }


}
