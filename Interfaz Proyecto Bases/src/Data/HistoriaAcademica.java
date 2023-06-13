package Data;

import InterfazGrafica.Estudiante.HistoriaAcademicaEstudGUI;
import InterfazGrafica.Login;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class HistoriaAcademica {
    
    public static String ID_historia_academica;
    public static String Estado;
    public static String PAPA;
    public static String PAPPI;
    public static String Promedio_acumulado;    
    public static String Porcentaje_Avance;
    public static String Creditos_Adici;
    public static String Cupo_Creditos;
    public static String Creditos_Dispo;
    public static String Creditos_Doble;
    
    
    public static void mostrarHistoria_Academica(String nombreBD,String carrera){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  
        Connection conn = ConexionSQL.conexion(nombreBD,"dkimply","1234");  
        System.out.println("");
        String carreraParametro = carrera;        
        
        //Statement declaracion ; 
        //sResultSet rows;
        
        try{
            String query = "{CALL sp_Estudiante_mostrar_historia_academica(?)}";
            //declaracion = conn.createStatement();
            //rows = declaracion.executeQuery("{CALL sp_Estudiante_mostrar_historia_academica(?)}"); // ejecutar consulta
            
            CallableStatement statement = conn.prepareCall(query);
            
            statement.setString(1, carreraParametro);

            ResultSet rows = statement.executeQuery();
            while(rows.next()){
                 
                ID_historia_academica = rows.getString("ID_historia_academica");
                Estado = rows.getString("Estado");
                PAPA = rows.getString("PAPA");     
                PAPPI = rows.getString("PAPPI");
                Promedio_acumulado = rows.getString("Promedio_acumulado");
                Porcentaje_Avance = rows.getString("Porcentaje_avance");
                Creditos_Adici = rows.getString("Creditos_adicionales");
                Cupo_Creditos = rows.getString("Cupo_creditos");
                Creditos_Dispo = rows.getString("Creditos_disponibles");
                Creditos_Doble = rows.getString("Creditos_doble_titulacion");
                     
                System.out.println(ID_historia_academica);
                System.out.println(Estado);
                System.out.println(PAPA);
                System.out.println(PAPPI);
                System.out.println(Promedio_acumulado);
                System.out.println(Porcentaje_Avance);
                System.out.println(Creditos_Adici);
                System.out.println(Cupo_Creditos);
                System.out.println(Creditos_Dispo);
                System.out.println(Creditos_Doble);
                System.out.println("");

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión de Historia Academica");
            ConexionSQL.desConexion(conn);
        }
    }
}
