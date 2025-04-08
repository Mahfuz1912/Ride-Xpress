import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class bike extends JFrame {
    private Container c;
    private ImageIcon icon, logo;
    private JLabel imgLabel, j1, j2, j3, j4;
    private Font f1, f2, f3;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13;
    private Cursor cursor;

    public bike() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ride Xpress");
        this.setSize(960, 700); // Increased height to accommodate 4 drivers
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#fbca0b"));
        
        f1 = new Font("Rockwell Extra Bold", Font.BOLD, 25);
        f2 = new Font("Rockwell Extra Bold", Font.BOLD, 18);
        f3 = new Font("Rockwell Extra Bold", Font.BOLD, 16);
        
        icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        this.setIconImage(icon.getImage());
        
        // Back Button
        btn1 = new JButton("Back");
        btn1.setBounds(20, 620, 100, 30); // Adjusted position
        btn1.setFont(f2);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
        
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Vehicle us = new Vehicle();
                us.setVisible(true);
                dispose();
            }
        });
        
        try {
            // Get 4 drivers from database
            BikeDriver driver1 = DBConnection.getBikeDriver(1);
            BikeDriver driver2 = DBConnection.getBikeDriver(2);
            BikeDriver driver3 = DBConnection.getBikeDriver(3);
            BikeDriver driver4 = DBConnection.getBikeDriver(4);
            
            // Driver 1 Info
            j1 = new JLabel("Driver: 1 | Bike Model: " + driver1.getBikeModel());
            j1.setFont(f2);
            j1.setBackground(Color.white);
            j1.setForeground(Color.yellow);
            j1.setBounds(500, 100, 1000, 30);
            c.add(j1);
            
            // Driver 1 Buttons
            btn2 = new JButton("CALL");
            btn2.setBounds(500, 140, 100, 30);
            btn2.setFont(f2);
            btn2.setForeground(Color.WHITE);
            btn2.setBackground(Color.decode("#00C000"));
            c.add(btn2);
            
            btn3 = new JButton("Price");
            btn3.setBounds(610, 140, 100, 30);
            btn3.setFont(f3);
            btn3.setForeground(Color.WHITE);
            btn3.setBackground(Color.decode("#C00060"));
            c.add(btn3);
            
            btn4 = new JButton("Info");
            btn4.setBounds(720, 140, 100, 30);
            btn4.setFont(f2);
            btn4.setForeground(Color.WHITE);
            btn4.setBackground(Color.decode("#0000C0"));
            c.add(btn4);
            
            // Driver 2 Info
            j2 = new JLabel("Driver: 2 | Bike Model: " + driver2.getBikeModel());
            j2.setFont(f2);
            j2.setBackground(Color.white);
            j2.setForeground(Color.yellow);
            j2.setBounds(500, 220, 1000, 30);
            c.add(j2);
            
            // Driver 2 Buttons
            btn5 = new JButton("CALL");
            btn5.setBounds(500, 260, 100, 30);
            btn5.setFont(f2);
            btn5.setForeground(Color.WHITE);
            btn5.setBackground(Color.decode("#00C000"));
            c.add(btn5);
            
            btn6 = new JButton("Price");
            btn6.setBounds(610, 260, 100, 30);
            btn6.setFont(f3);
            btn6.setForeground(Color.WHITE);
            btn6.setBackground(Color.decode("#C00060"));
            c.add(btn6);
            
            btn7 = new JButton("Info");
            btn7.setBounds(720, 260, 100, 30);
            btn7.setFont(f2);
            btn7.setForeground(Color.WHITE);
            btn7.setBackground(Color.decode("#0000C0"));
            c.add(btn7);
            
            // Driver 3 Info
            j3 = new JLabel("Driver: 3 | Bike Model: " + driver3.getBikeModel());
            j3.setFont(f2);
            j3.setBackground(Color.white);
            j3.setForeground(Color.yellow);
            j3.setBounds(500, 340, 1000, 30);
            c.add(j3);
            
            // Driver 3 Buttons
            btn8 = new JButton("CALL");
            btn8.setBounds(500, 380, 100, 30);
            btn8.setFont(f2);
            btn8.setForeground(Color.WHITE);
            btn8.setBackground(Color.decode("#00C000"));
            c.add(btn8);
            
            btn9 = new JButton("Price");
            btn9.setBounds(610, 380, 100, 30);
            btn9.setFont(f3);
            btn9.setForeground(Color.WHITE);
            btn9.setBackground(Color.decode("#C00060"));
            c.add(btn9);
            
            btn10 = new JButton("Info");
            btn10.setBounds(720, 380, 100, 30);
            btn10.setFont(f2);
            btn10.setForeground(Color.WHITE);
            btn10.setBackground(Color.decode("#0000C0"));
            c.add(btn10);
            
            // Driver 4 Info
            j4 = new JLabel("Driver: 4 | Bike Model: " + driver4.getBikeModel());
            j4.setFont(f2);
            j4.setBackground(Color.white);
            j4.setForeground(Color.yellow);
            j4.setBounds(500, 460, 1000, 30);
            c.add(j4);
            
            // Driver 4 Buttons
            btn11 = new JButton("CALL");
            btn11.setBounds(500, 500, 100, 30);
            btn11.setFont(f2);
            btn11.setForeground(Color.WHITE);
            btn11.setBackground(Color.decode("#00C000"));
            c.add(btn11);
            
            btn12 = new JButton("Price");
            btn12.setBounds(610, 500, 100, 30);
            btn12.setFont(f3);
            btn12.setForeground(Color.WHITE);
            btn12.setBackground(Color.decode("#C00060"));
            c.add(btn12);
            
            btn13 = new JButton("Info");
            btn13.setBounds(720, 500, 100, 30);
            btn13.setFont(f2);
            btn13.setForeground(Color.WHITE);
            btn13.setBackground(Color.decode("#0000C0"));
            c.add(btn13);
            
            // Add action listeners for all buttons
            addDriverButtonActions(driver1, driver2, driver3, driver4);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error loading driver data: " + e.getMessage());
            e.printStackTrace();
        }
        
        logo = new ImageIcon(getClass().getResource("/pic/logox.gif"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0, logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
    }
    
    private void addDriverButtonActions(BikeDriver d1, BikeDriver d2, BikeDriver d3, BikeDriver d4) {
        // Driver 1 Actions
        btn2.addActionListener(e -> showCallConfirmation(d1.getFirstName()));
        btn3.addActionListener(e -> showPriceDialog(d1.getPricePerKm()));
        btn4.addActionListener(e -> new BikeDriverInfo(1).setVisible(true));
        
        // Driver 2 Actions
        btn5.addActionListener(e -> showCallConfirmation(d2.getFirstName()));
        btn6.addActionListener(e -> showPriceDialog(d2.getPricePerKm()));
        btn7.addActionListener(e -> new BikeDriverInfo(2).setVisible(true));
        
        // Driver 3 Actions
        btn8.addActionListener(e -> showCallConfirmation(d3.getFirstName()));
        btn9.addActionListener(e -> showPriceDialog(d3.getPricePerKm()));
        btn10.addActionListener(e -> new BikeDriverInfo(3).setVisible(true));
        
        // Driver 4 Actions
        btn11.addActionListener(e -> showCallConfirmation(d4.getFirstName()));
        btn12.addActionListener(e -> showPriceDialog(d4.getPricePerKm()));
        btn13.addActionListener(e -> new BikeDriverInfo(4).setVisible(true));
    }
    
    private void showCallConfirmation(String driverName) {
        int conf = JOptionPane.showConfirmDialog(null, 
            "Confirm to call Driver " + driverName + "?", 
            "Confirm Ride", JOptionPane.YES_NO_OPTION);
        if (conf == 0) {
            JOptionPane.showMessageDialog(null, 
                "Driver " + driverName + " is coming. Please wait.");
        }
    }
    
    private void showPriceDialog(double price) {
        int comf = JOptionPane.showConfirmDialog(null,
            price + "$ per KM. Pay now?", 
            "Payment", JOptionPane.YES_NO_OPTION);
        if (comf == 0) {
            new payment1().setVisible(true);
        }
    }
    
    public static void main(String[] args) {
        bike frame = new bike();
        frame.setVisible(true);
    }
}