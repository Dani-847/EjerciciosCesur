package Programacion.Examenes.prExamen28_11_2024.src.ejercicio1;

public class GestionEmpleados {
    public static void main(String[] args) {
        // Crear instancias de empleados
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("Juan Pérez", 2000);
        EmpleadoPorHora empleadoPorHora = new EmpleadoPorHora("María Gómez");
        EmpleadoFreelancer empleadoFreelancer = new EmpleadoFreelancer("Pedro López", 4);

        // Mostrar información y comportamiento
        empleadoTiempoCompleto.infoEmpleado();
        empleadoTiempoCompleto.trabajar();
        System.out.println("Salario total: " + empleadoTiempoCompleto.calcularSalario()+"€");
        System.out.println();

        empleadoPorHora.infoEmpleado();
        empleadoPorHora.trabajar();
        System.out.println("Salario total (tarifa de $20.0/hora, 40 horas): " + empleadoPorHora.calcularSalario(40, 20.0)+"€");
        System.out.println("Salario total (tarifa de $25.0/hora, 30 horas): " + empleadoPorHora.calcularSalario(30, 25.0)+"€");
        System.out.println();

        empleadoFreelancer.infoEmpleado();
        empleadoFreelancer.trabajar();
        System.out.println("Salario total (4 proyectos): " + empleadoFreelancer.calcularSalario()+"€");
    }
}
