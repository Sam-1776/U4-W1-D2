//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 2");
        System.out.println(stampaNumero(4));

    }

    private static String stampaNumero(int x){
        int z = x;
        switch (z){
            case 0:{
                String risp = "zero";
                return risp;
            }
            case 1:{
                String risp = "uno";
                return risp;
            }
            case 2:{
                String risp = "due";
                return risp;
            }
            case 3:{
                String risp = "tre";
                return risp;
            }
            default: {
                String risp = "Errore il numero non è compreso tra 0 e 3";
                return risp;
            }
        }
    }
}