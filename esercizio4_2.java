import java.util.Scanner;

public class esercizio4_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();

        int contaSpazi = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                contaSpazi++;
            }
        }

        System.out.println("Il numero di spazi nella stringa è: " + contaSpazi);

    }
}
