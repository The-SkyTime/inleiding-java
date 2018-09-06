package h04;

import java.applet.*;
import java.awt.*;

public class opdr3 extends Applet {

    public void paint(Graphics g) {
        g.drawRect(0,0,20,360);
        g.setColor(Color.red);
        g.fillRect(21, 0, 140, 60);
        g.drawRect(21,0,140,60);
        g.setColor(Color.white);
        g.fillRect(21, 60, 140, 60);
        g.drawRect(21,60,140,60);
        g.setColor(Color.blue);
        g.fillRect(21, 120, 140, 60);
        g.drawRect(21,120,140,60);
    }
}
