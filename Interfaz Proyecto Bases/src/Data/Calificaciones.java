package Data;


import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class Calificaciones {
        
    public static String Asignatura;
    public static String Codigo;  
    public static String Calificacion;  
    public static String Estado;        
    

    
    
    public static void mostrarAsignaturasCursadas(String nombreBD, String carrera, String semestre){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        //Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera;  
        String semestreParametro = semestre;
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_calificaciones(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, semestreParametro);
            statement.setString(2, carreraParametro);

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){         
                Asignatura = rows.getString("Asignatura");     
                Codigo = rows.getString("Codigo");
                Calificacion = rows.getString("Calificacion");
                Estado = rows.getString("Estado");
                
                System.out.println("funciona");
                System.out.println("");
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión ResumenCreditos");
            ConexionSQL.desConexion(conn);
        }
    }
    
    public static ArrayList<String> mostrarAsignatura(String nombreBD, String carrera,String semestre, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        String semestreParametro = semestre;        
        try{
            String query = "{CALL sp_Estudiante_mostrar_calificaciones(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, semestreParametro);
            statement.setString(2, carreraParametro);

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

    public static ArrayList<String> mostrarCodigo(String nombreBD, String carrera,String semestre, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        String semestreParametro = semestre;
        try{
            String query = "{CALL sp_Estudiante_mostrar_calificaciones(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, semestreParametro);
            statement.setString(2, carreraParametro);
            
            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                            
                Codigo = rows.getString("Codigo"); 
                System.out.println(Codigo);
                //lista.add(Codigo);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
    
    public static ArrayList<String> mostrarCalificacion(String nombreBD, String carrera,String semestre, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        String semestreParametro = semestre;
        try{
            String query = "{CALL sp_Estudiante_mostrar_calificaciones(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, semestreParametro);
            statement.setString(2, carreraParametro);

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
        
    public static ArrayList<String> mostrarEstado(String nombreBD, String carrera,String semestre, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  

        System.out.println("");
        String carreraParametro = carrera;   
        String semestreParametro = semestre;        
        try{
            String query = "{CALL sp_Estudiante_mostrar_calificaciones(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, semestreParametro);
            statement.setString(2, carreraParametro);

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
