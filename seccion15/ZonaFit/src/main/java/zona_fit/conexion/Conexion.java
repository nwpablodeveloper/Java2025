package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion(){

        Connection conexion = null;
        var baseDatos = "zona_fit_db";
        var url = "jdbc:mysql://localhost:3306/" + baseDatos;
        var usuario = "root";
        var password = "admin";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (ClassNotFoundException e) {
            System.out.println("\nError al cargar los driver: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("\nError al conectarse a la DB: " + e.getMessage());
        }

        return conexion;
    }

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
        if (conexion != null)
            System.out.println("Estamos conectados a la DB con exito");
        else
            System.out.println("Error al conectarse a la db");
    }

}
