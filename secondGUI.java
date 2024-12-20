
import javax.swing.*;
import java.awt.*;

public class SecondGUI extends JFrame {
    public SecondGUI(Mydata data) {
        setTitle("Ride Xpress");
        setLayout(new BorderLayout());

        JLabel label = new JLabel("<html>From: <b>" + data.getFrom() + "</b>,<br>To: <b>" 
                                    + data.getTo() + "</b>,<br>Cost: <b>$" + data.getCost() + "</b></html>");
        label.setFont(new Font("Arial", Font.PLAIN, 18));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        add(label, BorderLayout.CENTER);

        pack();
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
