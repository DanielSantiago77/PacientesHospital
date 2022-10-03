
package activitysemana6erick;

/**
 *
 * @author DANIEL BARRANTES
 */
public class Medico extends Persona{
       public Medico(String nombre,String apellido){
        super(nombre,apellido);
        
    }
    public void mostrarD(){
        System.out.println("Doctor: "+getNombre()+" "+getApellido());
               
    }
    
}