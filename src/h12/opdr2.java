package h12;

import java.applet.Applet;
import java.awt.*;

public class opdr2 extends Applet {
    Button but[];

    public void init() {

        but = new Button[26];
         for (int i = 1; i < 26; i++) {
            but[i] = new Button("button "+i);
            add(but[i]);
        }
    }
}
