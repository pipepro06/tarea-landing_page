import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        int cantidadPersonas18Y30 = 0;
        int cantidadPersonasMayores30 = 0;

        int totalEdades = 0;

        System.out.print("Ingrese cantidad de personas: ");
        n = entrada.nextInt();

        int[] edades = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Ingrese edad " + (i + 1) + ": ");
            edades[i] = entrada.nextInt();

            totalEdades += edades[i];

            if (edades[i] >= 18 && edades[i] <= 30) {

                cantidadPersonas18Y30++;

            } else if (edades[i] > 30) {

                cantidadPersonasMayores30++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Entre 18 y 30: "
                + cantidadPersonas18Y30);

        System.out.println("Mayores de 30: "
                + cantidadPersonasMayores30);

        System.out.println("Suma total edades: "
                + totalEdades);

    }
}