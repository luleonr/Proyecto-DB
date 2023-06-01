package Data;

import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Usuario1 {
    
    public static void mostrarDatos_Usuarios1(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        String user_usuario;

        try{
            declaracion = conn.createStatement();
            //rows = declaracion.executeQuery("SELECT SUBSTRING_INDEX(CURRENT_USER (), '@', 1) AS usuario;"); // ejecutar consulta
            rows = declaracion.executeQuery("SELECT CURRENT_USER () AS usuario;");
            
            while(rows.next()){
                
                
                user_usuario = rows.getString("usuario");
     
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
