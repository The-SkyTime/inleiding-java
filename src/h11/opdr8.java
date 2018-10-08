package h11;

import java.applet.Applet;
import java.awt.*;

public class opdr8 extends Applet {

    public void paint(Graphics g) {

        int count, x = 0, y = 0, w = 10, b = 10;
        for(count = 0; count < 100; count++) {
            x = 100;
            y = 100;
            w = w + 5;
            b = b + 5;
            g.drawOval(x,y,w,b);
        }
    }
}
