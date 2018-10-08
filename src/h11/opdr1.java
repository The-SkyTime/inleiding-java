package h11;

import java.applet.*;
import java.awt.*;

public class opdr1 extends Applet {

    public void init() {}

    public void paint(Graphics g) {

        int t = 0;
        for( int count = 0; count < 10; count++) {
            t +=15;
            g.drawLine(t, 50,t, 300);
        }
    }
}