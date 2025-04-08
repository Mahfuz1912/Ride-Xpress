import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/ride_xpress";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("MySQL JDBC Driver not found", e);
        }
    }
    
    public static BikeDriver getBikeDriver(int driverId) {
        BikeDriver driver = null;
        String query = "SELECT * FROM bike_drivers WHERE id = ?";
        
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            
            stmt.setInt(1, driverId);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                driver = new BikeDriver(
                    rs.getInt("id"),
                    rs.getString("driver_id"),
                    rs.getString("first_name"),
                    rs.getString("last_name"),
                    rs.getString("license_issue"),
                    rs.getString("license_expire"),
                    rs.getString("bike_model"),
                    rs.getDouble("price_per_km"),
                    rs.getString("signature_name")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return driver;
    }
}