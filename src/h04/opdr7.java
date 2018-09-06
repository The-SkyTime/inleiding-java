package h04;

import java.applet.*;
import java.awt.*;

public class opdr7 extends Applet {

    public void paint(Graphics g) {
        g.drawRect(10,10,50,50);
        g.fillOval(20,20,5,5);
        g.fillOval(40,20,5,5);
        g.fillOval(20,40,5,5);
        g.fillOval(40,40,5,5);
    }
}
