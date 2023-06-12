package Data;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class HorarioEstud {
    
    public static String Dia;
    public static String Hora_inicio;
    public static String Hora_Final;
    public static String Actividad;
    public static String No_Grupo;
    public static String Salon;
    public static String Edificio;
    public static String Semestre;
    public static String Materia;
    

    public static void mostrarHorario(String nombreBD){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){  
                
                Dia = rows.getString("Dia");   
                Hora_inicio = rows.getString("Hora_inicio");  
                Hora_Final = rows.getString("Hora_Final");
                Actividad = rows.getString("Actividad");
                No_Grupo = rows.getString("No_Grupo");
                Salon = rows.getString("Salon");
                Edificio = rows.getString("Edificio");
                Semestre = rows.getString("Semeste");
                Materia = rows.getString("MateriaNom");
                
                System.out.println(Dia);
                System.out.println(Hora_inicio);
                System.out.println(Hora_Final);
                System.out.println(Actividad);
                System.out.println(No_Grupo);
                System.out.println(Salon);
                System.out.println(Edificio);
                System.out.println(Semestre);
                System.out.println(Materia);
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
    }    
    
    public static ArrayList<String> mostrarHorarioDia(String nombreBD, ArrayList<String> lista){ 
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){
                                
                Hora_inicio = rows.getString("Hora_inicio");        
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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){
                                
                Hora_Final = rows.getString("Hora_Final");        
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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){
                                
                No_Grupo = rows.getString("No_Grupo");        
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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){  
                
                Semestre = rows.getString("Semeste");
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
        
        //Connection conn = ConexionSQL.conexion(nombreBD,Login.usuarioLogin,Login.contraseñaLogin); 
        Connection conn = ConexionSQL.conexion(nombreBD,"mcheshire","1234"); 
        System.out.println("");
        Statement declaracion ; 
        ResultSet rows;
        
        try{
            declaracion = conn.createStatement();
            rows = declaracion.executeQuery("CALL sp_Estudiante_mostrar_horario();"); // ejecutar consulta

            while(rows.next()){  
                
                Materia = rows.getString("MateriaNom");
                lista.add(Materia);
   
            }
            ConexionSQL.desConexion(conn);
        }catch(Exception e){
            System.out.println("Hubo un error en la conexión");
            ConexionSQL.desConexion(conn);
        }
        return lista;
    }     
}
