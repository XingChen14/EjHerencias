public class Auxiliar extends Empleado {
    private String area;
    private double bonoXasistencia;
    private int asistencia;

    public Auxiliar(String nombre, double sueldo, int antiguedad, String area, int asistencia) {
        super(nombre, sueldo, antiguedad);
        this.area = area;
        this.asistencia = asistencia;
    }

    public double calcularBonoAsistencia() {
        bonoXasistencia = (sueldo / 30) * asistencia * 0.10;
        return bonoXasistencia;
    }

    // Getters
    public String getArea() {
        return area;
    }

    public double getBonoXasistencia() {
        return calcularBonoAsistencia(); 
    }

    public int getAsistencia() {
        return asistencia;
    }

    // Setters
    public void setArea(String area) {
        this.area = area;
    }

    public void setAsistencia(int asistencia) {
        this.asistencia = asistencia;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nPuesto: Auxiliar\nNombre: " + nombre +
               "\nSueldo: " + sueldo + "\nÁrea: " + area +
               "\nBono Asistencial: " + getBonoXasistencia() +
               "\nDías de Vacaciones: " + calcularDiasVacaciones() + "\n---";
    }
}
