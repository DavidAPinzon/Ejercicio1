class EmpleadoHoras extends Empleado {
    private double pagoHora;
    private double horasTrabajadas;

    public EmpleadoHoras(String nombre, int edad, double pagoHora, double horasTrabajadas) {
        super(nombre, edad);
        this.pagoHora = pagoHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return getPagoHora() * getHorasTrabajadas();
    }
}