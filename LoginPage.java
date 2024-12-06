import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class LoginPage extends JFrame implements ActionListener {
    ImageIcon icon;
    JLabel username, password, loginMsg, frameImage;
    JPanel leftPanel;
    JButton loginButton, resetButton;
    JTextField usernameField;
    JPasswordField userPasswordField;
    Font font;
    
    public LoginPage() {
        font = new Font("Lost Signal", Font.PLAIN, 23);
        this.setTitle("Ride Xpress Presented By S.A. Mahfuz");
        this.setSize(960, 600);
        this.setLayout(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        icon = new ImageIcon("Images/FrameIcon.png");
        this.setIconImage(icon.getImage());
        this.getContentPane().setBackground(Color.decode("#fbca0b"));
        leftPanel = new JPanel();
        leftPanel.setBounds(0, -30, 500, 703);
        leftPanel.setBackground(Color.decode("#99ebff"));
        this.add(leftPanel);
        
        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("/Images/Booking.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 480, 600);
        leftPanel.add(frameImage);
        
        username = new JLabel("Username:");
        username.setBounds(510, 190, 247, 32);
        username.setForeground(Color.BLACK);
        username.setFont(font);
        this.add(username);
        
        password = new JLabel("Password:");
        password.setBounds(510, 260, 247, 32);
        password.setForeground(Color.BLACK);
        password.setFont(font);
        this.add(password);
        
        loginMsg = new JLabel();
        loginMsg.setBounds(635, 400, 450, 32);
        loginMsg.setForeground(Color.BLACK);
        loginMsg.setFont(new Font("System", Font.BOLD, 18));
        this.add(loginMsg);
        
        usernameField = new JTextField();
        usernameField.setBounds(635, 194, 285, 32);
        usernameField.setFont(font);
        this.add(usernameField);
        
        userPasswordField = new JPasswordField();
        userPasswordField.setBounds(635, 264, 285, 32);
        userPasswordField.setFont(font);
        this.add(userPasswordField);
        
        loginButton = new JButton("Log In");
        loginButton.setBounds(670, 334, 100, 35);
        loginButton.setBackground(Color.decode("#e8bd13"));
        loginButton.setFont(new Font("System", Font.BOLD, 16));
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);
        this.add(loginButton);
        
        resetButton = new JButton("SignUp");
        resetButton.setBounds(800, 334, 100, 35);
        resetButton.setBackground(Color.decode("#e8bd13"));
        resetButton.setFont(new Font("System", Font.BOLD, 16));
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);
        this.add(resetButton);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == resetButton) {
            CreateAccount ca = new CreateAccount();
        }
        
        if (e.getSource() == loginButton) {
            String user = usernameField.getText();
            String pass = new String(userPasswordField.getPassword());
            
            if (user.isEmpty() || pass.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please Enter Username and Password");
            } else {
               
                String url = "jdbc:mysql://localhost:3306/ridexpress"; 
                String dbUsername = "root"; 
                String dbPassword = "Mahfuz@5101912";
                
                try {
                    
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(url, dbUsername, dbPassword);
                    
                    
                    String query = "SELECT * FROM users WHERE username = ? AND password = ?";
                    PreparedStatement stmt = conn.prepareStatement(query);
                    stmt.setString(1, user);
                    stmt.setString(2, pass);
                    
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        loginMsg.setText("Login successful!");
                        homeus hm = new homeus(); 
                        hm.setVisible(true);
                        this.dispose();
                    } else {
                        loginMsg.setText("Incorrect username or password");
                    }
                    conn.close();
                } catch (SQLException | ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(null, "Error connecting to database", "Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        new LoginPage().setVisible(true);
    }
}
