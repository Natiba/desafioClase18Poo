package desafiogrupaldia18;

import Entidades.Cliente;
import Services.ClienteService;
import Services.GimnasioService;


public class DesafioGrupalDia18 {

    public static void main(String[] args) {
        
//        ClienteService clS = new ClienteService();
//        
//        Cliente cliente1 = clS.registrarCliente();
//        clS.obtenerClientes(); 
//        clS.actualizarCliente();

        GimnasioService gym = new GimnasioService();
        
        gym.menuGimnasio();
        
    }
    
}

//ejercicio 1 (Actividad para el día n° 18)
//Realizar una aplicación de Gimnasio, que permita tener agregar clientes, y rutinas. Para ello, vamos a utilizar diferentes
//clases y metodos;

//CLASES:
//Crea una clase de entidad llamada "Cliente" con los siguientes atributos: id, nombre, edad, altura, peso, objetivo (cadena de caracteres)
//Crea una clase de entidad llamada "Rutina" con los siguientes atributos: id, nombre, duracion, nivelDificultad, descripcion
//Crea una clase ServicioCliente y una clase ServicioRutina.