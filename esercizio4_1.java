import java.util.Scanner;

public class esercizio4_1 {
    public static void main(String[] args) {
        Scanner scanner3 = new Scanner(System.in);

        System.out.print("Inserisci il valore di n: ");
        int n = scanner3.nextInt();

        int somma = 0;
        int numeroDispari = 1; 

        for (int i = 0; i < n; i++) {
            somma += numeroDispari;  
            numeroDispari += 2;       
        }

        System.out.println("La somma dei primi " + n + " numeri dispari è: " + somma);

    }
}
