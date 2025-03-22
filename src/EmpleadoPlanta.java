class EmpleadoPlanta extends Empleado {
    private double salarioFijo;

    public EmpleadoPlanta(String nombre, int edad, double salarioFijo) {
        super(nombre, edad);
        this.salarioFijo = salarioFijo;
    }

    public double getSalarioFijo() {
        return salarioFijo;
    }

    public void setSalarioFijo(double salarioFijo) {
        this.salarioFijo = salarioFijo;
    }

    @Override
    public double calcularSalario() {
        return getSalarioFijo();
    }
}