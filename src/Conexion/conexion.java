package Conexion; 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    Connection con = null;

    public Connection conexion(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/registro","root","Confirmar123");  
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: "+e);
        }
        return con;
    }
}
    

