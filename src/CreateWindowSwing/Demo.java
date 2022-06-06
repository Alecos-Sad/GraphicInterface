package CreateWindowSwing;

import javax.swing.*;

public class Demo {
    public static void main(String[] args) {
        JFrame window = new JFrame("Window SWING");
        window.setSize(300,200);
        window.setLocation(500,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
