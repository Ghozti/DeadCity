package com.ghozti.game.backend.entities;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import org.w3c.dom.css.Rect;

public abstract class Entity {

    //attributes
    Texture texture;//change to textureRegion
    Vector2 position;
    float width, height;
    Batch batch;

    //game attributes
    float health;
    float movementSpeed;
    Rectangle bodyHitbox;
    Rectangle headHitbox;

    public Entity(Texture texture, float startX, float startY, float width, float height, Batch batch){
        this.texture = texture;
        position = new Vector2(startX,startY);
        this.width = width;
        this.height = height;
        this.batch = batch;
    }

    public void setGameAttributes(float health,float movementSpeed, Rectangle bodyHitbox, Rectangle headHitbox){
        this.health = health;
        this.movementSpeed = movementSpeed;
        this.bodyHitbox = bodyHitbox;
        this.headHitbox = headHitbox;
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

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public float getHealth() {
        return health;
    }

    public float getMovementSpeed() {
        return movementSpeed;
    }

    public Rectangle getBodyHitbox() {
        return bodyHitbox;
    }

    public Rectangle getHeadHitbox() {
        return headHitbox;
    }

    public void setTexture(Texture texture){
        this.texture = texture;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBatch(Batch batch) {
        this.batch = batch;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setMovementSpeed(float movementSpeed) {
        this.movementSpeed = movementSpeed;
    }

    public void setBodyHitbox(Rectangle bodyHitbox) {
        this.bodyHitbox = bodyHitbox;
    }

    public void setHeadHitbox(Rectangle headHitbox) {
        this.headHitbox = headHitbox;
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
