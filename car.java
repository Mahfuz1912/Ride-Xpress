import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class car extends JFrame {
    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel,imgLabel2,j1,j2,j3,j4;
    private Font f1,f2,f3;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8,btn9, nBtn,btn10,btn11,btn12,btn13;
    
	car() {
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
        btn1.setBounds(30, 10, 100, 30);
        btn1.setFont(f2);
		btn1.setFocusable(true);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Vehicle us = new Vehicle();
                us.setVisible(true);
                setVisible(false);
            }
        });
		
		j1 = new JLabel("Driver: 1 | Car Model: Honda");
		j1.setFont(f2);
		j1.setBackground(Color.white);
		j1.setForeground(Color.white);
		j1.setBounds(150,320,1000,30);
		c.add(j1);
		
		j2 = new JLabel("Driver: 2 | Car Model: BMW");
		j2.setFont(f2);
		j2.setBackground(Color.white);
		j2.setForeground(Color.white);
		j2.setBounds(150,450,1000,30);
		c.add(j2);
		
		j3 = new JLabel("Driver: 3 | Car Model: Lambo");
		j3.setFont(f2);
		j3.setBackground(Color.white);
		j3.setForeground(Color.white);
		j3.setBounds(610,450,1000,30);
		c.add(j3);
		
		j4 = new JLabel("Driver: 4 | Car Model: GTR");
		j4.setFont(f2);
		j4.setBackground(Color.white);
		j4.setForeground(Color.white);
		j4.setBounds(610,320,1000,30);
		c.add(j4);
		
		
		
		btn2 = new JButton("CALL");
        btn2.setBounds(150, 360, 100, 30);
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
		
		btn10 = new JButton("Price");
        btn10.setBounds(260, 360, 100, 30);
        btn10.setFont(f3);
        btn10.setForeground(Color.WHITE);
        btn10.setBackground(Color.decode("#C00060"));
        c.add(btn10);
		
		btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"5$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment hm = new payment();
						hm.setVisible(true);
					}
					else {
						
					}
            }
			});
		
		
		
		btn3 = new JButton("Info");
        btn3.setBounds(370, 360, 100, 30);
        btn3.setFont(f2);
        btn3.setForeground(Color.WHITE);
        btn3.setBackground(Color.decode("#0000C0"));
        c.add(btn3);
		
		btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CarDriver1 hm = new CarDriver1();
						hm.setVisible(true);
            }
			});
		
		btn4 = new JButton("CALL");
        btn4.setBounds(150, 490, 100, 30);
        btn4.setFont(f2);
        btn4.setForeground(Color.WHITE);
        btn4.setBackground(Color.decode("#00C000"));
        c.add(btn4);
		
		btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till he arrives.");   
            }else {
				
			}
			}});
		
		btn11 = new JButton("Price");
        btn11.setBounds(260, 490, 100, 30);
        btn11.setFont(f3);
        btn11.setForeground(Color.WHITE);
        btn11.setBackground(Color.decode("#C00060"));
        c.add(btn11);
		
		btn11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"10$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment hm = new payment();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		btn5 = new JButton("Info");
        btn5.setBounds(370, 490, 100, 30);
        btn5.setFont(f2);
        btn5.setForeground(Color.WHITE);
        btn5.setBackground(Color.decode("#0000C0"));
        c.add(btn5);
		
		btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CarDriver2 hm = new CarDriver2();
						hm.setVisible(true);
            }
			});
		btn6 = new JButton("CALL");
        btn6.setBounds(610, 490, 100, 30);
        btn6.setFont(f2);
        btn6.setForeground(Color.WHITE);
        btn6.setBackground(Color.decode("#00C000"));
        c.add(btn6);
		
		btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int conf = JOptionPane.showConfirmDialog(null, "You sure, You want to call this Driver?","Confirm Your Ride", JOptionPane.YES_NO_OPTION);
				if (conf == 0 ){
			JOptionPane.showMessageDialog(null, "Thank you..Please wait till he arrives.");   
            }else {
				
			}
			}});
		
		btn12 = new JButton("Price");
        btn12.setBounds(720, 490, 100, 30);
        btn12.setFont(f3);
        //btn2.setCursor(cursor);
        btn12.setForeground(Color.WHITE);
        btn12.setBackground(Color.decode("#C00060"));
        c.add(btn12);
		
		btn12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"25$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment hm = new payment();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		btn7 = new JButton("Info");
        btn7.setBounds(830, 490, 100, 30);
        btn7.setFont(f2);
       
        btn7.setForeground(Color.WHITE);
        btn7.setBackground(Color.decode("#C00300"));
        c.add(btn7);
		
		btn7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CarDriver4 hm = new CarDriver4();
						hm.setVisible(true);
				
			
            }
			});
		
		btn8 = new JButton("CALL");
        btn8.setBounds(610, 360, 100, 30);
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
		
		btn13 = new JButton("Price");
        btn13.setBounds(720, 360, 100, 30);
        btn13.setFont(f3);s
        btn13.setForeground(Color.WHITE);
        btn13.setBackground(Color.decode("#C00060"));
        c.add(btn13);
		
		btn13.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				int comf1 = JOptionPane.showConfirmDialog(null,"30$ per KM for this Ride. Want to pay now?","Pay up",JOptionPane.YES_NO_OPTION);
					if (comf1 == 0){
						payment hm = new payment();
						hm.setVisible(true);
					}
					else {
						
					} 
            }
			});
		
		btn9 = new JButton("Info");
        btn9.setBounds(830, 360, 100, 30);
        btn9.setFont(f2);
       
        btn9.setForeground(Color.WHITE);
        btn9.setBackground(Color.decode("#C00300"));
        c.add(btn9);
		
		btn9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				CarDriver3 hm = new CarDriver3();
						hm.setVisible(true);
				
			
            }
			});
		
		logo = new ImageIcon(getClass().getResource("/pic/logo5.gif"));
        imgLabel = new JLabel(logo);
		imgLabel.setSize(960,600);
       
        c.add(imgLabel);
	}
		
		public static void main(String[] args) {
        car frame = new car();
        frame.setVisible(true);
    }
}