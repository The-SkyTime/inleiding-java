package h05;

import java.awt.*;
import java.applet.*;

public class opdr1 extends Applet {
    Color color;
    Color line;
    int breedte;
    int height;


    public void init() {
        color = Color.MAGENTA;
        line = Color.BLACK;
        breedte = 100;
        height = 50;

    }


    public void paint(Graphics g) {
        //Lijn
        g.drawLine(10,20,breedte,20);
        g.drawString("Lijn",45,35);
        //Rechthoek
        g.drawRect(10,50, breedte, height);
        g.drawString("Rechthoek",30,115);
        // Afgeronde Rechthoek
        g.drawRoundRect(10,120,breedte,height,30,30);
        g.drawString("Afgeronde Rechthoek",10,185);
        //Gevulde rechthoek met ovaal
        g.setColor(color);
        g.fillRect(130, 50, breedte, height);
        g.setColor(line);
        g.drawOval(130, 50, breedte, height);
        g.drawString("Gevulde rechthoek met ovaal",100,115);
        //Gevulde ovaal
        g.setColor(color);
        g.fillOval(130,120,breedte,height);
        g.setColor(line);
        g.drawString("Gevulde ovaal",145,180);
        //Taartpunt met ovaal eromheen
        g.setColor(line);
        g.drawOval(250,50,breedte,height);
        g.setColor(color);
        g.fillArc(250,50,breedte,height,0,45);
        g.setColor(line);
        g.drawString("Taartpunt met ovaal eromheen",265,115);
        //Cirkel
        g.setColor(line);
        g.drawOval(270,120,50,height);
        g.drawString("Cirkel",280,180);



    }
}