package conection;

/**
 *
 * @author shb
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conector {

    Connection conexion = null;

    public Connection getConnection() {
        try {
            Class.forName("\"org.postgresql.Driver\"");
            conexion = DriverManager.getConnection("jdbc:postgresql://localhost:5433/examen", "shb", "shb");
            System.out.println("CONEXION ESTABLECIDA");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("CONEXION NO ESTABLECIDA");
        }
        return conexion;
    }
}
