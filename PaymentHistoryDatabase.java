import java.sql.*;

public class PaymentHistoryDatabase {
    private Connection connection;
    
   
    public void connect() {
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/payment_history", "root", "Mahfuz@5101912");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public void savePaymentHistory(String cardHolderName, String cardNumber, String validOn, String cvvCode, String paymentStatus) {
        String query = "INSERT INTO payment_history (card_holder_name, card_number, valid_on, cvv_code, payment_status) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, cardHolderName);
            stmt.setString(2, cardNumber);
            stmt.setString(3, validOn);
            stmt.setString(4, cvvCode);
            stmt.setString(5, paymentStatus);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
