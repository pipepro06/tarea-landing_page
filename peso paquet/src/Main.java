import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadPaquetes;

        int cantidadPaquetes1Y20 = 0;
        int cantidadPaquetesMayores20 = 0;

        double totalPeso = 0;

        System.out.print("Ingrese cantidad de paquetes: ");
        cantidadPaquetes = entrada.nextInt();

        double[] pesos = new double[cantidadPaquetes];

        for (int i = 0; i < cantidadPaquetes; i++) {

            System.out.print("Ingrese peso del paquete " + (i + 1) + ": ");
            pesos[i] = entrada.nextDouble();

            totalPeso += pesos[i];

            if (pesos[i] >= 1 && pesos[i] <= 20) {

                cantidadPaquetes1Y20++;

            } else if (pesos[i] > 20) {

                cantidadPaquetesMayores20++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Paquetes entre 1 y 20 kg: " + cantidadPaquetes1Y20);
        System.out.println("Paquetes mayores a 20 kg: " + cantidadPaquetesMayores20);
        System.out.println("Peso total: " + totalPeso);

    }
}