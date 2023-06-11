/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import InterfazGrafica.Login;
import InterfazGrafica.Estudiante.ModificarDatosPersonalesEstudGUI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.CallableStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author krist
 */
public class ModificarDatosPersonales {   
    
    public static void modificarDatos_Personales(String nombreBD, String direccion,String telFijo, String telMovil){ 
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);                 

        System.out.println("");
        String usuarioParametro = Login.usuarioLogin;
        String direccionParametro = direccion;
        String tel_fijoParametro = telFijo;
        String tel_movParametro = telMovil;
        
        try{

            String query = "{CALL sp_Estudiante_actualizar_datos_personales(?, ?, ?, ?)}";
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, usuarioParametro);
            statement.setString(2, direccionParametro);
            statement.setString(3, tel_movParametro);
            statement.setString(4, tel_fijoParametro);
            
            statement.execute();
            
            System.out.println("Procedimiento almacenado ejecutado exitosamente.");
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
}
    
