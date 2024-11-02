public class Empleado {
    protected String nombre;
    protected double sueldo;
    protected  int id;
    private static int contadorID = 1;
    protected int antiguedad;

    public Empleado(String nombre, double sueldo, int antiguedad) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.id = contadorID++;
    }

    //Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    //Getter
    public String getNombre() {
        return nombre;
    }
    public double getSueldo() {
        return sueldo;
    }
    public int getId() {
        return id;
    }
    public int getAntiguedad() {
        return antiguedad;
    }

    public int calcularDiasVacaciones() {
        int numeroDias = 0;

        if (antiguedad == 1) return 12;
        else if (antiguedad == 2) return 14;
        else if (antiguedad == 3) return 16;
        else if (antiguedad == 4) return 18;
        else if (antiguedad == 5) return 20;
        else if (antiguedad >= 6 && antiguedad <= 10) return 22;
        else if (antiguedad >= 11 && antiguedad <= 15) return 24;
        else if (antiguedad >= 16 && antiguedad <= 20) return 26;
        else if (antiguedad >= 21 && antiguedad <= 25) return 28;
        else if (antiguedad >= 26 && antiguedad <= 30) return 30;
        else if (antiguedad >= 31) return 32;
        return 0;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\nNombre: " + nombre + "\nSueldo: " + sueldo +
               "\nDías de Vacaciones: " + calcularDiasVacaciones();
    }
}
