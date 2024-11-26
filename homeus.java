import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class homeus extends JFrame{
	private Container c;
	private JLabel j1, j2, imgLabel,j3,f;
	private Font f1, f2;
	private ImageIcon icon, logo;
	private JComboBox c1, c2;
	private JButton btn1, btn2,nBtn;
	private String[] place = {"From","Adabar","Badda","Bangsal", "Bimanbandar", "Cantonment", "Chowkbazar", "Darus Salam", "Demra","Dhakshinkhan", "Dhanmondi","Gendaria", "Gulshan", "Hatirjheel", "Hazaribagh","Jatrabari", "Kadamtali", "Kafrul", "Kalabagan","Kamrangirchar","Khilgaon", "Khilkhet", "Kotwali", "Lalbagh", "Mirpur", "Model", "Mohammadpur", "Motijheel", "New Market","Pallabi","Paltan" ,"Ramna", "Rampura", "Sabujbagh", "Shah Ali", "Shahbag", "Shahjahanpur", "Sher-e-Bangla", "Nagar" ,"Shyampur" ,"Sutrapur", "Tejgaon", "Industrial Area","Ashulia" ,"Tejgaon", "Turag","Uttar","Vatara","Bashundhara","Mirpur-12"};
	private String[] place2 = {"To","Adabar","Badda","Bangsal", "Bimanbandar", "Cantonment", "Chowkbazar", "Darus Salam", "Demra","Dhakshinkhan", "Dhanmondi","Gendaria", "Gulshan", "Hatirjheel", "Hazaribagh","Jatrabari", "Kadamtali", "Kafrul", "Kalabagan","Kamrangirchar","Khilgaon", "Khilkhet", "Kotwali", "Lalbagh", "Mirpur", "Model", "Mohammadpur", "Motijheel", "New Market","Pallabi","Paltan" ,"Ramna", "Rampura", "Sabujbagh", "Shah Ali", "Shahbag", "Shahjahanpur", "Sher-e-Bangla", "Nagar" ,"Shyampur" ,"Sutrapur", "Tejgaon", "Industrial Area","Ashulia" ,"Tejgaon", "Turag","Uttar","Vatara","Bashundhara","Mirpur-12"};
	
	homeus(){
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
		
		
		
		j1 = new JLabel("Where do you want to go?");
		j1.setBounds(50,80,450,50);
		j1.setForeground(Color.yellow);
		j1.setFont(f1);
		c.add(j1);
		
		j2 = new JLabel("Please Select your Destination");
		j2.setForeground(Color.green);
		j2.setBounds(50,130,500,50);
		j2.setFont(f2);
		c.add(j2);
		
		c1 = new JComboBox(place);
		c1.setBackground(Color.blue);
		c1.setForeground(Color.black);
		c1.setBounds(150,220,100,30);
		c1.setEditable(true);
		c.add(c1);
		
		c2 = new JComboBox(place2);
		c2.setBounds(150,290,100,30);
		c2.setBackground(Color.green);
		c2.setEditable(true);
		c2.setForeground(Color.blue);
		c.add(c2);
		
		
		
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
                LoginPage us = new LoginPage();
                us.setVisible(true);
                
            }
        });
		
		
		
		
		
		btn2 = new JButton("GO");
        btn2.setBounds(250, 500, 150, 30);
        btn2.setFont(f2);
      
        btn2.setForeground(Color.BLACK);
        btn2.setBackground(Color.RED);
        c.add(btn2);
		
		
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Vehicle us = new Vehicle();
                us.setVisible(true);
               
            }
        });
		
		logo = new ImageIcon(getClass().getResource("/pic/logo1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(560, -180, 500, 900);
        c.add(imgLabel);
		
		logo = new ImageIcon(getClass().getResource("/pic/logom.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0,logo.getIconWidth(), logo.getIconHeight());
        c.add(imgLabel);
		
		 nBtn = new JButton("");
        nBtn.setBounds(0, 0, 0, 0);
        c.add(nBtn);
	}
	
	public static void main(String [] args){
		homeus hm = new homeus();
		hm.setVisible(true);
	}
	
}