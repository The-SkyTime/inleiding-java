package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr6 extends Applet {

    double ran[];
    int t, Num1,num;
    TextField text;

    public void init() {

        ran = new double[20];
        text = new TextField("",20);
        text.addActionListener( new Text1Listener() );
        add(text);
        for (t = 0; t < 20; t++) {

            double r = Math.random();
            int c = (int)(r*10+1);
            ran[t] = c;
        }
    }

    public void paint(Graphics g) {

        g.drawString("Searching Number: "+Num1+"   Found Number: "+num,20,40);
    }

    class Text1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            num = 0;
            Num1 = Integer.parseInt( text.getText() );
            for (int teller = 0; teller < ran.length; teller++) {
                if (ran[teller] == Num1) {
                    num++;
                }
            }
            repaint();
        }
    }
}
