import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class payment1 extends JFrame {

    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel,imgLabel2,j1,j2,j3,j4,label3;
    private Font f1,f2,f3;
    private JButton btn1, btn2,btn10;
	private JTextField tf1,tf2,tf3,pf;
    //private Cursor cursor;

 payment1() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Taxi Booking");
        this.setSize(960, 600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
		
		
		c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.decode("#fbca0b"));
		
		f1 = new Font("Rockwell Extra Bold", Font.BOLD, 25);
		f2 = new Font("Rockwell Extra Bold", Font.BOLD, 18);
		f3 = new Font("Rockwell Extra Bold", Font.BOLD, 27);
		
		icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        this.setIconImage(icon.getImage());
		
		label3 = new JLabel("Card details:");
        label3.setBounds(540, 150, 500, 50);
        label3.setFont(f3);
        c.add(label3);
		
		j1 = new JLabel("Holder Name:");
        j1.setBounds(350, 200, 500, 50);
        j1.setFont(f2);
        c.add(j1);
		
		
		tf2 = new JTextField();
        tf2.setBounds(520, 210, 235, 30);
        tf2.setFont(f2);
        tf2.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf2);
		
		j1 = new JLabel("Card Number:");
        j1.setBounds(350, 250, 500, 50);
        j1.setFont(f2);
        c.add(j1);
		
		tf1 = new JTextField();
        tf1.setBounds(520, 260, 235, 30);
        tf1.setFont(f2);
        tf1.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf1);
		
		label3 = new JLabel("Valid On:");
        label3.setBounds(350, 310, 500, 50);
        label3.setFont(f2);
        c.add(label3);
		
		tf3 = new JTextField();
        tf3.setBounds(460, 320, 90, 30);
        tf3.setFont(f2);
        tf3.setHorizontalAlignment(JTextField.CENTER);
        c.add(tf3);
		
		label3 = new JLabel("CVV Code");
        label3.setBounds(570, 310, 500, 50);
        label3.setFont(f2);
        c.add(label3);

        pf = new JPasswordField();
        pf.setBounds(690, 320, 80, 30);
        pf.setHorizontalAlignment(JPasswordField.CENTER);
       // pf.setEchoChar('*');
        pf.setFont(f2);
        c.add(pf);
		
		btn2 = new JButton("PAY");
        btn2.setBounds(550, 380, 100, 30);
        btn2.setFont(f2);
		btn2.setFocusable(true);
        //btn1.setCursor(cursor);
        btn2.setForeground(Color.WHITE);
        btn2.setBackground(Color.decode("#C05000"));
        c.add(btn2);
		
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
			JOptionPane.showMessageDialog(null, "Payment Complete!");   
            }
			});
			
			btn10 = new JButton("Done");
        btn10.setBounds(550, 430, 100, 30);
        btn10.setFont(f2);
        //btn2.setCursor(cursor);
        btn10.setForeground(Color.WHITE);
        btn10.setBackground(Color.decode("#0000C0"));
        c.add(btn10);
		
		btn10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				ending hm = new ending();
						hm.setVisible(true);
            }
			});
		
		btn1 = new JButton("Back");
        btn1.setBounds(30, 10, 100, 30);
        btn1.setFont(f2);
		btn1.setFocusable(true);
        //btn1.setCursor(cursor);
        btn1.setForeground(Color.WHITE);
        btn1.setBackground(Color.decode("#C00000"));
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {

                bike us = new bike();
                us.setVisible(true);
                setVisible(false);
            }
	});
	
	logo = new ImageIcon(getClass().getResource("/pic/logo9.png"));
        imgLabel = new JLabel(logo);
        
        c.add(imgLabel);
		imgLabel.setSize(logo.getIconWidth(), logo.getIconHeight());
}


		public static void main(String[] args) {
        payment1 frame = new payment1();
        frame.setVisible(true);
       }
	
}