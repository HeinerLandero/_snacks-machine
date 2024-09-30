package machine_snacks_files.presentation;

import machine_snacks_files.domain.Snack;
import machine_snacks_files.services.ISnacksServices;
import machine_snacks_files.services.ListSnacksServices;
import machine_snacks_files.services.ServicesSnacksFiles;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void printer(Object mensaje) {
        System.out.println(mensaje);
    }

    public static void maquinaSnacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        //Created object for snacks services
        //ISnacksServices serviceSnacks = new ListSnacksServices();
        ISnacksServices serviceSnacks = new ServicesSnacksFiles();

        List<Snack> productos = new ArrayList<>();
        printer("*** Snacks's Machine ***");
        serviceSnacks.showSnacks();// Displayed the inventory
        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, serviceSnacks);
            }catch (Exception e){
                printer("Ha ocurrido un error . . .");
            }finally {
                printer("Peticion en proceso");
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        printer("""
                Menu:
                1. Comprar Snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elije una opcion ... \s""");
        //Leemos las opciones y retornamos la opcion seleccionada
        return  Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos, ISnacksServices serviceSnacks){
        var salir = false;
        switch (opcion){
            case  1 -> comprarSnack(consola , productos , serviceSnacks);
            case  2 -> mostrarTicket(productos);
            case  3 -> agregarSnack(consola , serviceSnacks);
            case  4 -> {
              printer("Gracias por usar nuestro servicio, vuelve pronto");
              salir = true;
            }
            default -> printer("Opcion invalida" + opcion);
        }
        return salir;
    }

    public static void comprarSnack(Scanner consola,
                                    List<Snack> productos, ISnacksServices serviceSnacks ){
        printer("Que Snack desea comprar(id)? : ");
        var idSnack = Integer.parseInt(consola.nextLine());
        //Validamos que el snack seleccionado exista ..
        var snackEncontrado = false;
        for (var snack : serviceSnacks.getSnacks()){
            if(idSnack == snack.getId_snack()){
                //Se agrega el snack a la lista
                productos.add(snack);
                printer("Ok, Snack agregado " + snack );
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            printer("Id de Snack no encontrado " + idSnack);
        }
    }
    public static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de venta ***";
        var total = 0.0;
        for(var producto: productos){
            ticket += "\n\t- " + producto.getNombre() + " - $" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $ " + total;
        printer(ticket);
    }

    public static void agregarSnack(Scanner consola, ISnacksServices serviceSnacks){
        printer("Nombre del snack :");
        var nombre = consola.nextLine();
        printer("Precio del snack :");
        double precio = Double.parseDouble(consola.nextLine());
        serviceSnacks.addSnacks(new Snack(nombre , precio));
        printer("Tu snack se agrego exitosamente!");
        serviceSnacks.showSnacks();
    }
}



