package Office;
import java.sql.*;

import java.util.Scanner;

public class MySqlConnection {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/OfficeSystem";
    private static final String USER = "root";
    private static final String PASSWORD = "ritesh123";
    private static Connection conn = null;
    private static Scanner scanner = new Scanner(System.in);

    public static void openConnection() {
        try {
            setConn(DriverManager.getConnection(URL, USER, PASSWORD));
            System.out.println("Connected to the database!");
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }

    public static void closeConnection() {
        try {
            if (getConn() != null && !getConn().isClosed()) {
                getConn().close();
                System.out.println("Connection closed.");
            }
        } catch (SQLException e) {
            System.out.println("Failed to close connection!");
            e.printStackTrace();
        }
    }

    public static String loginAndGetRole() {
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        String sql = "SELECT role FROM username WHERE username = ? AND password = ?";
        try (PreparedStatement pstmt = getConn().prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");
                System.out.println("Login successful! Your role is: " + role);
                return role;
            } else {
                System.out.println("Invalid username or password. Logging out...");
                return null;
            }
        } catch (SQLException e) {
            System.out.println("Error during login!");
            e.printStackTrace();
            return null;
        }
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        MySqlConnection.conn = conn;
    }
} 
