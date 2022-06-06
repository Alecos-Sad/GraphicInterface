package CreateWindow2;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    MyFrame(String name) {
        super(name);
        setSize(300, 200);
        setLocation(500, 400);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setVisible(true);
    }
}
