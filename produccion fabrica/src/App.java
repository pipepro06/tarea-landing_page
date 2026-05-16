import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadOperarios;

        int cantidadOperarios10Y100 = 0;
        int cantidadOperariosMayores100 = 0;

        int totalProduccion = 0;

        System.out.print("Ingrese cantidad de operarios: ");
        cantidadOperarios = entrada.nextInt();

        int[] produccion = new int[cantidadOperarios];

        for (int i = 0; i < cantidadOperarios; i++) {

            System.out.print("Ingrese producción del operario " + (i + 1) + ": ");
            produccion[i] = entrada.nextInt();

            totalProduccion += produccion[i];

            if (produccion[i] >= 10 && produccion[i] <= 100) {

                cantidadOperarios10Y100++;

            } else if (produccion[i] > 100) {

                cantidadOperariosMayores100++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Operarios entre 10 y 100: " + cantidadOperarios10Y100);
        System.out.println("Operarios mayores a 100: " + cantidadOperariosMayores100);
        System.out.println("Producción total: " + totalProduccion);

    }
}