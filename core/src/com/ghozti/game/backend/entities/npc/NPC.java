package com.ghozti.game.backend.entities.npc;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.ghozti.game.backend.entities.Entity;

public class NPC extends Entity {

    public NPC(Texture texture, float startX, float startY, float width, float height, Batch batch) {
        super(texture, startX, startY, width, height, batch);
    }
}
