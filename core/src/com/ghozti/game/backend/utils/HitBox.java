package com.ghozti.game.backend.utils;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import org.w3c.dom.Text;

public class HitBox {

    Rectangle hitboxGeometry;
    Texture texture;
    Vector2 hitboxPositions;
    float width, height;
    Batch batch;

    public HitBox(Rectangle rectangle, Vector2 hitboxPositions, float width, float height, SpriteBatch batch){
        this.hitboxGeometry = rectangle;
        this.hitboxPositions = hitboxPositions;
        this.texture = new Texture(Gdx.files.internal("hitbox.png"));
        this.width = width;
        this.height = height;
        this.batch = batch;
    }

    public void draw(SpriteBatch batch){
        batch.draw(texture,hitboxPositions.x, hitboxPositions.y, width, height);
    }

    public boolean isTriggered(Rectangle otherHitbox){
        return hitboxGeometry.overlaps(otherHitbox);
    }

    public Rectangle getHitboxGeometry() {
        return hitboxGeometry;
    }

    public Texture getTexture() {
        return texture;
    }

    public Vector2 getHitboxPositions() {
        return hitboxPositions;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public Batch getBatch() {
        return batch;
    }

    public void setHitboxGeometry(Rectangle hitboxGeometry) {
        this.hitboxGeometry = hitboxGeometry;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public void setHitboxPositions(Vector2 hitboxPositions) {
        this.hitboxPositions = hitboxPositions;
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
}
