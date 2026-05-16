import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;
        int cantidadNotas3Y4 = 0;
        int cantidadNotasMayores4 = 0;
        double totalNotas = 0;

        System.out.print("Ingrese cantidad de estudiantes: ");
        n = entrada.nextInt();

        double[] notas = new double[n];

        for(int i = 0; i < n; i++){

            System.out.print("Ingrese nota " + (i+1) + ": ");
            notas[i] = entrada.nextDouble();

            totalNotas += notas[i];

            if(notas[i] >= 3 && notas[i] <= 4){

                cantidadNotas3Y4++;

            }else if(notas[i] > 4){

                cantidadNotasMayores4++;

            }

        }

        System.out.println("\nRESULTADOS");
        System.out.println("Notas entre 3 y 4: " + cantidadNotas3Y4);
        System.out.println("Notas mayores a 4: " + cantidadNotasMayores4);
        System.out.println("Total notas: " + totalNotas);

    }
}