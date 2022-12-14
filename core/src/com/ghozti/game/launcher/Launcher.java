package com.ghozti.game.launcher;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.ghozti.game.backend.entities.player.Player;

public class Launcher implements Screen {

    Batch batch;
    Texture texture;
    OrthographicCamera cam;
    Viewport viewPort;
    Sprite mapSprite;
    float rotationSpeed;

    Player player;

    @Override
    public void show() {
        batch = new SpriteBatch();
        texture = new Texture("badlogic.jpg");
        mapSprite = new Sprite(new Texture(Gdx.files.internal("testMap.png")));
        mapSprite.setPosition(0, 0);
        mapSprite.setSize(374, 328);
        cam = new OrthographicCamera();
        viewPort = new StretchViewport(374,328,cam);

        player = new Player(new Texture(Gdx.files.internal("playerStand.png")), 60,60,64,64,batch);
        player.setGameAttributes(100,1.5f,null,null);
        Gdx.input.setInputProcessor(player);
    }

    public void update(){
        //handleInput();
        player.update();

    }

    //private void handleInput() {
    //    if (Gdx.input.isKeyPressed(Input.Keys.W)){
    //        cam.position.y += 5;
    //    }
    //    if (Gdx.input.isKeyPressed(Input.Keys.A)){
    //        cam.position.x -= 5;
    //    }
    //    if (Gdx.input.isKeyPressed(Input.Keys.S)){
    //        cam.position.y -= 5;
    //    }
    //    if (Gdx.input.isKeyPressed(Input.Keys.D)){
    //        cam.position.x += 5;
    //    }
    //    cam.update();
    //}

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update();
        batch.setProjectionMatrix(cam.combined);

        batch.begin();
        mapSprite.draw(batch);
        player.draw();
        batch.end();
    }

    @Override
    public void resize(int width, int height) {
        viewPort.update(width,height,true);//tells the viewport to update accordingly
        batch.setProjectionMatrix(cam.combined);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
