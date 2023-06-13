package Data;


import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class InformacionMateria {
    
    public static String Asignatura;     
    public static String Codigo;
    public static String Tipologia;  
    public static String Creditos;  
    public static String Nombre_programa;  
    public static String Nombre_facultad; 
    public static String Descripcion; 
    public static String Grupo_num; 
    public static String Cupos; 
    public static String Nombre_profesor;  
    public static String Semestre;
    
    public static String Dia;
    public static String Inicio;
    public static String Final;
    public static String Actividad;
    public static String ID_salon;
    public static String Salon;
    public static String ID_Edificio;
    public static String Edificio;
    

    
    
    public static void mostrarInfoMateria(String nombreBD, String carrera, String idmateria){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera; 
        String idmateriaParametro = idmateria; 
        
        try{
            String query = "{CALL Estudiante_info_asignatura(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);
            statement.setString(2, idmateriaParametro);            

            ResultSet rows = statement.executeQuery();            

            while(rows.next()){
                Asignatura = rows.getString("Asignatura");            
                Codigo = rows.getString("Codigo");     
                Tipologia = rows.getString("Tipologia");
                Creditos = rows.getString("Creditos");
                Nombre_programa = rows.getString("Nombre_programa");
                Nombre_facultad = rows.getString("Nombre_facultad"); 
                
                System.out.println(Asignatura);
                System.out.println(Codigo);
                System.out.println(Tipologia);
                System.out.println("funciona");
                System.out.println("");
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión ResumenCreditos");
            ConexionSQL.desConexion(conn);
        }
    }
    
    public static ArrayList<String> mostrarCodigo(String nombreBD, String carrera, String idmateria ,ArrayList<String> lista){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  

        System.out.println("");
        String carreraParametro = carrera; 
        String idmateriaParametro = idmateria; 
        
        try{
            String query = "{CALL Estudiante_info_asignatura(?,?)}";

            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);
            statement.setString(2, idmateriaParametro);            

            ResultSet rows = statement.executeQuery();                

            while(rows.next()){
                            
                Codigo = rows.getString("Codigo");     
                lista.add(Codigo);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexion de cretidos Exigidos");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarAsignatura(String nombreBD, String carrera, String idmateria, ArrayList<String> lista) {

    // Connection conn = ConexionSQL.conexion(nombreBD, Login.usuarioLogin, Login.contraseñaLogin);
    Connection conn = ConexionSQL.conexion(nombreBD, "dkimply", "1234");

    System.out.println("");
    String carreraParametro = carrera;
    String idmateriaParametro = idmateria;

    try {
        String query = "{CALL Estudiante_info_asignatura(?,?)}";

        CallableStatement statement = conn.prepareCall(query);

        statement.setString(1, carreraParametro);
        statement.setString(2, idmateriaParametro);

        ResultSet rows = statement.executeQuery();

        while (rows.next()) {

            Asignatura = rows.getString("Asignatura");
            lista.add(Asignatura);

        }
        ConexionSQL.desConexion(conn);
    } catch (Exception e) {
        System.out.println("Hubo un error en la conexión de la asignatura");
        ConexionSQL.desConexion(conn);
    }
    return lista;
}

    public static ArrayList<String> mostrarTipologia(String nombreBD, String carrera, String idmateria, ArrayList<String> lista) {

    // Connection conn = ConexionSQL.conexion(nombreBD, Login.usuarioLogin, Login.contraseñaLogin);
    Connection conn = ConexionSQL.conexion(nombreBD, "dkimply", "1234");

    System.out.println("");
    String carreraParametro = carrera;
    String idmateriaParametro = idmateria;

    try {
        String query = "{CALL Estudiante_info_asignatura(?,?)}";

        CallableStatement statement = conn.prepareCall(query);

        statement.setString(1, carreraParametro);
        statement.setString(2, idmateriaParametro);

        ResultSet rows = statement.executeQuery();

        while (rows.next()) {

            Tipologia = rows.getString("Tipologia");
            lista.add(Tipologia);

        }
        ConexionSQL.desConexion(conn);
    } catch (Exception e) {
        System.out.println("Hubo un error en la conexión de la tipología");
        ConexionSQL.desConexion(conn);
    }
    return lista;
}

    public static ArrayList<String> mostrarCreditos(String nombreBD, String carrera, String idmateria, ArrayList<String> lista) {

    // Connection conn = ConexionSQL.conexion(nombreBD, Login.usuarioLogin, Login.contraseñaLogin);
    Connection conn = ConexionSQL.conexion(nombreBD, "dkimply", "1234");

    System.out.println("");
    String carreraParametro = carrera;
    String idmateriaParametro = idmateria;

    try {
        String query = "{CALL Estudiante_info_asignatura(?,?)}";

        CallableStatement statement = conn.prepareCall(query);

        statement.setString(1, carreraParametro);
        statement.setString(2, idmateriaParametro);

        ResultSet rows = statement.executeQuery();

        while (rows.next()) {

            Creditos = rows.getString("Creditos");
            lista.add(Creditos);

        }
        ConexionSQL.desConexion(conn);
    } catch (Exception e) {
        System.out.println("Hubo un error en la conexión de los créditos");
        ConexionSQL.desConexion(conn);
    }
    return lista;
}

}
