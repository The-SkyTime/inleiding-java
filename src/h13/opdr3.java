package h13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr3 extends Applet {
    Button but, but2;
    int sX, sY, bX, bY;
    double L1, L2;
    Color color;

public void init() {

        but = new Button("Muur 1");
        but2 = new Button("Muur 2");
        but.addActionListener( new But1Listener() );
        but2.addActionListener( new But2Listener() );
        add(but);
        add(but2);
        }

public void paint(Graphics g) {
        Wall(g,40,40, bX, bY,10);
        }

        void Wall(Graphics g,int x1, int y1, int x2, int hoogte, int height) {
        int x = x1;
        for (int row = 0; row < height;) {
        x1 = x;
        for (int kolom = 0; kolom < 4; kolom++) {
        g.setColor(color);
        g.fillRect(x1-10,y1,x2,hoogte);
        g.setColor(Color.black);
        g.drawRect(x1-10,y1,x2,hoogte);
        x1 += x2;
        }
        row++;
        y1 = y1 + hoogte;
        x1 = x;

        for (int kolom = 0; kolom < 4; kolom++) {
        g.setColor(color);
        g.fillRect(x1,y1,x2,hoogte);
        g.setColor(Color.black);
        g.drawRect(x1,y1,x2,hoogte);
        x1 += x2;
        }
        row++;
        y1 = y1 + hoogte;
        }
        }

class But1Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        bX = 20;
        bY = 10;
        color = Color.red;
        repaint();
    }
}
class But2Listener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        bX = 40;
        bY = 20;
        color = Color.lightGray;
        repaint();
    }
}
}
