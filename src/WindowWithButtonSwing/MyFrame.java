package WindowWithButtonSwing;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    private int count = 0;
    private String text = "Press Button - Number: ";

    MyFrame(int x, int y) {
        super();
        setTitle("Window with button");
        setBounds(x, y, 300, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        Font f = new Font(Font.DIALOG, Font.BOLD | Font.ITALIC, 13);
        JPanel P = new JPanel();
        P.setBounds(10, 10, 275, 120);
        P.setBackground(Color.LIGHT_GRAY);
        P.setLayout(new BorderLayout());
        JLabel L = new JLabel(text + count);
        L.setHorizontalAlignment(JLabel.CENTER);
        L.setForeground(Color.BLUE);
        L.setFont(f);
        P.add(L, BorderLayout.CENTER);
        add(P);
        JButton A = new JButton("CLOSE");
        A.setBounds(30, 135, 100, 30);
        A.setFont(f);
        A.addActionListener(e -> System.exit(0));
        add(A);
        JButton B = new JButton("Number");
        B.setFont(f);
        B.addActionListener(e -> {
            count++;
            if (count > 3) {
                B.setEnabled(false);
                L.setText("Button Number is Blocked!");
            } else {
                L.setText(text + count);
            }
        });
        B.setBounds(170,135,100,30);
        add(B);
        setVisible(true);
    }
}
