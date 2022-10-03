
package activitysemana6erick;
import java.util.Scanner;
/**
 *
 * @author DANIEL BARRANTES
 */
public class Activitysemana6Erick {

    public static void main(String[] args) {
        Paciente pa = new Paciente("Daniel","Gomez","calle #7E-21", "dolor abdominal","Dr.Garcia","Aguas","24-06-2022", 12, 'M');
        pa.mostrarD();
        Paciente pa1 = new Paciente("Daniela","Collazos","carrera 7", "dolor Vaginal","Dr.Peñaloza","Hospital Central","18-07-2022", 1, 'F');
        pa1.mostrarD();
        
        Medico me = new  Medico("DR. " + " ARMANDO" , " GONZALEZ");
        Medico me1 = new  Medico("DR. " + " RAUL" , " RODRIGUEZ");
        
        me.mostrarD();
        me1.mostrarD();
    }
    
}
