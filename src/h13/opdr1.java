package h13;

import java.awt.*;
import java.applet.*;

public class opdr1 extends Applet {


    public void init() {
    }
    public void paint(Graphics g) {
        drawTriangle(g,100,100,200,50,150);
    }

    void drawTriangle(Graphics g, int x1, int y1, int x2, int y2, int x3) {
        g.drawLine(x1,y1,x2,y1);
        g.drawLine(x2,y1,x3,y2);
        g.drawLine(x3,y2,x1,y1);
    }
}

