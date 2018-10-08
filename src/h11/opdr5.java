package h11;

import java.applet.*;
import java.awt.*;

public class opdr5 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int count, x = 0, y = 0;
        for(count = 0; count < 5; count++) {
            x = 20 + x;
            y = 20 + y;
            g.drawRect(x,y,20,20);
        }
    }
}