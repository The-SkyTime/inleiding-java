package h06;

import java.applet.*;
import java.awt.*;

public class opdr2 extends Applet {

    int sec,min,uur,dag,jaar;

    public void init() {
        sec = 1;
        min = sec *60;
        uur = min * 60;
        dag = uur * 24;
        jaar = dag * 365;
    }

    public void paint(Graphics g) {
        // Seconden
        g.drawString("Seconden in een uur = " + uur ,10,10);
        g.drawString("Seconden in een dag = " + dag ,10,25);
        g.drawString("Seconden in een jaar = " + jaar ,10,40);
    }
}
