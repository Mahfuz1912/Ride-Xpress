import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BikeDriver1 extends JFrame {
    private JLabel DriverList;
    private ImageIcon icon;
    private JButton btn1;
    private Font f2;
    private JLabel ProfileLabel;
    private JLabel DriverNameLabel;
    private JLabel DriverNameLabel2;
    private JLabel DriverNameLabel3;
    private JLabel DriverNameLabel4;
    private JLabel DriverNameLabel5;
    private JLabel DriverNameLabel6;
    private JLabel BackgroundImage;
    private BikeDriver driver;
    
    public BikeDriver1(int driverId) {
        this.driver = DBConnection.getBikeDriver(driverId);
        initComponents();
    }
    
    private void initComponents() {
        // Existing initialization code...
        
        // Set labels with driver data
        DriverNameLabel.setText(driver.getDriverId());
        DriverNameLabel2.setText(driver.getFirstName());
        DriverNameLabel3.setText(driver.getLastName());
        DriverNameLabel4.setText(driver.getLicenseIssue());
        DriverNameLabel5.setText(driver.getLicenseExpire());
        DriverNameLabel6.setText(driver.getSignatureName());
        
        // Rest of the existing code...
    }
    
    // Rest of the existing code...
}