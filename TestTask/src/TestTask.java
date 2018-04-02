import java.sql.*;

public class TestTask {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/test?useSSL=false";
        String user = "root";
        String password = "repmvf";
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement()) {
            System.out.println("Connected to DB");

            statement.executeUpdate("USE test;");
            // statement.executeUpdate("DROP TABLE test;");
            // Подключаюсь к существующей БД (предварительно создал её в MySQL WorkBench)
            //statement.executeUpdate("CREATE TABLE test (id INT AUTO_INCREMENT primary KEY, name VARCHAR(255) NOT NULL );");
           // statement.executeUpdate("INSERT INTO test(name) VALUES ('Andrey');");
          //  statement.executeUpdate("INSERT INTO test(name) VALUES ('EGOR');");
         ///   statement.executeUpdate("INSERT INTO test(name) VALUES ('John');");
         //   statement.execute("SELECT * FROM test;");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM test;");
            while (resultSet.next()) {
                System.out.printf(" %d %s", resultSet.getInt("id"), resultSet.getString("name")
                        + System.lineSeparator());
            }
        }
    }
}
