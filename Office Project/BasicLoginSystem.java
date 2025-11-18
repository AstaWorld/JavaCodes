package Office;
import java.sql.*;
import java.util.Scanner;

public class BasicLoginSystem {
    static Scanner sc = new Scanner(System.in);
    static Connection conn;

    public static void main(String[] args) {
        MySqlConnection.openConnection();
        conn = MySqlConnection.getConn();

        String role = MySqlConnection.loginAndGetRole();
        if (role == null) {
            MySqlConnection.closeConnection();
            return;
        }

        if (role.equalsIgnoreCase("Admin")) {
            adminMenu();
        } else if (role.equalsIgnoreCase("Employee")) {
            employeeMenu();
        } else {
            System.out.println("Invalid role");
        }

        MySqlConnection.closeConnection();
    }

    public static void adminMenu() {
        while (true) {
            System.out.println("\n--- ADMIN MENU ---");
            System.out.println("1. Insert Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. View All Employees");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> insertEmployee();
                case 2 -> updateEmployee();
                case 3 -> deleteEmployee();
                case 4 -> viewAllEmployees();
                case 5 -> {
                    System.out.println("Logging out...");
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    public static void employeeMenu() {
        while (true) {
            System.out.println("\n--- EMPLOYEE MENU ---");
            System.out.println("1. View Your Info");
            System.out.println("2. Update Your Email/Mobile");
            System.out.println("3. Logout");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
            case 1:
                viewAllEmployees();
                break;
            case 2:
                updateEmployeeLimited();
                break;
            case 3:
                System.out.println("Logging out...");
                return;
            default:
                System.out.println("Invalid choice.");
                break;
           }

        }
    }

    public static void insertEmployee() {
        try {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter email: ");
            String email = sc.nextLine();
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();

            String sql = "INSERT INTO employees (name, email, salary) VALUES (?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setDouble(3, salary);
            stmt.executeUpdate();
            System.out.println("Employee inserted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployee() {
        try {
            System.out.print("Enter employee ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new name: ");
            String name = sc.nextLine();
            System.out.print("Enter new email: ");
            String email = sc.nextLine();
            System.out.print("Enter new salary: ");
            double salary = sc.nextDouble();

            String sql = "UPDATE employees SET name = ?, email = ?, salary = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setDouble(3, salary);
            stmt.setInt(4, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) System.out.println("Employee updated successfully.");
            else System.out.println("Employee not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deleteEmployee() {
        try {
            System.out.print("Enter employee ID to delete: ");
            int id = sc.nextInt();
            sc.nextLine();

            String sql = "DELETE FROM employees WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) System.out.println("✅ Employee deleted successfully.");
            else System.out.println("❌ Employee not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void viewAllEmployees() {
        try {
            String sql = "SELECT * FROM employees";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            System.out.println("\n--- EMPLOYEE LIST ---");
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        ", Name: " + rs.getString("name") +
                        ", Email: " + rs.getString("email") +
                        ", Salary: " + rs.getDouble("salary"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateEmployeeLimited() {
        try {
            System.out.print("Enter your employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new email: ");
            String email = sc.nextLine();

            String sql = "UPDATE employees SET email = ? WHERE id = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setInt(2, id);
            int rows = stmt.executeUpdate();
            if (rows > 0) System.out.println(" Email updated successfully.");
            else System.out.println(" Employee not found.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
