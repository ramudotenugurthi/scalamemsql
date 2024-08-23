import java.sql.{Connection, DriverManager, Statement, ResultSet}

object MemSqlCrud {
  def main(args: Array[String]): Unit = {
    val url = "jdbc:mysql://localhost:3306/TEST" // Replace with your database URL
    val user = "root" // Replace with your database username
    val password = "root" // Replace with your database password

    System.out.println(" it is executing");
//    var connection: Connection = null
//    var statement: Statement = null
//
//    try {
//      // Load the MySQL JDBC driver
//      Class.forName("com.mysql.cj.jdbc.Driver")
//
//      // Establish the connection
//      connection = DriverManager.getConnection(url, user, password)
//      statement = connection.createStatement()
//
//      // Create a table
//      val createTableSQL = """
//        CREATE TABLE IF NOT EXISTS emp (
//          emp_id INT AUTO_INCREMENT PRIMARY KEY,
//          first_name VARCHAR(50),
//          last_name VARCHAR(50),
//          email VARCHAR(100),
//          hire_date DATE,
//          salary DECIMAL(10, 2)
//        )
//      """
//      statement.executeUpdate(createTableSQL)
//      println("Table created successfully.")
//
//      // Insert a value
//      val insertSQL = """
//        INSERT INTO emp (first_name, last_name, email, hire_date, salary)
//        VALUES ('John', 'Doe', 'john.doe@example.com', '2024-08-18', 50000.00)
//      """
//      statement.executeUpdate(insertSQL)
//      println("Record inserted successfully.")
//
//      // Select values
//      val selectSQL = "SELECT * FROM emp"
//      val resultSet: ResultSet = statement.executeQuery(selectSQL)
//      println("Records from table:")
//      while (resultSet.next()) {
//        val empId = resultSet.getInt("emp_id")
//        val firstName = resultSet.getString("first_name")
//        val lastName = resultSet.getString("last_name")
//        val email = resultSet.getString("email")
//        val hireDate = resultSet.getDate("hire_date")
//        val salary = resultSet.getBigDecimal("salary")
//        println(s"ID: $empId, Name: $firstName $lastName, Email: $email, Hire Date: $hireDate, Salary: $salary")
//      }
//
//      // Drop the table
//      val dropTableSQL = "DROP TABLE IF EXISTS emp"
//      statement.executeUpdate(dropTableSQL)
//      println("Table dropped successfully.")
//
//    } catch {
//      case e: Exception => e.printStackTrace()
//    } finally {
//      // Close resources
//      if (statement != null) statement.close()
//      if (connection != null) connection.close()
//    }
  }
}
