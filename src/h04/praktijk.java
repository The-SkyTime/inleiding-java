package h04;

import java.applet.*;
import java.awt.*;

public class praktijk extends Applet {

    public void paint(Graphics g) {
        // Praktijk
        g.drawLine(10,10,100,10);
        g.drawString("Lijn",45,25);
        g.drawRect(10,30,100,50);
        g.drawString("Rechthoek",35,95);
        g.drawRoundRect(10,100,100,50,15,15);
        g.drawString("Afgeronde rechthoek",5,165);
        g.setColor(Color.magenta);
        g.fillRect(120,30,100,50);
        g.setColor(Color.black);
        g.drawOval(120,30,100,50);
        g.drawString("Gevulde rechthoek met ovaal",105,95);
        g.setColor(Color.magenta);
        g.fillOval(120,100,100,50);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal",130,165);
        g.drawOval(250,30,100,50);
        g.setColor(Color.magenta);
        g.fillArc(250,30,100,50,0,45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen",275,95);
        g.drawOval(270,105,50,50);
        g.drawString("Cirkel",280,170);
    }
}
