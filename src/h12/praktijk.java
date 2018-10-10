package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class praktijk extends Applet {

    TextField text, textx;
    Button but;
    String name[], numb[];
    int t, i;

    public void init() {

        t = 0;
        text = new TextField("", 10);
        textx = new TextField("", 10);
        but = new Button("Ok");
        but.addActionListener( new ButListener() );
        name = new String[10];
        numb = new String[10];
        add(text);
        add(textx);
        add(but);
    }

    public void paint(Graphics g) {

        g.drawString(""+ t,200,40);
        if (i == 10) {
            for (int count = 0; count < 10; count++) {
                int x = 20;
                g.drawString("" + name[count] + ", ", x, 40 + (count * 20));
                x = x + 100;
                g.drawString("" + numb[count] , x, 40 + (count * 20));
                if (count == 10) {count = 0;}
            }
            i = 0;
        }
    }


    class ButListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (t == 10) {
                t = 0;
                repaint();
            }
            i++;
            String s1 = text.getText();
            String s2 = textx.getText();
            name[t] = s1;
            numb[t] = s2;
            t += 1;
            repaint();
        }
    }
}
