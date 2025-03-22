public class Empleado {
    protected String nombre;
    protected int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public double calcularSalario() {
        return 0;
    }

    public String obtenerInformacion() {
        return "Nombre: " + nombre + " Edad: " + edad + " Salario: $" + calcularSalario();
    }
}
