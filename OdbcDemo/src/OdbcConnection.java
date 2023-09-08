import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OdbcConnection {

    private static final String DRIVER_CLASS = "sun.jdbc.odbc.JdbcOdbcDriver";
    private static final String URL = "jdbc:odbc:?";
    private static final String USERNAME = "?";
    private static final String PASSWORD = "?";

    public static Connection getConnection() throws SQLException {
        Connection conn = null;

        try {
            Class.forName(DRIVER_CLASS);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            System.out.println("Connection Successful");  

        } catch (ClassNotFoundException e) {
            System.out.println("Error: Driver class not found");
        }

        return conn;
    }
    public static void main(String[] args) throws SQLException {
        Connection con = getConnection();
        con.close();

    }
}