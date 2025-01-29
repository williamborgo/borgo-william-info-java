public class Esercizio3_1 {
    public static void main(String[] args) {
        
        // scrivere un frammento di codice che verifichi che la variable intera punteggio contenga
        // un valore valido.
        // si supponga che i valori validi siano compresi tra 1 e 100 
        
        int punteggio = 85; 

        if (punteggio >= 1 && punteggio <= 100) {
            System.out.println("Il punteggio è valido: " + punteggio);
        } else {
            System.out.println("Il punteggio non è valido.");
        }
    }
}
