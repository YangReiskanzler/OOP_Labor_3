import processing.core.PApplet;
import processing.event.MouseEvent;

public class Fenster extends PApplet {
    RoundDrawableObject[] drawableObject = new RoundDrawableObject[5];
    int Punkte;

    @Override
    public void settings() {
        size(800, 800);
        drawableObject[0] = new Seifenblase(this, 400, 400, 50, 3, 0, 255);
        for (int x = 1; x < drawableObject.length; x++) {
            drawableObject[x] = new Dornenball(this, random(50, 750), random(50, 750),  70, 10, 10, 3, 100, 20);
        }
    }

    @Override
    public void draw() {
        background(100);
        drawableObject[0].male();
        drawableObject[0].move(0.5f);
        for (int x = 0; x < drawableObject.length; x++) {
            drawableObject[x].male();
            for (int y = 0; y < drawableObject.length; y++) {
                drawableObject[x].collision(drawableObject[y]);
            }
        }
        Punkte = Punkte + drawableObject[0].move(0.5f);
        textSize(25);
        text("Punkte: " + Punkte, 10, 30);
    }

    @Override
    public void mousePressed(MouseEvent event) {
        for (int i = 0; i < drawableObject.length; i++) {
            if (drawableObject[i] instanceof Seifenblase)
                ((Seifenblase) drawableObject[i]).pusten(event.getX(), event.getY());
        }
    }
}

