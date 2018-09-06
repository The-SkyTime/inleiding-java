package h06;

import java.applet.*;
import java.awt.*;

public class opdr3 extends Applet {

    int num1, num2, numtot;

    public void init() {
        num1 = 10;
        num2 = 20;
        numtot = num1 +- num2;
    }


    public void paint(Graphics g) {
        // Negatieve getal
        g.drawString("" + numtot , 10,10);
    }
}
