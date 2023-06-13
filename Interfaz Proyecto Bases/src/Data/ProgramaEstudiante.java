package Data;


import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class ProgramaEstudiante {
    
    public static String Id_programa;
    public static String Nombre_programa;    

    
    
    public static void mostrarProgramaEstudiante(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);                
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_planes();"); // ejecutar consulta

            while(rows.next()){
                            
                Id_programa = rows.getString("Id_programa");     
                Nombre_programa = rows.getString("Nombre_programa");
              
                System.out.println(Id_programa);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
}
