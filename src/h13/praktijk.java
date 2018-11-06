package h13;

import java.applet.Applet;
import java.awt.*;

public class praktijk  extends Applet {
    public void init() {
    }

    public void paint(Graphics g) {
        for (int y = 0; y < 2; y++) {
            for (int count = 0; count < 7; count++) {
                if (y % 2 == 0) {
                    tree(g, 60 + count * 80, 60+y*160, 30, 100);
                } else{
                    tree(g, 40 + count * 80, 60+y*160, 30, 100);
                }
            }
        }
    }

    void tree(Graphics g, int X, int Y, int width, int height) {
        g.setColor(new Color(99, 11, 11));
        g.fillRect(X, Y, width, height);
        g.setColor(Color.black);
        g.drawRect(X, Y, width, height);
        g.setColor(Color.GREEN);
        g.fillOval(X - 25, Y - 40, width + 50, height - 20);
    }
}
