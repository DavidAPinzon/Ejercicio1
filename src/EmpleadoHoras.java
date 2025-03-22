public class EmpleadoHoras extends Empleado {
    private double pagohora;
    private double horas;

    public EmpleadoHoras (String nombre,int edad, double pagohora, double horas) {
        super(nombre, edad);
        this.pagohora = pagohora;
        this.horas = horas;
    }

    @Override
    public double calcularSalario() {
        return pagohora * horas;
    }
}
