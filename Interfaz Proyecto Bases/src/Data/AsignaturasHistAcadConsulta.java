package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class AsignaturasHistAcadConsulta {
    
    public static String user_cc;
    public static String user_usuario;
    public static String user_contrasena;

    
    public ArrayList<String> mostrarUsuarios(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM usuario"); // ejecutar consulta

            while(rows.next()){                               
                user_usuario = rows.getString("user_usuario");
                lista.add(user_usuario);     
            }    
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
    
    public ArrayList<String> mostrarCedula(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM usuario"); // ejecutar consulta

            while(rows.next()){                            
                user_cc = rows.getString("user_cc");     
                lista.add(user_cc);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
}
