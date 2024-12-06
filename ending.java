import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ending extends JFrame {

    private Container c;
    private ImageIcon icon, logo,logo2, Vehicle;
    private JLabel imgLabel;
    private Font f1,f2,f3;
    private JButton btn1;
   

	ending() {
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
		
		btn1 = new JButton("Close");
        btn1.setBounds(440, 500, 100, 30);
        btn1.setFont(f2);
        //btn1.setCursor(cursor);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.RED);
        c.add(btn1);
		
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
				System.exit(0);
            }
        });
		
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
               
            }
	});
		
		logo = new ImageIcon(getClass().getResource("/pic/logoxc.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0,logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
	}
	public static void main(String[] args) {

        ending frame = new ending();
        frame.setVisible(true);
    }
}