package Data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Select {
    
    public static void mostrarDatos_Persona(String nombreBD){ //FUNCIONA ACTUALIZADO
        Connection conn = ConexionSQL.conexion(nombreBD,"cbarrerar","1234");
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
     
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("SELECT * FROM persona;"); // ejecutar consulta
            System.out.println("REGISTROS: ");
            
            while(rows.next()){
                
                System.out.println("per_cc: "+ rows.getInt(1));
                System.out.println("per_nombre: "+ rows.getNString(2));
                System.out.println("per_direccion: "+ rows.getNString(3));
                System.out.println("per_tel_movil: "+ rows.getInt(4));                
                System.out.println("per_tel_fijo: "+ rows.getInt(5));   
                System.out.println("per_correo_institucional: " + rows.getString(6));     
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error");
            ConexionSQL.desConexion(conn);
        }
    }
}
