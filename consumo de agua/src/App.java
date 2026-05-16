import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int cantidad1Y50 = 0;
        int cantidadMayores50 = 0;
        double total = 0;

        System.out.print("Cantidad apartamentos: ");
        n = entrada.nextInt();

        double[] consumos = new double[n];

        for(int i = 0; i < n; i++){

            System.out.print("Consumo " + (i+1) + ": ");
            consumos[i] = entrada.nextDouble();

            total += consumos[i];

            if(consumos[i] >= 1 && consumos[i] <= 50){

                cantidad1Y50++;

            }else if(consumos[i] > 50){

                cantidadMayores50++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Entre 1 y 50: " + cantidad1Y50);
        System.out.println("Mayores a 50: " + cantidadMayores50);
        System.out.println("Total: " + total);

    }
}