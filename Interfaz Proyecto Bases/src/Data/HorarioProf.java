package Data;


import InterfazGrafica.Login;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class HorarioProf {
    
    public static String Dia;
    public static String Hora_inicio;
    public static String Hora_Final;
    public static String Actividad;
    public static String No_Grupo;
    public static String Salon;
    public static String Edificio;
    public static String Semestre;
    public static String Materia;
    public static String EdificioNom;
    public static String SalonNom;
    public static String MateriaID;
    public static String Sede;    

    
    public static void mostrarHorario(String nombreBD){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Dia = rows.getString("Dia");  
                Materia = rows.getString("Asignatura");                
                Hora_inicio = rows.getString("HoraInicio");  
                Hora_Final = rows.getString("HoraFinal");
                Actividad = rows.getString("Actividad");
                //No_Grupo = rows.getString("Grupo");
                //Sede = rows.getString("Sede");
                Salon = rows.getString("Salon");
                Edificio = rows.getString("Edificio");
                //Semestre = rows.getString("Semestre");

                //EdificioNom = rows.getString("EdificoNom");
                //MateriaID = rows.getString("Asignatura_ID");
                
                /*System.out.println(Dia);
                System.out.println(Hora_inicio);
                System.out.println(Hora_Final);
                System.out.println(Actividad);
                System.out.println(No_Grupo);
                System.out.println(Sede);
                System.out.println(Salon);
                System.out.println(Edificio);
                System.out.println(Semestre);
                System.out.println(Materia);
                System.out.println(EdificioNom);
                System.out.println(MateriaID);*/
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }    
    
    public static ArrayList<String> mostrarHorarioDia(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Dia = rows.getString("Dia");                   
                lista.add(Dia);
                
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
    
    public static ArrayList<String> mostrarHorarioHoraInicio(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){
                                
                Hora_inicio = rows.getString("HoraInicio");        
                lista.add(Hora_inicio);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }  
    
    public static ArrayList<String> mostrarHorarioHoraFinal(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){
                                
                Hora_Final = rows.getString("HoraFinal");        
                lista.add(Hora_Final);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarHorarioActividad(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){
                                
                Actividad = rows.getString("Actividad");        
                lista.add(Actividad);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarHorarioGrupo(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){
                                
                No_Grupo = rows.getString("Grupo");        
                lista.add(No_Grupo);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }

    public static ArrayList<String> mostrarHorarioSalon(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){
                                
                Salon = rows.getString("Salon");        
                lista.add(Salon);

            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }   
    
    public static ArrayList<String> mostrarHorarioEdificio(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Edificio = rows.getString("Edificio");
                lista.add(Edificio);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    } 

    public static ArrayList<String> mostrarHorarioSemestre(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin);  
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Semestre = rows.getString("Semestre");
                lista.add(Semestre);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    } 

    public static ArrayList<String> mostrarHorarioMateria(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Materia = rows.getString("Asignatura");
                lista.add(Materia);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }  
    
    public static ArrayList<String> mostrarHorarioSalonNom(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                SalonNom = rows.getString("SalonNom");
                lista.add(SalonNom);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
 
    public static ArrayList<String> mostrarHorarioEdificioNom(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                EdificioNom = rows.getString("EdificoNom");
                lista.add(EdificioNom);
                System.out.println(EdificioNom);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
       
    public static ArrayList<String> mostrarHorarioMateriaID(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                MateriaID = rows.getString("Asignatura_ID");
                lista.add(MateriaID);;
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }
    
    public static ArrayList<String> mostrarHorarioSede(String nombreBD, ArrayList<String> lista){ 
        
        Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_ver_horario_profesor(SUBSTRING_INDEX(CURRENT_USER(), '@', 1) );"); // ejecutar consulta

            while(rows.next()){  
                
                Sede = rows.getString("Sede");
                lista.add(Sede);;
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }    
}
