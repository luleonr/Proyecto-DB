package Data;


import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class MostrarAsignaturasHistoriaAcad {
    
    public static String Asignatura;
    public static String Codigo;  
    public static String Creditos;  
    public static String Tipologia;  
    public static String Periodo;  
    public static String Calificacion;   
    public static String Estado;       
    

    
    
    public static void mostrarAsignaturasCursadas(String nombreBD, String carrera){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Asignatura = rows.getString("Asignatura");     
                Codigo = rows.getString("Codigo");
                Creditos = rows.getString("Creditos");
                Tipologia = rows.getString("Tipologia");
                Periodo = rows.getString("Periodo");
                Calificacion = rows.getString("Calificacion");                
                Estado = rows.getString("Estado");
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
    
    public static ArrayList<String> mostrarAsignatura(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Asignatura = rows.getString("Asignatura");     
                lista.add(Asignatura);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarCodigo(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Codigo = rows.getString("Codigo");     
                lista.add(Codigo);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarCreditos(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Creditos = rows.getString("Creditos");     
                lista.add(Creditos);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarTipologia(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Tipologia = rows.getString("Tipologia");     
                lista.add(Tipologia);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    } 
    
    public static ArrayList<String> mostrarPeriodo(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Periodo = rows.getString("Periodo");     
                lista.add(Periodo);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    

    public static ArrayList<String> mostrarCalificacion(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Calificacion = rows.getString("Calificacion");     
                lista.add(Calificacion);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    

    public static ArrayList<String> mostrarEstado(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_asignaturas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Estado = rows.getString("Estado");     
                lista.add(Estado);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
}
