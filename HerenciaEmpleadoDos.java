import java.util.Scanner;

public class HerenciaEmpleadoDos {
    public static void main(String[] args) {
        int opc;
        Scanner entrada = new Scanner(System.in);
        ControlEmpleado control = new ControlEmpleado();

        do {
            System.out.println("\t\tMenu");
            System.out.println("1. Registrar empleado");
            System.out.println("2. Mostrar por ID empleados");
            System.out.println("3. Mostrar por Días Vacacionales");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opc = entrada.nextInt();
            entrada.nextLine(); // Limpia el buffer de entrada

            switch(opc) {
                case 1 -> {
                    String nombre;
                    double sueldo;
                    int antiguedad;
                    double bono;
                    String area;
                    int asistencia;

                    System.out.println("Registrar empleado");
                    Jefe jefe = new Jefe("Ana Chen", 10000, 15, 4000);
                    control.agregarEmpleado(jefe);

                    Auxiliar auxiliar = new Auxiliar("Manuel Chen", 6001, 30, "Contable", 30);
                    control.agregarEmpleado(auxiliar);


                    /*
                    System.out.print("1. Jefe\n2. Auxiliar\n > ");
                    int opc2 = entrada.nextInt();
                    entrada.nextLine(); // Limpia el buffer de entrada después de leer el int
                    
                    if (opc2 == 1 || opc2 == 2) {
                        System.out.print("Nombre: ");
                        nombre = entrada.nextLine(); // Permite capturar nombres con espacios
                        System.out.print("Sueldo Mensual: ");
                        sueldo = entrada.nextDouble();
                        System.out.print("Antigüedad (en años): ");
                        antiguedad = entrada.nextInt();
                        entrada.nextLine(); // Limpia el buffer de entrada

                        switch (opc2) {
                            case 1 -> {
                                System.out.print("Bono: ");
                                bono = entrada.nextDouble();
                                Jefe jefe = new Jefe(nombre, sueldo, antiguedad, bono);
                                control.agregarEmpleado(jefe);
                                System.out.println("Jefe registrado exitosamente.");
                            }
                            case 2 -> {
                                System.out.print("Área: ");
                                area = entrada.next();
                                System.out.print("Asistencia (días): ");
                                asistencia = entrada.nextInt();
                                Auxiliar auxiliar = new Auxiliar(nombre, sueldo, antiguedad, area, asistencia);
                                control.agregarEmpleado(auxiliar);
                                System.out.println("Auxiliar registrado exitosamente.");
                            }
                        }
                    } else {
                        System.out.println("Opción inválida. Regresando al menú principal...");
                    } */
                }

                case 2 -> System.out.println(control.mostrar_por_ID_Empleados());
                case 3 -> System.out.println(control.mostrar_por_Dia_Vacacion());
                case 4 -> System.out.println("Saliendo del programa.");
                default -> System.out.println("Opción inválida\n");
            }
        } while(opc != 4);
    }
}
