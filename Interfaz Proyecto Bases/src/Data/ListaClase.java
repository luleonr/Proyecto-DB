package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ListaClase {
    
    public static String per_nombre;
    public static String per_correo_institucional;
    public static String Estudiante_persona_cc;
    public static String prog_nombre;
    
    public static ArrayList<String> mostrarCorreo(String nombreBD, ArrayList<String> lista){ 
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("call lista_de_clase();"); // ejecutar consulta

            while(rows.next()){                               
                per_correo_institucional = rows.getString("per_correo_institucional");
                lista.add(per_correo_institucional);     
            }    
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
    
    public static ArrayList<String> mostrarNombre(String nombreBD, ArrayList<String> lista){ 
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("call lista_de_clase();"); // ejecutar consulta

            while(rows.next()){                            
                per_nombre = rows.getString("per_nombre");     
                lista.add(per_nombre);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarCedula(String nombreBD, ArrayList<String> lista){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("call lista_de_clase();"); // ejecutar consulta

            while(rows.next()){                            
                Estudiante_persona_cc = rows.getString("Estudiante_persona_cc");     
                lista.add(Estudiante_persona_cc);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }  
    
    public static ArrayList<String> mostrarCarrera(String nombreBD, ArrayList<String> lista){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"root","2000");         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("call lista_de_clase();"); // ejecutar consulta

            while(rows.next()){                            
                prog_nombre = rows.getString("prog_nombre");     
                lista.add(prog_nombre);     
            }  
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }      
}
