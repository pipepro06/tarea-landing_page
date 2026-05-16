import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantEmpleados;

        int cantidadEmpleados100Y300 = 0;
        int cantidadEmpleadosMayores300 = 0;

        double totalSueldos = 0;

        System.out.print("Ingrese cantidad de empleados: ");
        cantEmpleados = entrada.nextInt();

        double[] sueldos = new double[cantEmpleados];

        for (int i = 0; i < cantEmpleados; i++) {

            System.out.print("Ingrese sueldo " + (i + 1) + ": ");
            sueldos[i] = entrada.nextDouble();

            totalSueldos += sueldos[i];

            if (sueldos[i] >= 100 && sueldos[i] <= 300) {

                cantidadEmpleados100Y300++;

            } else if (sueldos[i] > 300) {

                cantidadEmpleadosMayores300++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Empleados entre 100 y 300: "
                + cantidadEmpleados100Y300);

        System.out.println("Empleados mayores a 300: "
                + cantidadEmpleadosMayores300);

        System.out.println("Total sueldos: "
                + totalSueldos);

    }
}