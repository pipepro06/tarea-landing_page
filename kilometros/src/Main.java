import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadVehiculos;

        int cantidadVehiculos10Y300 = 0;
        int cantidadVehiculosMayores300 = 0;

        double totalKilometros = 0;

        System.out.print("Ingrese cantidad de vehículos: ");
        cantidadVehiculos = entrada.nextInt();

        double[] kilometros = new double[cantidadVehiculos];

        for (int i = 0; i < cantidadVehiculos; i++) {

            System.out.print("Ingrese kilómetros del vehículo " + (i + 1) + ": ");
            kilometros[i] = entrada.nextDouble();

            totalKilometros += kilometros[i];

            if (kilometros[i] >= 10 && kilometros[i] <= 300) {

                cantidadVehiculos10Y300++;

            } else if (kilometros[i] > 300) {

                cantidadVehiculosMayores300++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Vehículos entre 10 y 300 km: " + cantidadVehiculos10Y300);
        System.out.println("Vehículos mayores a 300 km: " + cantidadVehiculosMayores300);
        System.out.println("Total kilómetros: " + totalKilometros);

    }
}