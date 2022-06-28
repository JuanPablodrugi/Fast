import java.sql.*;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("Witam serdecznie");

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/configs", "root", "");
            if (connection != null){
                System.out.println("Polaczono");
                Statement statement = connection.createStatement();
                String query = "INSERT INTO test(id, name)"
                        + " VALUES('4', 'Grzes')";
               statement.executeUpdate(query);
                System.out.println();
            } else {
                System.out.println("brak polaczenia");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
