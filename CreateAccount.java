import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.sql.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class CreateAccount implements ActionListener {
    JFrame CreateAccountframe;
    JLabel firstNameLabel;
    JLabel lastNameLabel;
    JLabel userNameLabel2;
    JLabel emailLabel;
    JLabel phoneNmbrLabel;
    JLabel passwordLabel2;
    JLabel CreateAccountPageImg;
    JLabel CreateAccountPageText;
    JLabel userLogo;
    JLabel passLogo;
    JLabel frameImage;
    JPanel leftPanel;
    Container c;
    JTextField firstNameText;
    JTextField lastNameText;
    JTextField userNameTextr;
    JTextField passwordTextr;
    JTextField emailText;
    JTextField phoneNmbrTextField;
    JButton signupr, btn1;
    Font font, f2;
    ImageIcon icon;

    CreateAccount() {
        CreateAccountframe = new JFrame();
        icon = new ImageIcon("Images/FrameIcon.png");
        CreateAccountframe.setIconImage(icon.getImage());
        CreateAccountframe.getContentPane().setBackground(Color.decode("#fbca0b"));

        btn1 = new JButton("Back");
        btn1.setBounds(20, 500, 100, 30);
        btn1.setFont(f2);
        btn1.setFocusable(true);
        btn1.setForeground(Color.BLACK);
        btn1.setBackground(Color.RED);
        CreateAccountframe.add(btn1);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                LoginPage us = new LoginPage();
                us.setVisible(true);
            }
        });

        leftPanel = new JPanel();
        leftPanel.setBounds(10, 40, 500, 703);
        leftPanel.setBackground(Color.decode("#fbca0b"));
        CreateAccountframe.add(leftPanel);

        frameImage = new JLabel("");
        Image frameimg = new ImageIcon(this.getClass().getResource("Images/pic1.png")).getImage();
        frameImage.setIcon(new ImageIcon(frameimg));
        frameImage.setBounds(0, -20, 480, 600);
        leftPanel.add(frameImage);

        f2 = new Font("Rockwell Extra Bold", Font.PLAIN, 18);
        Font headerText = new Font("Williesh", Font.BOLD, 28);
        firstNameLabel = new JLabel("Enter Your First Name");
        firstNameLabel.setBounds(590, 60, 150, 25);
        firstNameLabel.setForeground(Color.black);
        lastNameLabel = new JLabel("Enter Your Last Name");
        lastNameLabel.setBounds(590, 120, 150, 25);
        lastNameLabel.setForeground(Color.black);
        userNameLabel2 = new JLabel("Enter Username");
        userNameLabel2.setBounds(590, 180, 150, 25);
        userNameLabel2.setForeground(Color.black);
        passwordLabel2 = new JLabel("Password");
        passwordLabel2.setBounds(590, 240, 150, 25);
        passwordLabel2.setForeground(Color.black);
        emailLabel = new JLabel("E-mail");
        emailLabel.setBounds(590, 300, 150, 25);
        emailLabel.setForeground(Color.black);
        phoneNmbrLabel = new JLabel("Contact Number");
        phoneNmbrLabel.setBounds(590, 360, 150, 25);
        phoneNmbrLabel.setForeground(Color.black);
        CreateAccountPageText = new JLabel("Create Account");
        CreateAccountPageText.setBounds(600, 0, 230, 60);
        CreateAccountPageText.setFont(headerText);
        CreateAccountPageText.setForeground(Color.BLACK);

        firstNameText = new JTextField();
        firstNameText.setBounds(590, 80, 240, 35);
        lastNameText = new JTextField();
        lastNameText.setBounds(590, 140, 240, 35);
        userNameTextr = new JTextField();
        userNameTextr.setBounds(590, 200, 240, 35);

        passwordTextr = new JPasswordField();
        passwordTextr.setBounds(590, 260, 240, 35);
        emailText = new JTextField();
        emailText.setBounds(590, 320, 240, 35);
        phoneNmbrTextField = new JTextField();
        phoneNmbrTextField.setBounds(590, 380, 240, 35);

        signupr = new JButton("Sign Up");
        signupr.setBounds(590, 440, 240, 35);
        signupr.setBackground(Color.RED);

        CreateAccountPageImg = new JLabel();
        CreateAccountPageImg.setIcon(new ImageIcon(""));
        CreateAccountPageImg.setBounds(0, -290, 1902, 1076);
        CreateAccountframe.add(firstNameLabel);
        CreateAccountframe.add(lastNameLabel);
        CreateAccountframe.add(userNameLabel2);
        CreateAccountframe.add(passwordLabel2);
        CreateAccountframe.add(emailLabel);
        CreateAccountframe.add(phoneNmbrLabel);
        CreateAccountframe.add(CreateAccountPageText);
        CreateAccountframe.add(firstNameText);
        CreateAccountframe.add(lastNameText);
        CreateAccountframe.add(userNameTextr);
        CreateAccountframe.add(passwordTextr);
        CreateAccountframe.add(emailText);
        CreateAccountframe.add(phoneNmbrTextField);
        CreateAccountframe.add(signupr);
        CreateAccountframe.add(CreateAccountPageImg);
        CreateAccountframe.setTitle("Ride Xpress | Create Account");
        CreateAccountframe.setSize(960, 600);
        CreateAccountframe.setLocationRelativeTo(null);
        CreateAccountframe.setLayout(null);
        CreateAccountframe.setVisible(true);
        CreateAccountframe.setResizable(false);
        CreateAccountframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        signupr.addActionListener(this);
    }

