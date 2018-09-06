package h02;
import java.awt.*;
import java.applet.*;

public class opdr1 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        //Naam 1
        g.setColor(Color.yellow);
        g.drawString( "Tim Wijnands" , 40, 40 );

    }
}