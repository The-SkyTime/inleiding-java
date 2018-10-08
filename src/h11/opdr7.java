package h11;

import java.applet.*;
import java.awt.*;

public class opdr7 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int count, c = 0, y = 0, w = 500, h = 500;
        for(count = 0; count < 50; count++) {
            c = c + 5;
            y = y + 5;
            w = w - 10;
            h = h - 10;
            g.drawOval(c,y,w,h);
        }
    }
}