package CreateWindowSwing2;

import javax.swing.*;

public class MyFrame extends JFrame {
    MyFrame(String name){
        super(name);
        setSize(300,200);
        setLocation(500,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
