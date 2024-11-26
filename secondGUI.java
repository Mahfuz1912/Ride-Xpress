import javax.swing.*;
import java.awt.*;

public class SecondGUI extends JFrame {
    public SecondGUI(Mydata data) {
        setTitle("Display Cost");
        setLayout(new FlowLayout());

        JLabel label = new JLabel("From: " + data.getFrom() + ", To: " + data.getTo() + ", Cost: $" + data.getCost());
        add(label);
        pack();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}