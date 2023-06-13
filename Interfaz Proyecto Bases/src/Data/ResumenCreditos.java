package Data;


import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class ResumenCreditos {
    
    public static String Tipologia;     
    public static String Exigidos;
    public static String Cursados;  
    public static String Aprobados;  
    public static String Inscritos;  
    public static String Pendientes;      
    

    
    
    public static void mostrarResumenCreditos(String nombreBD, String carrera){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                Tipologia = rows.getString("Tipologia");            
                Exigidos = rows.getString("Exigidos");     
                Cursados = rows.getString("Cursados");
                Aprobados = rows.getString("Aprobados");
                Inscritos = rows.getString("Inscritos");
                Pendientes = rows.getString("Pendientes"); 
                
                System.out.println(Tipologia);
                System.out.println(Exigidos);
                System.out.println("funciona");
                System.out.println("");
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión ResumenCreditos");
            ConexionSQL.desConexion(conn);
        }
    }
    
    public static ArrayList<String> mostrarExigidos(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  
        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Exigidos = rows.getString("Exigidos");     
                lista.add(Exigidos);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexion de cretidos Exigidos");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarCursados(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");   
        
        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Cursados = rows.getString("Cursados"); 
                System.out.println(Cursados);
                lista.add(Cursados);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarAprobados(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  
        
        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Aprobados = rows.getString("Aprobados");     
                lista.add(Aprobados);

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
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");    

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
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
    
    public static ArrayList<String> mostrarInscritos(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");    

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Inscritos = rows.getString("Inscritos");     
                lista.add(Inscritos);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    

    public static ArrayList<String> mostrarPendientes(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL sp_Estudiante_Resumen_Creditos(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Pendientes = rows.getString("Pendientes");     
                lista.add(Pendientes);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
   
}
