package clases;
import java.sql.*;

public class ConexionLoto {
    
    public static Connection Conectar(){
        try {   
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/loto_bd","root","");
            return cn;
        } catch (SQLException e) {
            System.out.println("Error en la conexion local: " + e);
        }
        
        return(null);
    }
}
