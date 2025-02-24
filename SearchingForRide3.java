import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchingForRide3 extends JFrame {
	 private ImageIcon icon, logo;
	  private JLabel imgLabel;
	
    
    public SearchingForRide3() {
        
       super("Ride Xpress");

       icon = new ImageIcon(getClass().getResource("/Images/FrameIcon.png"));
        this.setIconImage(icon.getImage());
       
        setSize(960, 600);
        
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        setLayout(new BorderLayout());

      
        JLabel messageLabel = new JLabel("Searching for your ride, please wait...", JLabel.CENTER);
        messageLabel.setFont(new Font("Arial", Font.BOLD, 20));
        add(messageLabel, BorderLayout.NORTH);

		
		logo = new ImageIcon(getClass().getResource("/pic/logoq1.png"));
        imgLabel = new JLabel(logo);
        imgLabel.setBounds(0, 0,logo.getIconWidth(), logo.getIconHeight());
        add(imgLabel);

        
        JProgressBar progressBar = new JProgressBar();
        progressBar.setIndeterminate(true); 
        add(progressBar, BorderLayout.SOUTH);

        
        setLocationRelativeTo(null);

     
        Timer timer = new Timer(5000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                dispose();
                                
                new cng().setVisible(true);
            }
        });
        timer.setRepeats(false); 
        timer.start();
    }
    
    public static void main(String[] args) {
       
        SearchingForRide3 frame = new SearchingForRide3();
        
        
        frame.setVisible(true);
    }
}