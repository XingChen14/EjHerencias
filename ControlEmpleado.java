import java.util.*;

public class ControlEmpleado {
    private ArrayList<Empleado> empleados;

    public ControlEmpleado() {
        empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }
/* 
    public void eliminarEmpleado(Empleado empleado) {
        empleados.remove(empleado);
    }
*/
    public String mostrar_por_Dia_Vacacion() {
        ArrayList<Empleado> empleadosOrdenados = new ArrayList<>(empleados);
        
        // Ordenar empleados por días de vacaciones en orden descendente
        empleadosOrdenados.sort(Comparator.comparingInt(Empleado::calcularDiasVacaciones).reversed());

        StringBuilder sb = new StringBuilder();
        sb.append("Lista de empleados por días de vacaciones:\n\n");
        for (Empleado empleado : empleadosOrdenados) {
            sb.append(empleado.toString())
              .append("\n");
        }
        return sb.toString();
    }

    public String mostrar_por_ID_Empleados() {
        StringBuilder sb = new StringBuilder();
        sb.append("Lista de empleados por ID:\n\n");
        for (Empleado empleado : empleados) {
            sb.append(empleado.toString()).append("\n");
        }
        return sb.toString();
    }
}
