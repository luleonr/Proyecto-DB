/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author krist
 */
public class Prueba {
    
    public static void mostrarDatos(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"cbarrerar","1234");
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        String user_usuario;
        String a;

        try{
            declaracion = conn.createStatement();
            //rows = declaracion.executeQuery("SELECT SUBSTRING_INDEX(CURRENT_USER (), '@', 1) AS usuario;"); // ejecutar consulta
            rows = declaracion.executeQuery("SELECT * FROM Persona;");
            //rows = declaracion.executeQuery("SELECT * FROM vw_Estudiante_ver_datos_personales;");
            
            while(rows.next()){
                
                
                user_usuario = rows.getString("per_cc");
                //a = rows.getString("ID");
                System.out.println(user_usuario);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error");
            ConexionSQL.desConexion(conn);
        }
    }
}
