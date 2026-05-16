import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int cantidadClientes;

        int cantidadClientes20kY100k = 0;
        int cantidadClientesMayores100k = 0;

        double totalRecaudado = 0;

        System.out.print("Ingrese cantidad de clientes: ");
        cantidadClientes = entrada.nextInt();

        double[] gastos = new double[cantidadClientes];

        for (int i = 0; i < cantidadClientes; i++) {

            System.out.print("Ingrese gasto del cliente " + (i + 1) + ": ");
            gastos[i] = entrada.nextDouble();

            totalRecaudado += gastos[i];

            if (gastos[i] >= 20000 && gastos[i] <= 100000) {

                cantidadClientes20kY100k++;

            } else if (gastos[i] > 100000) {

                cantidadClientesMayores100k++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Clientes entre 20000 y 100000: " + cantidadClientes20kY100k);
        System.out.println("Clientes mayores a 100000: " + cantidadClientesMayores100k);
        System.out.println("Total recibido: " + totalRecaudado);

    }
}