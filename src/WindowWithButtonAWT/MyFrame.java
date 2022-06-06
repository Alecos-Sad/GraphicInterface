package WindowWithButtonAWT;

import java.awt.*;
import java.awt.event.*;

public class MyFrame extends Frame {
    private int count = 0;
    private final String text = "Press button \"Number\": ";

    MyFrame(int x, int y) {
        super();
        setTitle("Window with button");
        setBounds(x, y, 300, 200);
        setResizable(false);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        setLayout(null);
        Font f = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 13);
        setFont(f);
        Panel P = new Panel();
        P.setBounds(10, 30, 280, 120);
        P.setBackground(Color.LIGHT_GRAY);
        P.setLayout(new BorderLayout());
        Label L = new Label(text + count);
        L.setAlignment(Label.CENTER);
        L.setForeground(Color.BLUE);
        P.add(L, BorderLayout.CENTER);
        add(P);
        Button A = new Button("Close");
        A.setBounds(40, 160, 90, 30);
        A.addActionListener(e -> System.exit(0));
        add(A);
        Button B = new Button("Number");
        B.addActionListener(e -> {
            count++;
            if (count > 3) {
                B.setEnabled(false);
                L.setText("Button \"Number\" Blocked!");
            } else {
                L.setText(text + count);
            }
        });
        B.setBounds(170, 160, 90, 30);
        add(B);
        setVisible(true);
    }
}
