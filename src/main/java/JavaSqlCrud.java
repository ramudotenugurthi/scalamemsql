import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class JavaSqlCrud {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/TEST"; // Replace with your database URL
        String user = "root"; // Replace with your database username
        String password = "root"; // Replace with your database password

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();

            // Create a table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS emp ("
                    + " emp_id INT AUTO_INCREMENT PRIMARY KEY, "
                    + " first_name VARCHAR(50), "
                    + " last_name VARCHAR(50), "
                    + " email VARCHAR(100), "
                    + " hire_date DATE, "
                    + " salary DECIMAL(10, 2) "
                    + ")";

            statement.executeUpdate(createTableSQL);
            System.out.println("Table created successfully.");

            // Insert a value
            String insertSQL = "INSERT INTO emp (first_name, last_name, email, hire_date, salary) "
                    + "VALUES ('John', 'Doe', 'john.doe@example.com', '2024-08-18', 50000.00)";

            statement.executeUpdate(insertSQL);
            System.out.println("Record inserted successfully.");

            // Select values
            String selectSQL = "SELECT * FROM emp";
            ResultSet resultSet = statement.executeQuery(selectSQL);
            System.out.println("Records from table:");
            while (resultSet.next()) {
                int empId = resultSet.getInt("emp_id");
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                String email = resultSet.getString("email");
                java.sql.Date hireDate = resultSet.getDate("hire_date");
                java.math.BigDecimal salary = resultSet.getBigDecimal("salary");
                System.out.println("ID: " + empId + ", Name: " + firstName + " " + lastName +
                        ", Email: " + email + ", Hire Date: " + hireDate + ", Salary: " + salary);
            }

            // Drop the table
            String dropTableSQL = "DROP TABLE IF EXISTS emp";
            statement.executeUpdate(dropTableSQL);
            System.out.println("Table dropped successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}