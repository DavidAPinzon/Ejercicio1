public class EmpleadoPlanta extends Empleado {
    private double salario;

    public EmpleadoPlanta (String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salario = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return salario;
    }
}
