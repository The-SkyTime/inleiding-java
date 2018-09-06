package h05;

import java.applet.*;
import java.awt.*;

public class opdr2 extends Applet {

    int valerie,jeroen, hans;

    public void init() {
        valerie = 40;
        jeroen = 100;
        hans = 80;
    }

    public void paint(Graphics g) {
        g.drawString( "120" , 20, 40 );
        g.drawString( "100" , 20, 60 );
        g.drawString( "80" , 20, 80 );
        g.drawString( "60" , 20, 100 );
        g.drawString( "40" , 20, 120 );
        g.drawString( "20" , 20, 140 );
        g.drawString( "0" , 25, 160 );
        g.drawRect(40,40,20,120);
        g.setColor(Color.black);
        g.drawString( "Valerie" , 30, 170 );
        g.setColor(Color.MAGENTA);
        g.fillRect(41, 160 - valerie, 19, valerie);
        g.setColor(Color.black);
        g.drawRect(80,40,20,120);
        g.drawString( "Jeroen" , 75, 170 );
        g.setColor(Color.YELLOW);
        g.fillRect(81, 160 - jeroen, 19, jeroen);
        g.setColor(Color.black);
        g.drawRect(120,40,20,120);
        g.drawString( "Hans" , 120, 170 );
        g.setColor(Color.CYAN);
        g.fillRect(121, 160 - hans, 19, hans);
    }
}
