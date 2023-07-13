package Services;

import Entidades.Gimnasio;
import java.util.Scanner;

public class GimnasioService {

    ClienteService cliS = new ClienteService();
    RutinaService rutiS = new RutinaService();

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void menuGimnasio() {

        int menuPpal = 0;

        do {
            String opciones = "Ingrese opcion: \n";
            String model1 = "1. Registrar Cliente \n";
            String model2 = (!cliS.hayClientes())?"":"2. Obtener Clientes \n3. Actualizar Cliente \n4. Eliminar Cliente \n";
            String model3 = "5. Crear Rutina \n";
            String model4 = (!rutiS.hayRutinas())?"":"6. Obtener Rutinas \n7. Actualizar Rutinas \n8. Eliminar Rutina \n";
            
            System.out.println(opciones+model1+model2+model3+model4);

            menuPpal = sc.nextInt();

            switch (menuPpal) {
                case 1:
                    cliS.registrarCliente();
                    break;
                case 2:
                    if (cliS.hayClientes())
                   // if(cliS.registrarCliente()) Necesito chequear que ya hay algun cliente registrado
                        cliS.obtenerClientes();
                    else
                        System.out.println("Opcion invalida.");
                    break;
                case 3:
                    if (cliS.hayClientes())
                    cliS.actualizarCliente(); // Necesito chequear que ya hay algun cliente registrado
                    else
                        System.out.println("Opcion invalida.");
                    break;
                case 4:
                    if (cliS.hayClientes())
                        cliS.eliminarCliente(); // Necesito chequear que ya hay algun cliente registrado
                    else
                        System.out.println("Opcion Invalida");
                    break;
                case 5:
                    rutiS.crearRutina();
                    break;
                case 6:
                    if (rutiS.hayRutinas())
                        rutiS.obtenerRutinas();
                    else
                        System.out.println("Opcion Invalida");
                    break;
                case 7:
                    if (rutiS.hayRutinas())
                        rutiS.actualizarRutinas();
                    else
                        System.out.println("Opcion Invalida");
                    break;
                case 8:
                    if (rutiS.hayRutinas())
                        rutiS.eliminarRutinas();
                    else
                        System.out.println("Opcion Invalida");
                    break;
                case 9:
                    System.exit(0);  // Para salir del menu
                    break;

                default:
                    System.out.println("Ingrese una opcion correcta, por favor (1 a 8)");
            }

        } while (menuPpal > 0 && menuPpal < 10);

    }

}
