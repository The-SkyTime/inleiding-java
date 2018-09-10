package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class opdr1 extends Applet{

    Button clear;
    Button ok;
    TextField tekstvak;
    Label label;
    String s;

    public void init() {
        tekstvak = new TextField("Klik op mij", 20);
        label = new Label("Type iets in het tekstvak " +
                "en druk op enter");
        tekstvak.addActionListener( new TekstvakListener() );
        ok = new Button("Ok");
        ok.addActionListener( new KnopListener() );
        clear = new Button("Clear");
        clear.addActionListener( new KnopListener2() );
        add(label);
        add(tekstvak);
        add(ok);
        add(clear);
        s = "";
    }

    public void paint(Graphics g) {
        g.drawString(s, 10, 80 );
    }

    class TekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            s = tekstvak.getText();
            repaint();
        }
    }
    class KnopListener2 implements ActionListener	{
        public void actionPerformed( ActionEvent e ) {
            tekstvak.setText(" ");
            s = tekstvak.getText();
            repaint();
        }
    }
}


