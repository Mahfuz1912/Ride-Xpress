import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class bike extends JFrame {
    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel,imgLabel2,j1,j2;
    private Font f1,f2,f3;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, nBtn;
    private Cursor cursor;
	bike() {
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
		f3 = new Font("Rockwell Extra Bold", Font.BOLD, 16);
		
		icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        this.setIconImage(icon.getImage());
		
		btn1 = new JButton("Back");
        btn1.setBounds(20, 500, 100, 30);
        btn1.setFont(f2);
       
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Vehicle us = new Vehicle();
                us.setVisible(true);
                
            }
        });
		
		j1 = new JLabel("Driver: 1 | Bike Model: Royal Enfield");
		j1.setFont(f2);
		j1.setBackground(Color.white);
		j1.setForeground(Color.yellow);
		j1.setBounds(500,170,1000,30);
		c.add(j1);
		
		j2 = new JLabel("Driver: 2 | Bike Model: R15");
		j2.setFont(f2);
		j2.setBackground(Color.white);
		j2.setForeground(Color.yellow);
		j2.setBounds(560,370,1200,30);
		c.add(j2);
		
		btn2 = new JButton("CALL");
        btn2.setBounds(500, 210, 100, 30);
        btn2.setFont(f2);
     
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#00C000"));
        c.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till she arrives.");   
            }else {
				
			}
			}});
		
		btn3 = new JButton("Price");
        btn3.setBounds(610, 210, 100, 30);
        btn3.setFont(f3);
        
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00060"));
        c.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"3$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment1 hm = new payment1();
						hm.setVisible(true);
					}
					else {
						
					}
		   
            }
			});
		
		
		
		btn4 = new JButton("Info");
        btn4.setBounds(720, 210, 100, 30);
        btn4.setFont(f2);
      
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#0000C0"));
        c.add(btn4);
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				BikeDriver1 hm = new BikeDriver1();
						hm.setVisible(true);
			   
            }
			});
		
		btn5 = new JButton("CALL");
        btn5.setBounds(560, 410, 100, 30);
        btn5.setFont(f2);
        
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#00C000"));
        c.add(btn5);
		
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till he arrives.");   
            }else {
				
			}
			}});
		
		btn6 = new JButton("Price");
        btn6.setBounds(670, 410, 100, 30);
        btn6.setFont(f3);
       
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00060"));
        c.add(btn6);
		
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"300$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment1 hm = new payment1();
						hm.setVisible(true);
					}
					else {
						
					}
	
            }
			});
		
		btn7 = new JButton("Info");
        btn7.setBounds(780, 410, 100, 30);
        btn7.setFont(f2);
      
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#0000C0"));
        c.add(btn7);
		
		btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				
			BikeDriver3 hm = new BikeDriver3();
						hm.setVisible(true);	
			
            }
			});
		
		logo = new ImageIcon(getClass().getResource("/pic/logox.gif"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0,logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
	}
	public static void main(String[] args) {
        bike frame = new bike();
        frame.setVisible(true);
    }
}
