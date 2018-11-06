package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class opdr4_5 extends Applet {

    TextField text;
    Button but;
    double[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13};
    double search, r, Num2;
    int c, Num1, tel = 0, i,Num3;
    boolean t;

    public void init() {

        text = new TextField("",10);
        but = new Button("Ok");
        but.addActionListener( new But1Listener() );
        t = false;
        add(text);
        add(but);
    }

    public void paint(Graphics g) {

        if(t == true) {
            g.drawString("Waarde is gevonden "+Num2+" Index waarde "+Num3,20,50);
        }
        else {
            g.drawString("Waarde: "+Num1+" is niet gevonden",20, 50);
        }
    }

    class But1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            Num1 = Integer.parseInt( text.getText() );
            search = Num1;
            t = false;
            for (tel = 0; tel < num.length; tel++) {
                if (num[tel] == search) {
                    t = true;
                    Num2 = num[tel];
                    Num3 = tel;

                    // Opdracht 12.5
                    break;
                }
            }
            repaint();
        }
    }
}
