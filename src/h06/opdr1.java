package h06;

import java.applet.Applet;
import java.awt.*;

public class opdr1 extends Applet{
    double tot, play;
    double uit;

    public void init() {
        tot = 113;
        play = 4;
        uit = tot/play;

    }


    public void paint(Graphics g) {
        // Berekening geld
        g.drawString("Uitkomst = " + uit, 10, 10);

    }
}