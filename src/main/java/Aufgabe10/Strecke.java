package Aufgabe10;

import java.awt.*;

public class Strecke implements GeoObjekt {
    private Punkt p1, p2;

    Strecke(Punkt p1, Punkt p2) {
        this.p1 = p1;
        this.p2 = p2;

    }

    @Override
    public void drehen(double phi) {
        p1.drehen(phi);
        p2.drehen(phi);
    }

    @Override
    public void zeichnen(Graphics g, int xNull, int yNull) {

        g.drawLine(xNull + p1.getX(),
                yNull + p1.getY(),
                xNull + p2.getX(),
                yNull + p2.getY());
    }
}
