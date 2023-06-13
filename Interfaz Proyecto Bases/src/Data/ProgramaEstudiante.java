package Data;


import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ProgramaEstudiante {
    
    public static String Id_programa;
    public static String Nombre_programa;  
    public static String ID_departamento;  
    public static String Nombre_departamento;  
    public static String ID_Facultad;  
    public static String Nombre_facultad;      
    

    
    
    public static void mostrarProgramaEstudiante(String nombreBD){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");        
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_planes()"); // ejecutar consulta

            while(rows.next()){
                            
                Id_programa = rows.getString("Id_programa");     
                Nombre_programa = rows.getString("Nombre_programa");
                ID_departamento = rows.getString("ID_departamento");
                Nombre_departamento = rows.getString("Nombre_departamento");
                ID_Facultad = rows.getString("ID_Facultad");
                Nombre_facultad = rows.getString("Nombre_facultad");                
              
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
}
