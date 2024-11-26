import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class cng extends JFrame {

    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel,imgLabel2,j1,j2,j3,j4;
    private Font f1,f2,f3;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, nBtn;
    private Cursor cursor;

	cng() {
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
        
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.RED);
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                Vehicle us = new Vehicle();
                us.setVisible(true);
                
            }
        });
		
		j1 = new JLabel("Driver: 1 | CNG Model: JEEP");
		j1.setFont(f2);
		j1.setBackground(Color.white);
		j1.setForeground(Color.black);
		j1.setBounds(300,40,1000,30);
		c.add(j1);
		
		j2 = new JLabel("Driver: 2 | CNG Model: Tata");
		j2.setFont(f2);
		j2.setBackground(Color.white);
		j2.setForeground(Color.black);
		j2.setBounds(450,200,1000,30);
		c.add(j2);
		
		j3 = new JLabel("Driver: 3 | CNG Model: Bajaj");
		j3.setFont(f2);
		j3.setBackground(Color.white);
		j3.setForeground(Color.black);
		j3.setBounds(300,370,1000,30);
		c.add(j3);
		
		
		
		
		btn2 = new JButton("CALL");
        btn2.setBounds(300, 76, 100, 30);
        btn2.setFont(f2);
        
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#00C000"));
        c.add(btn2);
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till he arrives.");   
            }else {
				
			}
			}});
		
		btn3 = new JButton("Price");
        btn3.setBounds(410, 76, 100, 30);
        btn3.setFont(f3);
        
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#C00060"));
        c.add(btn3);
		
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"32$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment2 hm = new payment2();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		
		
		btn4 = new JButton("Info");
        btn4.setBounds(520, 76, 100, 30);
        btn4.setFont(f2);
        
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#0000C0"));
        c.add(btn4);
		
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CngDriver hm = new CngDriver();
						hm.setVisible(true);
				
			   
            }
			});
		
		
		
		btn5 = new JButton("CALL");
        btn5.setBounds(450, 236, 100, 30);
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
        btn6.setBounds(560, 236, 100, 30);
        btn6.setFont(f3);
      
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#C00060"));
        c.add(btn6);
		
		
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"69$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment2 hm = new payment2();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		btn7 = new JButton("Info");
        btn7.setBounds(670, 236, 100, 30);
        btn7.setFont(f2);
        
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#0000C0"));
        c.add(btn7);
		
		btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CngDriver2 hm = new CngDriver2();
						hm.setVisible(true);
				
			   
            }
			});
		
		
		
		btn8 = new JButton("CALL");
        btn8.setBounds(300, 406, 100, 30);
        btn8.setFont(f2);
     
        btn8.setForeground(Color.WHITE);
        btn8.setBackground(Color.decode("#00C000"));
        c.add(btn8);
		
		
		btn8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till he arrives.");   
            }else {
				
			}
			}});
		
		btn9 = new JButton("Price");
        btn9.setBounds(410, 406, 100, 30);
        btn9.setFont(f3);
       
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(Color.decode("#C00060"));
        c.add(btn9);
		
		btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"8$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment2 hm = new payment2();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		btn10 = new JButton("Info");
        btn10.setBounds(520, 406, 100, 30);
        btn10.setFont(f2);
        //btn2.setCursor(cursor);
        btn10.setForeground(Color.WHITE);
        btn10.setBackground(Color.decode("#0000C0"));
        c.add(btn10);
		
		
		btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CngDriver3 hm = new CngDriver3();
						hm.setVisible(true);
				
			
            }
			});
		
		
		
		logo = new ImageIcon(getClass().getResource("/pic/logoc.gif"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0,logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		
	}
	public static void main(String[] args) {

        cng frame = new cng();
        frame.setVisible(true);
    }
}
