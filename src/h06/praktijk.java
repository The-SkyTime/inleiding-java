package h06;

import java.applet.*;
import java.awt.*;

public class praktijk extends Applet {

    double cijf1,cijf2,cijf3;
    double cijftot;

    public void init() {
        cijf1 = 5.9;
        cijf2 = 6.3;
        cijf3 = 6.9;
        cijftot = (cijf1 + cijf2 + cijf3) / 3 ;
    }


    public void paint(Graphics g) {
        g.drawString("" + cijftot,10,10);
    }
}