<<<<<<< HEAD
    
    private Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/ridexpress";
        String user = "root"; 
        String password = "Mahfuz@5101912";
=======
    // Database connection method
    private Connection connectToDatabase() {
        String url = "jdbc:mysql://localhost:3306/ridexpress"; // Replace with your database details
        String user = "root"; // Replace with your MySQL username
        String password = "Mahfuz@5101912"; // Replace with your MySQL password
>>>>>>> 330a6e2ca53f9204d940975e187b169aa598d7ae
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            showMessageDialog(null, "Database connection failed: " + e.getMessage());
            return null;
        }
    }

<<<<<<< HEAD
   
=======
    // ActionListener to handle the sign-up button click
>>>>>>> 330a6e2ca53f9204d940975e187b169aa598d7ae
    public void actionPerformed(ActionEvent e) {
        String fname = firstNameText.getText();
        String lname = lastNameText.getText();
        String uname = userNameTextr.getText();
        String pass = passwordTextr.getText();
        String cnumber = phoneNmbrTextField.getText();
        String mail = emailText.getText();

        if (e.getSource() == signupr) {
            if (fname.isEmpty() || lname.isEmpty() || uname.isEmpty() || pass.isEmpty() || cnumber.isEmpty() || mail.isEmpty()) {
                showMessageDialog(null, "Please fill up all information");
            } else {
                // Database Insert
                Connection conn = connectToDatabase();
                if (conn != null) {
                    try {
                        String sql = "INSERT INTO users (first_name, last_name, username, password, email, phone_number) VALUES (?, ?, ?, ?, ?, ?)";
                        PreparedStatement stmt = conn.prepareStatement(sql);
                        stmt.setString(1, fname);
                        stmt.setString(2, lname);
                        stmt.setString(3, uname);
                        stmt.setString(4, pass);
                        stmt.setString(5, mail);
                        stmt.setString(6, cnumber);
<<<<<<< HEAD
=======

>>>>>>> 330a6e2ca53f9204d940975e187b169aa598d7ae
                        stmt.executeUpdate();
                        showMessageDialog(null, "Account Created Successfully");
                        CreateAccountframe.setVisible(false);
                        new LoginPage();
                    } catch (SQLException ex) {
                        showMessageDialog(null, "Error: " + ex.getMessage());
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        new CreateAccount();
    }
}
