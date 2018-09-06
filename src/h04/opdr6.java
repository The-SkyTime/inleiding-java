package h04;

import java.applet.*;
import java.awt.*;

public class opdr6 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(50,50,40,145);
        g.drawRect(50 ,50,40,145);
        g.drawOval(50,50,40,40);
        g.setColor(Color.red);
        g.fillOval(51,51,39,39);
        g.setColor(Color.black);
        g.drawOval(50,95,40,40);
        g.setColor(Color.yellow);
        g.fillOval(51,96,39,39);
        g.setColor(Color.black);
        g.drawOval(50,140,40,40);
        g.setColor(Color.green);
        g.fillOval(51,141,39,39);
    }
}
