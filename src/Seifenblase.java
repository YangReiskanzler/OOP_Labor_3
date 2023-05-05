import processing.core.PApplet;

public class Seifenblase extends RoundDrawableObject {
    boolean zerplatzen = false;

    Seifenblase(PApplet iwindow, float ixpos, float iypos, float idiameter, float ispeedX, float ispeedY, int icolor) {
        super(iwindow, ixpos, iypos, idiameter, ispeedX, ispeedY, icolor);
    }

    @Override
    public void collision(RoundDrawableObject other) {
        if(diameter/2 + 35 <= diameter/2 + 50 ) {
           zerplatzen = true;
        } else {
            zerplatzen = false;
        }
    }

    @Override
    public int move(float t) {
        speedY = speedY + g * t;
        xpos = xpos + speedX * t;
        ypos = ypos + speedY * t;
        if (ypos > window.height - diameter / 2 || ypos < 0 + diameter / 2 || xpos > window.width - diameter / 2 || xpos < 0 + diameter / 2) {
            zerplatzen = true;
        } else {
            zerplatzen = false;
        }
        if (zerplatzen == true) {
            return 0;
        } else {
            return 1;
        }
    }

    @Override
    public void male() {
        if (zerplatzen == false) {
            window.circle((float) xpos, (float) ypos, (float) diameter);
        }
    }
}
