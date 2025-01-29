import java.util.Scanner;
public class esercizio3_3 {

    public static void main(String[] args) {
        Scanner risposta2 = new Scanner(System.in);
        
        System.out.print("Rispondi con 'si' o 'no': ");
        String risposta = risposta2.nextLine().toLowerCase(); 
        boolean accettato = false;

        if (risposta.equals("si") || risposta.equals("s")) {
            accettato = true;  

        System.out.println("Risposta accettata: " + accettato);

    }
    else if(risposta.equals("no") || risposta.equals("n")){
        System.out.println("Risposta accettata: " + accettato);

    }
}
}