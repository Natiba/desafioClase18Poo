
package Services;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList < Rutina > listaRutinas = new ArrayList <>();
    
    public Rutina crearRutina() {
        
        Rutina ruti = new Rutina();
        
        // UUDI universal unique id  para generar id
        
        // La rutina tiene otro ID? O tenemos que usar el de Cliente??
        
        System.out.println("Ingrese la rutina que desea realizar, por favor"); // ?? Damos opciones?
        ruti.setNombre(sc.next());
        
        System.out.println("Ingrese duración de la rutina, por favor");
        ruti.setDuracion(sc.nextInt());
        
        System.out.println("Ingrese nivel de dificultad, , por favor");
        ruti.setNivelDificultad(sc.next());
        
        System.out.println("Ingrese descripción, por favor");
        ruti.setDescripcion(sc.next());
        
        listaRutinas.add(ruti);
        
        return ruti;
        
    }
    
    public ArrayList obtenerRutinas() {
        
        for (Rutina listaRutina : listaRutinas) {
            
            System.out.println(listaRutina);
            
        }
        
        return listaRutinas;
        
    }
    
    public void actualizarRutinas() {
        
    }
    
}

//La clase "ServicioRutina" debe tener los siguientes métodos de CRUD:
//crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
//obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
//actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String 
//descripcion): recibe el identificador de una rutina existente y los nuevos datos de la rutina, 
//y actualiza la información correspondiente en el sistema. eliminarRutina(int id): recibe el 
//identificador de una rutina existente y la elimina del sistema.
//En el método principal (main):