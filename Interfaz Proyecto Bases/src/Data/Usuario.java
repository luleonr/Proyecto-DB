
package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Usuario {
   
    
    public static void mostrarDatos_Usuarios(String nombreBD, String usuario){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,usuario,"1234");
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        String user_usuario;
        String user_contraseña;
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM Usuario WHERE user_usuario = " + usuario); // ejecutar consulta
            System.out.println("USUARIOS: ");
            
            while(rows.next()){
                
                
                user_usuario = rows.getString("user_usuario");
                user_contraseña = rows.getString("user_contrasena");     
                
                
                if(user_usuario != "''"){
                    System.out.println("alv verga");
                }else{
                    System.out.println("vale monda");
                }
                
                System.out.println(user_usuario);
                System.out.println(user_contraseña);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error");
            ConexionSQL.desConexion(conn);
        }
    }
}