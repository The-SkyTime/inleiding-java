package h06;

import java.applet.Applet;
import java.awt.*;

public class getallen extends Applet{
    double tot, play;
    double uit;
    int sec,min,uur,dag;
    int jaar;
    int num1, num2, numtot;
    double cijf1,cijf2,cijf3;
    double cijftot;

    public void init() {
        tot = 113;
        play = 4;
        uit = tot/play;
        sec = 1;
        min = sec *60;
        uur = min * 60;
        dag = uur * 24;
        jaar = dag * 365;
        num1 = 10;
        num2 = 20;
        numtot = num1 +- num2;

        cijf1 = 5.9;
        cijf2 = 6.3;
        cijf3 = 6.9;
        cijftot = (cijf1 + cijf2 + cijf3) / 3 ;
    }


    public void paint(Graphics g) {

        // 6.1
        /*g.drawString("Uitkomst = " + uit, 10, 10);*/
        // 6.2
        /*g.drawString("Seconden in een uur = " + uur ,10,10);
        g.drawString("Seconden in een dag = " + dag ,10,25);
        g.drawString("Seconden in een jaar = " + jaar ,10,40);*/
        // 6.3
        /*g.drawString("" + numtot , 10,10);*/
        // Praktijk
        g.drawString("" + cijftot,10,10);
    }
}