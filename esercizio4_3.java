import java.util.Scanner;

public class esercizio4_3 {
    public static void main(String[] args) {
        Scanner stringa = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = stringa.nextLine();

        String stringaInvertita = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            stringaInvertita += input.charAt(i);  
        }

        System.out.println("La stringa invertita è: " + stringaInvertita);

    }
}
