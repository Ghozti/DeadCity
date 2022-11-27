package com.ghozti.game.launcher;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Circle;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import org.w3c.dom.Text;

public class Launcher implements Screen {

    Batch batch;
    Texture texture;
    OrthographicCamera cam;
    Viewport viewPort;
    Sprite mapSprite;
    float rotationSpeed;

    @Override
    public void show() {
        batch = new SpriteBatch();
        texture = new Texture("badlogic.jpg");
        mapSprite = new Sprite(new Texture(Gdx.files.internal("testMap.png")));
        mapSprite.setPosition(0, 0);
        mapSprite.setSize(374, 328);
        cam = new OrthographicCamera();
        viewPort = new StretchViewport(25,25,cam);
    }

    public void update(){
        handleInput();
    }

    private void handleInput() {
        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            cam.position.y += 10;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            cam.position.x -= 10;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)){
            cam.position.y -= 10;
        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            cam.position.x += 10;
        }
        cam.update();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        update();
        batch.begin();
        batch.setProjectionMatrix(cam.combined);
        mapSprite.draw(batch);
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
