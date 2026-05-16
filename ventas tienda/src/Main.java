import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int cantidadVentas50Y500 = 0;
        int cantidadVentasMayores500 = 0;
        double totalVentas = 0;

        System.out.print("Ingrese cantidad de ventas: ");
        n = entrada.nextInt();

        double[] ventas = new double[n];

        for(int i = 0; i < n; i++){

            System.out.print("Ingrese venta " + (i+1) + ": ");
            ventas[i] = entrada.nextDouble();

            totalVentas += ventas[i];

            if(ventas[i] >= 50 && ventas[i] <= 500){

                cantidadVentas50Y500++;

            }else if(ventas[i] > 500){

                cantidadVentasMayores500++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Ventas entre 50 y 500: " + cantidadVentas50Y500);
        System.out.println("Ventas mayores a 500: " + cantidadVentasMayores500);
        System.out.println("Total vendido: " + totalVentas);

    }
}