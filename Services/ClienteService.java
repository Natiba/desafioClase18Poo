package Services;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteService {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Cliente> listaClientes = new ArrayList<>();

    int clientId = 1; // Inicializo ID global

    public Cliente registrarCliente() {

        Cliente client = new Cliente();

        // Aca le tengo que asignar el ID a cada cliente nuevo:
        client.setId(clientId++);
        System.out.println("Id cliente: " + client.getId());

        System.out.println("Ingrese nombre del cliente a registrar, por favor");
        client.setNombre(sc.next());

        System.out.println("Ingrese edad del cliente a registrar, por favor");
        client.setEdad(sc.nextInt());

        System.out.println("Ingrese altura del cliente a registrar, por favor");
        client.setAltura(sc.nextDouble());

        System.out.println("Ingrese peso del cliente a registrar, por favor");
        client.setPeso(sc.nextDouble());

        System.out.println("Ingrese objetivo del cliente a registrar, por favor");
        client.setObjetivo(sc.next());

        listaClientes.add(client);

        System.out.println("");
        System.out.println("Cliente creado con exito!!");
        System.out.println("----------");

        return client;

    }

    public ArrayList<Cliente> obtenerClientes() {

        listaClientes.forEach((_item) -> {
            //fore tab

            System.out.println(_item);
        });

        System.out.println("");
        System.out.println("----------");
        return listaClientes;

    }

    public void actualizarCliente() {

        System.out.println("Ingrese ID del cliente que desea actualizar, por favor");
        int idBuscado = sc.nextInt();
        
        GimnasioService gym = new GimnasioService();

        if (idBuscado == listaClientes.get(idBuscado - 1).getId()) {

            int opcionActualizar = 0;

            do {

                System.out.println("Ingrese item que desea actualizar: \n");

                System.out.println("1. Nombre del cliente \n"
                        + "2. Edad del cliente \n"
                        + "3. Altura del cliente \n"
                        + "4. Peso del cliente \n"
                        + "5. Objetivo del cliente \n"
                        + "6. Salir del menú \n"
                        + "7. Regresar al menú principal \n");
                opcionActualizar = sc.nextInt();

                System.out.println("");

                switch (opcionActualizar) {
                    case 1:

                        System.out.println("Nombre anterior: " + listaClientes.get(idBuscado - 1).getNombre());
                        System.out.println("Ingrese el nuevo nombre, por favor");
                        listaClientes.get(idBuscado - 1).setNombre(sc.next());
                        System.out.println("El nombre fue cambiado correctamente!! ");
                        System.out.println("Nuevo nombre: " + listaClientes.get(idBuscado - 1).getNombre());

                        break;
                    case 2:

                        System.out.println("Edad anterior: " + listaClientes.get(idBuscado - 1).getEdad());
                        System.out.println("Ingrese nueva edad, por favor");
                        listaClientes.get(idBuscado - 1).setEdad(sc.nextInt());
                        System.out.println("La edad fue cambiada correctamente!! ");
                        System.out.println("Nueva edad: " + listaClientes.get(idBuscado - 1).getEdad());

                        break;
                    case 3:

                        System.out.println("Altura anterior: " + listaClientes.get(idBuscado - 1).getAltura());
                        System.out.println("Ingrese nueva altura, por favor");
                        listaClientes.get(idBuscado - 1).setAltura(sc.nextInt());
                        System.out.println("La altura fue cambiado correctamente!! ");
                        System.out.println("Nueva altura: " + listaClientes.get(idBuscado - 1).getAltura());

                        break;
                    case 4:

                        System.out.println("Peso anterior: " + listaClientes.get(idBuscado - 1).getPeso());
                        System.out.println("Ingrese el nuevo peso, por favor");
                        listaClientes.get(idBuscado - 1).setPeso(sc.nextInt());
                        System.out.println("El peso fue cambiado correctamente!! ");
                        System.out.println("Nuevo peso: " + listaClientes.get(idBuscado - 1).getPeso());

                        break;
                    case 5:

                        System.out.println("Objetivo anterior: " + listaClientes.get(idBuscado - 1).getObjetivo());
                        System.out.println("Ingrese el nuevo nombre, por favor");
                        listaClientes.get(idBuscado - 1).setObjetivo(sc.next());
                        System.out.println("El objetivo fue cambiado correctamente!! ");
                        System.out.println("Nuevo objetivo: " + listaClientes.get(idBuscado - 1).getObjetivo());

                        break;
                    case 6:
                        System.exit(0);
                        break;
                          case 7:
                        // Regresar al menu principal
                              gym.menuGimnasio();
                        break;
                    default:
                        System.out.println("Ingrese una opcion correcta, por favor (1 a 7)");
                        ;
                }

            } while (opcionActualizar != 6);

        }

    }

    public void actualizarItem() {

        // aca quiero que me actualice segun el item q elija (edad, etc) y q sirva p todos
        
    }

    public void eliminarCliente() {

         System.out.println("Ingrese ID del cliente que desea eliminar, por favor");
        int idBuscado = sc.nextInt();
        int clienteAEliminar = idBuscado -1;
        
        if (idBuscado == listaClientes.get(clienteAEliminar).getId()) {
            
            listaClientes.remove(clienteAEliminar);
            System.out.println("El cliente " + listaClientes.get(idBuscado-1) + " ha sido eliminado correctamente!!");
            
        } else {
            System.out.println("El ID ingresado no pertenece a un cliente Activo");
            System.out.println("No ha sido posible eliminarlo");
        }
        
    }

}

//La clase "ServicioCliente" debe tener los siguientes métodos de CRUD:
//registrarCliente: lo registra en el sistema.
//obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
//actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo):
//recibe el identificador de un cliente existente y los nuevos datos del cliente, y actualiza la información 
//correspondiente en el sistema. eliminarCliente(int id): recibe el identificador de un cliente existente y 
//lo elimina del sistema.
