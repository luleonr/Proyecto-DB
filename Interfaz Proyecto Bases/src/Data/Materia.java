package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Materia {
    
    public static String asig_id;
    public static String asig_nombre;
    public static String asig_no_creditos;

    
    public static ArrayList<String> mostrarIDMateria(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM Asignatura"); // ejecutar consulta

            while(rows.next()){                               
                asig_id = rows.getString("asig_id");
                lista.add(asig_id);     
            }    
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
    
    public static ArrayList<String> mostrarMateria(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM Asignatura"); // ejecutar consulta

            while(rows.next()){                            
                asig_nombre = rows.getString("asig_nombre");     
                lista.add(asig_nombre);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }  
    
    public static ArrayList<String> mostrarCreditos(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM Asignatura"); // ejecutar consulta

            while(rows.next()){                            
                asig_no_creditos = rows.getString("asig_no_creditos");     
                lista.add(asig_no_creditos);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
}
