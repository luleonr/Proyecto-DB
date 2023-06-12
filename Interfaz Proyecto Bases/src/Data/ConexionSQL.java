package Data;

// Primero se agrega al proyecto la libreria de jdbc

import java.sql.Connection;
import java.sql.DriverManager;

import InterfazGrafica.Login;;


public class ConexionSQL{
        
        public static boolean confirmacion = false;
              
        public static Connection conexion(String nombreBD, String usuario, String contraseña){
        String driver = "com.mysql.jdbc.Driver";
        String url_masDB = "jdbc:mysql://127.0.0.1:3306/";

        
        Connection conn = null;
        
        try{
            // Intentamos ver la libreria que descargamos para conector java con mysql esta correctamente cargada en el proyecto
            Class.forName(driver);
            /*System.out.println("-------------------------------------------------");
            System.out.println("Driver ha sido cargado con exito");
            System.out.println("-------------------------------------------------");*/
            try{
                // vamos a intentar ejecutar una conexion
                //el url funciona  jdbc:mysql:// + host_name / puerto /  nombreBD: 
 
                url_masDB = url_masDB + nombreBD; 
                
                conn = DriverManager.getConnection(url_masDB,usuario,contraseña);
                
                if(conn != null){
                    System.out.println("-------------------------------------------------");
                    System.out.println("La conexion a la BD ha sido exitosa");
                    System.out.println("-------------------------------------------------");
                    confirmacion = true;
                    //System.out.println(Login.usuarioLogin);

                }
            }catch(Exception e){
                System.out.println("Usuario o contraseña incorrecta");
                Login.error_Ingreso();
            }
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al cargar el driver (jdbc) de la BD" + e.getMessage());
        }
        
        return(conn);
        
    }  
    
    public static void  desConexion(Connection conexion){
        try{
           conexion.close();
           /*System.out.println("-------------------------------------------------");
           System.out.println("La desconexion de la BD ha sido exitosa");
           System.out.println("-------------------------------------------------");*/
        }catch(Exception e){
            System.out.println("Ha ocurrido un error al intentar desconectar la conexion de la BD: " + e.getMessage());
        }
  
    }  

}
