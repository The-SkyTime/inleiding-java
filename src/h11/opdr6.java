package h11;

import java.applet.*;
import java.awt.*;

public class opdr6 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int count, x = 0, y = 0, w = 60, h = 60;
        for(count = 0; count < 5; count++) {
            x = x + 5;
            y = y + 5;
            w = w - 10;
            h = h - 10;
            g.drawOval(x,y,w,h);
        }
    }
}
