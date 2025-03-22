import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Empleados ---");
            System.out.println("1. Registrar empleado de planta");
            System.out.println("2. Registrar empleado por horas");
            System.out.println("3. Mostrar todos los empleados");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    registrarEmpleadoPlanta(listaEmpleados, scanner);
                    break;
                case 2:
                    registrarEmpleadoHoras(listaEmpleados, scanner);
                    break;
                case 3:
                    mostrarEmpleados(listaEmpleados);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static void registrarEmpleadoPlanta(List<Empleado> listaEmpleados, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        listaEmpleados.add(new EmpleadoPlanta(nombre, edad, 2100000.0));
        System.out.println("Empleado de planta registrado.");
    }

    private static void registrarEmpleadoHoras(List<Empleado> listaEmpleados, Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese el pago por hora: ");
        double pagoHora = scanner.nextDouble();
        System.out.print("Ingrese las horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        listaEmpleados.add(new EmpleadoHoras(nombre, edad, pagoHora, horasTrabajadas));
        System.out.println("Empleado por horas registrado.");
    }

    private static void mostrarEmpleados(List<Empleado> listaEmpleados) {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado.obtenerInformacion());
            }
        }
    }
}