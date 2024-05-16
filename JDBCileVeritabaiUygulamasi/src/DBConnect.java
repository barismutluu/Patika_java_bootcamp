import java.sql.*;


public class DBConnect {
    public static final String DB_URL = "jdbc:mysql://localhost/sirket";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "mysql";

    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        try {
            conn = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            st = conn.createStatement();
            ResultSet resultSet = st.executeQuery("SELECT * FROM calisanlar");
            while (resultSet.next()) {
                System.out.println("ID : " + resultSet.getInt("calisan_id"));
                System.out.println("Adı : " + resultSet.getString("calisan_adi"));
                System.out.println("Soyadı : " + resultSet.getString("calisan_soyadi"));
                System.out.println("#################");
            }
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

}
