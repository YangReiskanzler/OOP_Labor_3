import processing.core.PApplet;

import java.awt.event.MouseEvent;

public class Fenster extends PApplet {
    RoundDrawableObject[] drawableObject = new Seifenblase[]{new Seifenblase(this, 100, 100, 50, 14, 14, 4)};
    RoundDrawableObject[] drawableObject1 = new Dornenball[]{new Dornenball(this, 300, 300, 150, 10,10, 3,200,20)};
    @Override
    public void settings() {
        size(800, 800);
    }

    @Override
    public void draw() {
        background(100);
        drawableObject[0].male();
        drawableObject[0].move(0.5f);
        drawableObject1[0].male();

    }
    public void mousePressed(MouseEvent event) {
        event.getX();
        event.getY();
    }
}


