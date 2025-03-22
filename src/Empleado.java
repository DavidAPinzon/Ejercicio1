public class Empleado {
    private String nombre;
    private int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double calcularSalario() {
        return 0;
    }

    public String obtenerInformacion() {
        return "Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Salario: " + calcularSalario();
    }
}