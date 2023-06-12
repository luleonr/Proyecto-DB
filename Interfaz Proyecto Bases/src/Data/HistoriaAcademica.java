package Data;

import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class HistoriaAcademica {
    
    public static String PAPA;
    public static String PAPPI;
    public static String Porcentaje_Avance;
    public static String Creditos_Adici;
    public static String Cupo_Creditos;
    public static String Creditos_Dispo;
    public static String Creditos_Doble;
    public static String ID_Carrera;
    public static String Carrera;
    public static String Facultad;
    
    
    public static void mostrarHistoria_Academica(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);     
        //Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234");        
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_historia_academica(SUBSTRING_INDEX();"); // ejecutar consulta

            while(rows.next()){
                            
                PAPA = rows.getString("PAPA");     
                PAPPI = rows.getString("PAPPI");
                Porcentaje_Avance = rows.getString("Porcentaje_Avance");
                Creditos_Adici = rows.getString("Creditos_Adicionales");
                Cupo_Creditos = rows.getString("Cupo_Creditos");
                Creditos_Dispo = rows.getString("Creditos_Disponibles");
                Creditos_Doble = rows.getString("Creditos_Doble_Titulacion");
                ID_Carrera = rows.getString("ID_Carrera");
                Carrera = rows.getString("Carrera");
                Facultad = rows.getString("Facultad");
               
                
                System.out.println(PAPA);
                System.out.println(PAPPI);
                System.out.println(Porcentaje_Avance);
                System.out.println(Creditos_Adici);
                System.out.println(Cupo_Creditos);
                System.out.println(Creditos_Dispo);
                System.out.println(Creditos_Doble);
                System.out.println(ID_Carrera);
                System.out.println(Carrera);
                System.out.println(Facultad);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }
}
