package Data;


import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CitasInscripcionVencidas {
    
    public static String Inicio;     
    public static String Final;
    public static String Programa;  
    public static String Facultad;  
    public static String Usuario;  
    
    

    
    
    public static void mostrarCitasVencidas(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");            
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        System.out.println("");  
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL Estudiante_mirar_citas_vencidas();"); // ejecutar consulta
                      

            while(rows.next()){
                Inicio = rows.getString("Inicio");            
                Final = rows.getString("Final");     
                Programa = rows.getString("Programa");
                Facultad = rows.getString("Facultad");
                Usuario = rows.getString("Usuario");
                
                System.out.println(Inicio);
                System.out.println(Final);
                System.out.println(Programa);
                System.out.println(Facultad);
                System.out.println(Usuario);                
                System.out.println("funciona");
                System.out.println("");
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión Cita Activa");
            ConexionSQL.desConexion(conn);
        }
    }

    public static ArrayList<String> mostrarInicio(String nombreBD,ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");           
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        System.out.println("");  
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL Estudiante_mirar_citas_vencidas();"); // ejecutar consulta
                      

            while(rows.next()){
                Inicio = rows.getString("Inicio");            
                System.out.println(Inicio);
                lista.add(Inicio);
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión Cita Activa");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }   
    
    public static ArrayList<String> mostrarFinal(String nombreBD,ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");              
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        System.out.println("");  
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL Estudiante_mirar_citas_vencidas();"); // ejecutar consulta
                      

            while(rows.next()){            
                Final = rows.getString("Final");     
                System.out.println(Final);
                lista.add(Final);
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión Cita Activa");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    

    public static ArrayList<String> mostrarPrograma(String nombreBD,ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");             
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        System.out.println("");  
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL Estudiante_mirar_citas_vencidas();"); // ejecutar consulta
                      

            while(rows.next()){
                
                Programa = rows.getString("Programa"); 
                System.out.println(Programa);
                lista.add(Programa);
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión Cita Activa");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarFacultad(String nombreBD,ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");             
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        System.out.println("");  
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL Estudiante_mirar_citas_vencidas();"); // ejecutar consulta
                      

            while(rows.next()){

                Facultad = rows.getString("Facultad");;
                System.out.println(Facultad);
                lista.add(Facultad);
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión Cita Activa");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    

}