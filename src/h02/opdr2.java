package h02;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet{
    public void init() {
        setBackground(Color.white);
    }
    public void paint(Graphics g) {
        //Naam 2
        g.setColor(Color.blue);
        g.drawString( "Tim" , 40, 40 );
        g.setColor(Color.red);
        g.drawString( "Wijnands" , 40, 60 );
    }
}
