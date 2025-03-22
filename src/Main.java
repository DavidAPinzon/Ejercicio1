import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) {
        List<Empleado> listaEmpleados = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("""
                    ------Menú de Empleados------
                    1.Registrar empleado de planta
                    2.Registrar empleado por horas
                    3.Mostrar todos los empleados
                    4.Salir
                    
                    Ingrese una opción""");
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
                    System.out.println("Opción inválida");
            }
        } while (opcion !=4);
        scanner.close();
    }
    private static void registrarEmpleadoPlanta(List<Empleado> listaEmpleados, Scanner scanner) {
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        listaEmpleados.add(new EmpleadoPlanta(nombre, edad, 1423500));
        System.out.println("Empleado registrado");
    }
    private static void registrarEmpleadoHoras(List<Empleado> listaEmpleados, Scanner scanner) {
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();
        System.out.println("Ingrese las horas trabajadas: ");
        double horas = scanner.nextDouble();
        listaEmpleados.add(new EmpleadoHoras(nombre, edad, 98000, horas));
        System.out.println("Empleado registrado");
    }
    private static void mostrarEmpleados(List<Empleado> litsaEmpleados) {
            System.out.println("Lista empleados");
            for (Empleado empleado : litsaEmpleados) {
                System.out.println(empleado.obtenerInformacion());
            }
    }
}