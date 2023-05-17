import processing.core.PApplet;

public class Seifenblase extends RoundDrawableObject {
    boolean zerplatzen = false;

    Seifenblase(PApplet iwindow, float ixpos, float iypos, float idiameter, float ispeedX, float ispeedY, int icolor) {
        super(iwindow, ixpos, iypos, idiameter, ispeedX, ispeedY, icolor);
    }

    @Override
    void collision(RoundDrawableObject other) {
        if (xpos - diameter / 2 < 0 ||
                xpos + diameter / 2 > window.width ||
                ypos - diameter / 2 < 0 ||
                ypos + diameter / 2 > window.height
        ) {
            zerplatzen = true;
        }
        if (other instanceof Dornenball && Math.sqrt(Math.pow(other.xpos - xpos, 2) + Math.pow(other.ypos - ypos, 2)) < (diameter + ((Dornenball) other).innerDiameter) / 2) {
            zerplatzen = true;
        }
    }




    @Override
    public int move(float t) {
        speedY = speedY + g * t;
        xpos = xpos + speedX * t;
        ypos = ypos + speedY * t;
        if (zerplatzen == true) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void male() {
        if (zerplatzen == false) {
            window.fill(color);
            window.circle((float) xpos, (float) ypos, (float) diameter);
        } else {
        }
    }

    public void pusten(float X, float Y) {
        if (Math.sqrt(Math.pow(X - xpos, 2) + Math.pow(Y - ypos, 2)) < diameter / 2) {
            diameter += 5;
        }
        if (Math.sqrt(Math.pow(X - xpos, 2) + Math.pow(Y - ypos, 2)) < 500) {
            if (X < xpos) {
                speedX += 2;
            }
            if (Y < ypos) {
                speedY += 2;
            }
            if (X > xpos) {
                speedX -= 2;
            }
            if (Y > ypos) {
                speedY -= 2;
            }
        }
    }
}


