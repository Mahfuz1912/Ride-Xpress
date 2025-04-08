import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BikeDriverInfo extends JFrame {
    private JLabel DriverList;
    private ImageIcon icon;
    private JButton btn1;
    private Font f2;
    private JLabel DriverNameLabel;
    private JLabel DriverNameLabel2;
    private JLabel DriverNameLabel3;
    private JLabel DriverNameLabel4;
    private JLabel DriverNameLabel5;
    private JLabel DriverNameLabel6;
    private JLabel BackgroundImage;
    private BikeDriver driver;
    
    public BikeDriverInfo(int driverId) {
        this.driver = DBConnection.getBikeDriver(driverId);
        initComponents();
    }
    
    private void initComponents() {
        f2 = new Font("Rockwell Extra Bold", Font.BOLD, 18);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Driver Information");
        setResizable(false);
        getContentPane().setLayout(null);
        
        icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        setIconImage(icon.getImage());
        
        DriverList = new JLabel("Driver Details");
        DriverList.setFont(new Font("Arial", Font.BOLD, 30));
        DriverList.setBounds(390, 80, 250, 49);
        getContentPane().add(DriverList);
        
        btn1 = new JButton("Back");
        btn1.setBounds(20, 480, 100, 30);
        btn1.setFont(f2);
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.decode("#C00000"));
        btn1.addActionListener(e -> dispose());
        getContentPane().add(btn1);
        
        // Driver Info Labels
        DriverNameLabel = new JLabel(driver.getDriverId());
        DriverNameLabel.setFont(new Font("Arial", Font.BOLD, 22));
        DriverNameLabel.setBounds(390, 225, 310, 30);
        getContentPane().add(DriverNameLabel);
        
        DriverNameLabel2 = new JLabel(driver.getFirstName());
        DriverNameLabel2.setFont(new Font("Arial", Font.PLAIN, 24));
        DriverNameLabel2.setBounds(390, 275, 350, 30);
        getContentPane().add(DriverNameLabel2);
        
        DriverNameLabel3 = new JLabel(driver.getLastName());
        DriverNameLabel3.setFont(new Font("Arial", Font.PLAIN, 24));
        DriverNameLabel3.setBounds(390, 305, 600, 30);
        getContentPane().add(DriverNameLabel3);
        
        DriverNameLabel4 = new JLabel("" + driver.getLicenseIssue());
        DriverNameLabel4.setFont(new Font("Arial", Font.PLAIN, 17));
        DriverNameLabel4.setBounds(435, 357, 600, 30);
        getContentPane().add(DriverNameLabel4);
        
        DriverNameLabel5 = new JLabel("" + driver.getLicenseExpire());
        DriverNameLabel5.setFont(new Font("Arial", Font.PLAIN, 17));
        DriverNameLabel5.setBounds(625, 357, 600, 30);
        getContentPane().add(DriverNameLabel5);
        
        DriverNameLabel6 = new JLabel("" + driver.getSignatureName());
        DriverNameLabel6.setFont(new Font("Comic Sans MS", Font.ITALIC, 20));
        DriverNameLabel6.setBounds(270, 430, 600, 30);
        getContentPane().add(DriverNameLabel6);
        
        BackgroundImage = new JLabel(new ImageIcon(getClass().getResource("/Images/License.png")));
        BackgroundImage.setBounds(0, 0, 960, 600);
        getContentPane().add(BackgroundImage);
        
        setSize(960, 600);
        setLocationRelativeTo(null);
    }
}