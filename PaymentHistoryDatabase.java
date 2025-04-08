import java.sql.*;

public class PaymentHistoryDatabase {
    private Connection connection;

    // Database-এ সংযোগ স্থাপন করার জন্য মেথড
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ride_xpress", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // **CVV সহ Payment History সংরক্ষণের জন্য মেথড**
  public void savePaymentHistory(String cardHolderName, String cardNumber, String validOn, String cvvCode, String paymentStatus) {
    String query = "INSERT INTO payment_history (card_holder_name, card_number, valid_on, cvv_code, payment_status) VALUES (?, ?, ?, ?, ?)";

    try (PreparedStatement stmt = connection.prepareStatement(query)) {
        stmt.setString(1, cardHolderName);
        stmt.setString(2, encryptCardNumber(cardNumber)); // এনক্রিপ্ট করা হয়েছে
        stmt.setString(3, validOn);
        stmt.setString(4, cvvCode);
        stmt.setString(5, paymentStatus);
        
        stmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}


    // **কার্ড নম্বর এনক্রিপ্ট করার মেথড** (ডেমো এনক্রিপশন)
    private String encryptCardNumber(String cardNumber) {
        return "****" + cardNumber.substring(cardNumber.length() - 4); // শেষ ৪ সংখ্যা রেখে বাকিটা হাইড করা
    }

    // **সংযোগ বন্ধ করার মেথড**
    public void closeConnection() {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
