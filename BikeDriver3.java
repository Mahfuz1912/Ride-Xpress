import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.*;
public class BikeDriver3 extends JFrame {
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
    public BikeDriver3() {
        initComponents();
    }
    private void initComponents() {
		f2 = new Font("Rockwell Extra Bold", Font.BOLD, 18);
        DriverList = new JLabel();
        btn1 = new JButton();
        ProfileLabel = new JLabel();
        DriverNameLabel = new JLabel();
        DriverNameLabel2 = new JLabel();
        DriverNameLabel3 = new JLabel(); 
		DriverNameLabel4 = new JLabel(); 
		DriverNameLabel5 = new JLabel();
		DriverNameLabel6 = new JLabel();
        BackgroundImage = new JLabel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setTitle("Ride Xpress");
        setResizable(false);
        getContentPane().setLayout(null);
		
		icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        setIconImage(icon.getImage());
        DriverList.setFont(new Font("Arial", Font.BOLD, 30));
        DriverList.setForeground(Color.black);
        DriverList.setText("Bike Driver List");
        getContentPane().add(DriverList);
        DriverList.setBounds(390, 80, 250, 49);
		
		btn1 = new JButton("Back");
        btn1.setBounds(20, 480, 100, 30);
        btn1.setFont(f2);
       
        btn1.setForeground(Color.black);
        btn1.setBackground(Color.decode("#C00000"));
        getContentPane().add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                bike us = new bike();
                us.setVisible(true);
                setVisible(false);
            }
        });
        DriverNameLabel.setFont(new Font("Arial", Font.BOLD, 22));
        DriverNameLabel.setForeground(Color.black);
        DriverNameLabel.setText("AB 12345-006");
        getContentPane().add(DriverNameLabel);
        DriverNameLabel.setBounds(390, 225, 310, 30);
        DriverNameLabel2.setFont(new Font("Arial", Font.PLAIN, 24));
        DriverNameLabel2.setForeground(Color.black);
        DriverNameLabel2.setText("Romjan");
        getContentPane().add(DriverNameLabel2);
        DriverNameLabel2.setBounds(390, 275, 350, 30);
        DriverNameLabel3.setFont(new Font("Arial", Font.PLAIN, 24));
		DriverNameLabel3.setForeground(Color.black);
        DriverNameLabel3.setText("Mia");
        getContentPane().add(DriverNameLabel3);
        DriverNameLabel3.setBounds(390, 305, 600, 30);
		DriverNameLabel4.setFont(new Font("Arial", Font.PLAIN, 17));
		DriverNameLabel4.setForeground(Color.black);
        DriverNameLabel4.setText("01-01-2022");
        getContentPane().add(DriverNameLabel4);
        DriverNameLabel4.setBounds(435, 357, 600, 30); 
		
		DriverNameLabel5.setFont(new Font("Arial", Font.PLAIN, 17));
		DriverNameLabel5.setForeground(Color.black);
        DriverNameLabel5.setText("01-01-2030");
        getContentPane().add(DriverNameLabel5);
        DriverNameLabel5.setBounds(625, 357, 600, 30);
		
		DriverNameLabel6.setFont(new Font("Comic Sans MS", 2, 20));
		DriverNameLabel6.setForeground(Color.black);
        DriverNameLabel6.setText("Romjan");
        getContentPane().add(DriverNameLabel6);
        DriverNameLabel6.setBounds(270, 430, 600, 30);
        BackgroundImage.setIcon(new ImageIcon(getClass().getResource("/Images/License.png"))); 
        BackgroundImage.setText("");
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 960, 600);
        setSize(new Dimension(960, 600));
        setLocationRelativeTo(null);
    }
    private void BackActionPerformed(ActionEvent evt) {
        
        System.out.println("Back button pressed");
        this.dispose(); 
    }
    public static void main(String args[]) {
       BikeDriver3 frame = new BikeDriver3();
        frame.setVisible(true);
    }
   
}
