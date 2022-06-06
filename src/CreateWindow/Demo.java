package CreateWindow;

import java.awt.*;
import java.awt.event.*;

public class Demo {
    public static void main(String[] args) {
        Frame window = new Frame("Window AWT");
        window.setSize(300, 200);
        window.setLocation(500, 400);
        window.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        window.setVisible(true);
    }
}
