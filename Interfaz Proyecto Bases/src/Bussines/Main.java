package Bussines;



import Data.HistoriaAcademica;
import Data.AsignaturasHistAcadConsulta;
import Data.HorarioEstud;
import Data.Rol;
import InterfazGrafica.Login;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


public class Main {

    public static ArrayList<String> diaList = new ArrayList<>();
    public static ArrayList<String> horaInicioList = new ArrayList<>();
    public static ArrayList<String> horaFinalList = new ArrayList<>();
    public static ArrayList<String> actividadList = new ArrayList<>();
    public static ArrayList<String> noGrupoList = new ArrayList<>();
    public static ArrayList<String> salonList = new ArrayList<>();
    public static ArrayList<String> edificioList = new ArrayList<>();
    public static ArrayList<String> semestreList = new ArrayList<>();
    public static ArrayList<String> materiaList = new ArrayList<>();    
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        /*Date fecha = new Date();
        Calendar calendario = Calendar.getInstance();
        
        int año = calendario.get(Calendar.YEAR);
        int mes = calendario.get(Calendar.MONTH) + 1; // Los meses en Calendar comienzan en 0
        int dia = calendario.get(Calendar.DAY_OF_MONTH);
        int hora = calendario.get(Calendar.HOUR_OF_DAY);
        int minutos = calendario.get(Calendar.MINUTE);
        int segundos = calendario.get(Calendar.SECOND);
     
        System.out.println("Hora actual: " + hora + ":" + minutos + ":" + segundos);
        System.out.println("Hora actual: " + año + "-" + mes + "-" + dia);*/
        
        String nombreBD = "Academico";
        Login.ejecutar_Login();  
        
        /*HorarioEstud a = new HorarioEstud();
        
        a.mostrarHorario(nombreBD);
        a.mostrarHorarioSemestre(nombreBD,semestreList);
  
        for(int i = 0; i<semestreList.size();i++){
            System.out.println(semestreList.get(i));

        }*/
        

        
        


    }
}
