
package Services;

import Entidades.Rutina;
import java.util.ArrayList;
import java.util.Scanner;

public class RutinaService {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList < Rutina > listaRutinas = new ArrayList <>();
    
      int clientId = 1; // Inicializo ID global
    
    public Rutina crearRutina() {
        
        Rutina ruti = new Rutina();
        
        // UUDI universal unique id  para generar id
        
        // La rutina tiene otro ID? O tenemos que usar el de Cliente??
        
        // Aca le tengo que asignar el ID a cada cliente nuevo:
        ruti.setID(clientId++); // el primero es 1
        System.out.println("Id cliente: " + ruti.getID());
        
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
    
        public boolean hayRutinas() {
        
        if (listaRutinas.isEmpty()) {
             return true;
        } else {
            return false;
        }
        
    }
    
    public ArrayList obtenerRutinas() {
        
        for (Rutina listaRutina : listaRutinas) {
            
            System.out.println(listaRutina);
            
        }
        
        return listaRutinas;
        
    }
    
    public void actualizarRutinas() {
        
          System.out.println("Ingrese ID del cliente que desea actualizar, por favor");
        int idBuscado = sc.nextInt();
        
        GimnasioService gym = new GimnasioService();

        if (idBuscado == listaRutinas.get(idBuscado - 1).getID()) {

            int opcionActualizar = 0;

            do {

                System.out.println("Ingrese item que desea actualizar: \n");

                System.out.println("1. Nombre de la rutina \n"
                        + "2. Duracion de la rutina \n"
                        + "3. Nivel de dificultad de la rutina \n"
                        + "4. Descripción de la rutina \n"
                        + "5. Salir del menú \n"
                        + "6. Regresar al menú principal \n");
                opcionActualizar = sc.nextInt();

                System.out.println("");

                switch (opcionActualizar) {
                    case 1:

                        System.out.println("Nombre anterior: " + listaRutinas.get(idBuscado - 1).getNombre());
                        System.out.println("Ingrese el nuevo nombre, por favor");
                        listaRutinas.get(idBuscado - 1).setNombre(sc.next());
                        System.out.println("El nombre fue cambiado correctamente!! ");
                        System.out.println("Nuevo nombre: " + listaRutinas.get(idBuscado - 1).getNombre());

                        break;
                    case 2:

                        System.out.println("Duración anterior: " + listaRutinas.get(idBuscado - 1).getDuracion());
                        System.out.println("Ingrese nueva duración, por favor");
                        listaRutinas.get(idBuscado - 1).setDuracion(sc.nextInt());
                        System.out.println("La edad fue cambiada correctamente!! ");
                        System.out.println("Nueva edad: " + listaRutinas.get(idBuscado - 1).getDuracion());

                        break;
                    case 3:

                        System.out.println("Nivel dificultad anterior: " + listaRutinas.get(idBuscado - 1).getNivelDificultad());
                        System.out.println("Ingrese nuevo nivel dificultad, por favor");
                        listaRutinas.get(idBuscado - 1).setNivelDificultad(sc.next());
                        System.out.println("El nivel de dificultad fue cambiado correctamente!! ");
                        System.out.println("Nuevo nivel de dificultad: " + listaRutinas.get(idBuscado - 1).getNivelDificultad());

                        break;
                    case 4:

                        System.out.println("Descripcion anterior: " + listaRutinas.get(idBuscado - 1).getDescripcion());
                        System.out.println("Ingrese la nueva descripción, por favor");
                        listaRutinas.get(idBuscado - 1).setDescripcion(sc.next());
                        System.out.println("La descripción fue cambiada correctamente!! ");
                        System.out.println("Nueva descripción: " + listaRutinas.get(idBuscado - 1).getDescripcion());

                        break;
                    case 5:
                        System.exit(0);
                        break;
                          case 6:
                        // Regresar al menu principal
                              gym.menuGimnasio();
                        break;
                    default:
                        System.out.println("Ingrese una opcion correcta, por favor (1 a 6)");
                        ;
                }

            } while (opcionActualizar != 5);

        }

        
    }
    
    public void eliminarRutina() {

        System.out.println("Ingrese ID de la rutina que desea eliminar, por favor");
        int idBuscado = sc.nextInt();
        int rutinaAEliminar = idBuscado -1;
        
        if (idBuscado == listaRutinas.get(rutinaAEliminar).getID()) {
            
            listaRutinas.remove(rutinaAEliminar);
            System.out.println("La rutina " + listaRutinas.get(idBuscado-1) + " ha sido eliminado correctamente!!");
            
        } else {
            System.out.println("El ID ingresado no pertenece a ninguna rutina activa");
            System.out.println("No ha sido posible eliminarla");
        }
        
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