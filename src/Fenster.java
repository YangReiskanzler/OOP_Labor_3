import processing.core.PApplet;

import java.awt.event.MouseEvent;

public class Fenster extends PApplet {
    RoundDrawableObject[] drawableObject = new Seifenblase[]{new Seifenblase(this, 100, 100, 50, 14, 14, 4)};
    RoundDrawableObject[] drawableObject1 = new Dornenball[5];
    @Override
    public void settings() {

        size(800, 800);
        Random rnd = new Random();
        for (int x = 0; x  < drawableObject1.length; x++) {
            drawableObject1[x] = new Dornenball(this, 300, 300, 70, 10,10, 3,100,20);
        }
    }
    @Override
    public void draw() {
        background(100);
        fill(200,50,50);
        drawableObject[0].male();
        drawableObject[0].move(0.5f);
        fill(90);
        for (int x = 0; x  < drawableObject1.length; x++) {
            drawableObject1[x].male();
        }

    }
    public void mousePressed(MouseEvent event) {
        event.getX();
        event.getY();
    }

    private class Random {
    }
}


