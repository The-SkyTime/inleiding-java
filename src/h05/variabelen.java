package h05;

import java.awt.*;
import java.applet.*;

public class variabelen extends Applet {
    // H5
    Color color;
    Color line;
    int breedte;
    int height;
    int valerie,jeroen, hans;

    public void init() {
        //H5
        color = Color.MAGENTA;
        line = Color.BLACK;
        breedte = 100;
        height = 50;
        valerie = 40;
        jeroen = 100;
        hans = 80;
    }


    public void paint(Graphics g) {

        // 5.1
        /*//Lijn
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
        g.drawString("Cirkel",280,180);*/

        // 5.2
        /*g.drawString( "120" , 20, 40 );
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
        g.fillRect(121, 160 - hans, 19, hans);*/

    }
}