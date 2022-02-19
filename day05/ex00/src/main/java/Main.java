import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final String DB_URL = "jdbc:postgresql://localhost:5432/testdb";
    private static final String DB_USER = "postgres";
    private static final String DB_PWD = "postgres";
    private static final String DB_SCHEMA = "schema.sql";
    private static final String DB_DATA = "data.sql";

public static void main(String[] args) throws FileNotFoundException {
        Connection connection = connect();
        System.out.println("Creating tables...");
        runQueriesFromFile(connection, DB_SCHEMA);
        System.out.println("Tables created!");
        System.out.println("Populating tables!");
        runQueriesFromFile(connection, DB_DATA);
        System.out.println("Data inserted");
    }

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PWD);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found " + e.getMessage());
        }
        return conn;
    }

    public static void runQueriesFromFile(Connection connection, String filename) throws FileNotFoundException {
        Scanner scanner = new Scanner(
                new File(System.getProperty("user.dir") + "/../../ressources/" + filename))
                .useDelimiter(";");
        try {
            while (scanner.hasNext()) {
                connection.createStatement().execute(scanner.next().trim());
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        }
        scanner.close();
    }
}
