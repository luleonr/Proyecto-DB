package Data;

import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class DatosPersonalesEstud {
    
    public static String Nombre;
    public static String Cedula;
    public static String Direccion;
    public static String Telefono_Movil;
    public static String Telefono_Fijo;
    public static String Correo;
    public static String AñoIngreso;
    public static String Carrera;
    
    
    public static void mostrarDatos_PersonalesEstud(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);         
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_datos_personales();"); // ejecutar consulta

            while(rows.next()){
                            
                Cedula = rows.getString("Cedula");     
                Nombre = rows.getString("Nombre");
                Direccion = rows.getString("Direccion");
                Telefono_Movil = rows.getString("Telefono_Movil");
                Telefono_Fijo = rows.getString("Telefono_Fijo");
                Correo = rows.getString("Correo");
                AñoIngreso = rows.getString("AñoIngreso");
                Carrera = rows.getString("Carrera");
               
                
                System.out.println(Cedula);
                System.out.println(Nombre);
                System.out.println(Direccion);
                System.out.println(Telefono_Movil);
                System.out.println(Telefono_Fijo);
                System.out.println(Correo);
                System.out.println(AñoIngreso);
                System.out.println(Carrera);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
}
