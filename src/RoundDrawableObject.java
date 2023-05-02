import processing.core.PApplet;

public abstract class RoundDrawableObject {
    public PApplet window;
    public float xpos;
    public float ypos;
    public float diameter;
    public float speedX;
    public float speedY;
    public int color;
    public float g;



    RoundDrawableObject(PApplet iwindow, float ixpos, float iypos, float idiameter, float ispeedX, float ispeedY, int icolor) {
        window= iwindow;
        xpos = ixpos;
        ypos = iypos;
        diameter = idiameter;
        speedX = ispeedX;
        speedY = ispeedY;
        color = icolor;

    }
    abstract void collision(RoundDrawableObject other);

    abstract int move(float t);

    abstract void male();

}