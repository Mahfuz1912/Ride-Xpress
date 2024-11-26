import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Vehicle extends JFrame {

    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel,imgLabel2;
    private Font f1,f2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, nBtn;
    private Cursor cursor;

	Vehicle() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ride Xpress");
        this.setSize(960, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#fbca0b"));
		
		f1 = new Font("Rockwell Extra Bold", Font.BOLD, 25);
		f2 = new Font("Rockwell Extra Bold", Font.BOLD, 18);
		
		icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        this.setIconImage(icon.getImage());
		
		btn1 = new JButton("Back");
        btn1.setBounds(20, 480, 100, 30);
        btn1.setFont(f2);
        
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                homeus us = new homeus();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		btn2 = new JButton("CAR");
        btn2.setBounds(170, 350, 100, 30);
        btn2.setFont(f2);
        
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#2E75B6"));
        c.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                SearchingForRide us = new SearchingForRide();
                us.setVisible(true);
               
            }
        });
		
		btn3 = new JButton("BIKE");
        btn3.setBounds(390, 350, 100, 30);
        btn3.setFont(f2);
       
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00060"));
        c.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                SearchingForRide1 us = new SearchingForRide1();
                us.setVisible(true);
                
            }
        });
		
		btn4 = new JButton("CNG");
        btn4.setBounds(610, 350, 100, 30);
        btn4.setFont(f2);
      
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#00C000"));
        c.add(btn4);
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                SearchingForRide3 us = new SearchingForRide3();
                us.setVisible(true);
               
            }
        });
		
		logo2 = new ImageIcon(getClass().getResource("/pic/logo4.png"));
        imgLabel2 = new JLabel(logo2);
        imgLabel2.setBounds(120, 0, 690, 600);
        c.add(imgLabel2);
		
		logo = new ImageIcon(getClass().getResource("/pic/logo2.png"));
        imgLabel = new JLabel(logo);
       
        c.add(imgLabel);
		imgLabel.setSize(logo.getIconWidth(), logo.getIconHeight());
	
		
	}
		
		
		 public static void main(String[] args) {

        Vehicle frame = new Vehicle();
        frame.setVisible(true);
    }
}
