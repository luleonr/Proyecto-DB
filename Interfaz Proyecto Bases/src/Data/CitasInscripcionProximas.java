package Data;


import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class CitasInscripcionProximas {
    
    public static String Inicio;     
    public static String Final;
    public static String Programa;  
    public static String Facultad;  
    public static String Usuario;  
    
    

    
    
    public static void mostrarCitasProximas(String nombreBD, String carrera){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                Inicio = rows.getString("Inicio");            
                Final = rows.getString("Final");     
                Programa = rows.getString("Programa");
                Facultad = rows.getString("Facultad");
                Usuario = rows.getString("Usuario");
                
                System.out.println(Inicio);
                System.out.println("funciona");
                System.out.println("");
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión ResumenCreditos");
            ConexionSQL.desConexion(conn);
        }
    }
    
    public static ArrayList<String> mostrarFinal(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Final = rows.getString("Final");     
                lista.add(Final);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarPrograma(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Programa = rows.getString("Programa"); 
                System.out.println(Programa);
                //lista.add(Programa);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarFacultad(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Facultad = rows.getString("Facultad");     
                lista.add(Facultad);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarInicio(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Inicio = rows.getString("Inicio");     
                lista.add(Inicio);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    } 
    
    public static ArrayList<String> mostrarUsuario(String nombreBD, String carrera, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        
        try{
            String query = "{CALL Estudiante_mirar_citas_proximas(?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Usuario = rows.getString("Usuario");     
                lista.add(Usuario);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
  
   
}
