package h12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class opdr3 extends Applet {

    TextField text[];
    Button but;
    ArrayList<Integer> num = new ArrayList<>();

    public void init() {

        but = new Button("ok");
        but.addActionListener(new But1Listener());
        text = new TextField[5];
        for (int i = 0; i < 5; i++) {
            text[i] = new TextField("",3);
            add(text[i]);
        }
        add(but);
    }

    class But1Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            num.clear();
            for (int count = 0; count < 5; count++) {
                int num1 = Integer.parseInt(text[count].getText());
                num.add(num1);
            }
            Collections.sort(num);
            for (int count = 0; count < 5; count++) {
                text[count].setText(""+ num.get(count));
            }
        }
    }
}
