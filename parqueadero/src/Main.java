import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadVehiculos;

        int cantidadVehiculos2kY20k = 0;
        int cantidadVehiculosMayores20k = 0;

        double totalRecaudado = 0;

        System.out.print("Ingrese cantidad de vehículos: ");
        cantidadVehiculos = entrada.nextInt();

        double[] pagos = new double[cantidadVehiculos];

        for (int i = 0; i < cantidadVehiculos; i++) {

            System.out.print("Ingrese pago del vehículo " + (i + 1) + ": ");
            pagos[i] = entrada.nextDouble();

            totalRecaudado += pagos[i];

            if (pagos[i] >= 2000 && pagos[i] <= 20000) {

                cantidadVehiculos2kY20k++;

            } else if (pagos[i] > 20000) {

                cantidadVehiculosMayores20k++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Vehículos entre 2000 y 20000: " + cantidadVehiculos2kY20k);
        System.out.println("Vehículos mayores a 20000: " + cantidadVehiculosMayores20k);
        System.out.println("Total recaudado: " + totalRecaudado);

    }
}