package h04;

import java.awt.*;
import java.applet.*;

public class tekenen extends Applet {

    public void paint(Graphics g) {

        //HF 4
        // gelijkbenige driehoek
        /*g.setColor(Color.black);
        g.drawLine(180,90,90,0);
        g.drawLine(90,0,0,90);
        g.drawLine(0,90,180,90);*/

        // Huis met 1 deur en 1 raam
        /*g.drawLine(180,90,90,0);
        g.drawLine(90,0,0,90);
        g.drawLine(0,90,180,90);
        g.drawRect(0,90,180,180);
        g.drawRect(10,230,20,40);
        g.drawRect(60,210,80,40);*/

        //flag
        /*g.drawRect(0,0,20,360);
        g.setColor(Color.red);
        g.fillRect(21, 0, 140, 60);
        g.drawRect(21,0,140,60);
        g.setColor(Color.white);
        g.fillRect(21, 60, 140, 60);
        g.drawRect(21,60,140,60);
        g.setColor(Color.blue);
        g.fillRect(21, 120, 140, 60);
        g.drawRect(21,120,140,60);*/

        // Staafdiagram
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
        g.fillRect(41, 120, 19, 40);
        g.setColor(Color.black);
        g.drawRect(80,40,20,120);
        g.drawString( "Jeroen" , 75, 170 );
        g.setColor(Color.YELLOW);
        g.fillRect(81, 61, 19, 99);
        g.setColor(Color.black);
        g.drawRect(120,40,20,120);
        g.drawString( "Hans" , 120, 170 );
        g.setColor(Color.CYAN);
        g.fillRect(121, 81, 19, 79);*/

        // Ellips
        /*g.setColor(Color.yellow);
        g.fillArc(10,10,150,100,10,360);
        setBackground(Color.blue);*/

        // Stoplicht
        /*g.setColor(Color.black);
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
        g.fillOval(51,141,39,39);*/

        //dobbelsteen
        /*g.drawRect(10,10,50,50);
        g.fillOval(20,20,5,5);
        g.fillOval(40,20,5,5);
        g.fillOval(20,40,5,5);
        g.fillOval(40,40,5,5);*/

        //Praktijk
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
