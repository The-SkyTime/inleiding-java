package h12;

import java.awt.*;
import java.applet.*;

public class opdr1 extends Applet {
    int[] Num1 = {1,2,3,4,5,6,7,8,9,10};
    int x, tel;
    double t, i, m;

    public void init() {

        for (int i = 0; i < Num1.length; i++) {
            t = Num1[i];
            this.i = t + this.i;
        }
        m = i / (Num1.length+1);
    }

    public void paint(Graphics g) {

        for (tel = 0; tel < Num1.length; tel ++) {
            g.drawString("" + Num1[tel] + ", ",20*(tel+1), 20);
        }
        g.drawString("Gemiddelde: " + m,20,40);
    }
}
