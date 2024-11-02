
public class Jefe extends Empleado {
    private double bono;

    public Jefe(String nombre, double sueldo, int antiguedad, double bono) {
        super(nombre, sueldo, antiguedad);
        this.bono = bono;
    }

    //Get
    public double getBono() {
        return bono;
    }
    //Set
    public void setBono(double bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nPuesto: Jefe\nNombre: " + nombre +
               "\nSueldo: " + sueldo + "\nBono: " + bono +
               "\nDías de Vacaciones: " + calcularDiasVacaciones() + "\n---";
    }
}
