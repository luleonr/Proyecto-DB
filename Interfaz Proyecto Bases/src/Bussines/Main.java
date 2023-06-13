package Bussines;



import Data.HistoriaAcademica;
import Data.AsignaturasHistAcadConsulta;
import Data.HorarioEstud;
import Data.HorarioProf;
import Data.Materia;
import Data.ProgramaEstudiante;
import Data.ResumenCreditos;
import Data.Rol;
import InterfazGrafica.Login;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JLabel;


public class Main {
    
    public static ArrayList<String> TipologiaCList = new ArrayList<>();
    public static ArrayList<String> ExigidosCList = new ArrayList<>();
    
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
        
        //ResumenCreditos.mostrarResumenCreditos(nombreBD, "20101");
        
        /*ResumenCreditos.mostrarPendientes(nombreBD,"20101", ExigidosCList);     
        
            for(int i = 0; i<ExigidosCList.size();i++){
              System.out.println(ExigidosCList.get(i));
                System.out.println(
                        "indice = " + i);
            }*/

        
    }
}
