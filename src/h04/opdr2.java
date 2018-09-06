package h04;

import java.applet.*;
import java.awt.*;

public class opdr2 extends Applet {

    public void paint(Graphics g) {
        g.drawLine(180,90,90,0);
        g.drawLine(90,0,0,90);
        g.drawLine(0,90,180,90);
        g.drawRect(0,90,180,180);
        g.drawRect(10,230,20,40);
        g.drawRect(60,210,80,40);
    }
}
