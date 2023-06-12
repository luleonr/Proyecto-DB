/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import InterfazGrafica.Login;
import InterfazGrafica.Estudiante.ModificarDatosPersonalesEstudGUI;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class Rol {   
    
    public static String Rol;
    public static String mostrarRol(String nombreBD){ 
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);


        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;     
              
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT f_obtener_rol();"); // ejecutar consulta
            
            while(rows.next()){
                Rol = rows.getString(1);
                System.out.println("Rol del usuario " + ": " + Rol);
            }

            System.out.println("Procedimiento almacenado ejecutado exitosamente.");
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return Rol;
    }
}
    
