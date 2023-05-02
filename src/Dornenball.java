import processing.core.PApplet;

public class Dornenball extends RoundDrawableObject {
    public float innerDiameter;
    public int anzDornen;

    Dornenball(PApplet iwindow, float ixpos, float iypos, float idiameter, float ispeedX, float ispeedY, int icolor, float iinnerDiameter, int ianzDornen) {
        super(iwindow, ixpos, iypos, idiameter, ispeedX, ispeedY, icolor);
        innerDiameter = iinnerDiameter;
        anzDornen = ianzDornen;
    }


    @Override
    void collision(RoundDrawableObject other) {

    }

    @Override
    int move(float t) {
        return 0;
    }

    @Override
    void male() {
        window.circle((float) xpos, (float) ypos, (float) diameter);
        window.beginShape();
        for (int i = 0; i <= anzDornen; i++) {
            window.vertex((float) ((Math.sin(i * 2 * Math.PI / anzDornen) * diameter / 2) + xpos),
                    (float) ((Math.cos(i * 2 * Math.PI / anzDornen) * diameter / 2) + ypos));
            window.vertex((float) ((Math.sin((i + .5) * 2 * Math.PI / anzDornen) * innerDiameter / 2) + xpos),
                    (float) ((Math.cos((i + .5) * 2 * Math.PI / anzDornen) * innerDiameter / 2) + ypos));
        }
        window.endShape();
    }
}
